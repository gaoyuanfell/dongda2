package moka.user.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.basic.util.Util;
import moka.company.bo.Company;
import moka.company.dao.CompanyDao;
import moka.company.enums.CompanyEnum;
import moka.company.service.CompanyService;
import moka.company.vo.CompanyVo;
import moka.department.bo.Department;
import moka.department.dao.DepartmentDao;
import moka.department.service.DepartmentService;
import moka.menu.dao.MenuDao;
import moka.menu.to.MenuTo;
import moka.role.enums.RoleEnum;
import moka.role.service.RoleService;
import moka.role.to.RoleUserCompanyTo;
import moka.role.vo.RoleUserCompanyVo;
import moka.role.vo.RoleVo;
import moka.user.bo.User;
import moka.user.dao.UserDao;
import moka.user.enums.UserEnum;
import moka.user.to.UserTo;
import moka.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by moka on 2017/3/6 0006.
 */
@Service("userService")
public class UserServiceImpl extends BasicServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Resource
    private CompanyService companyService;
    @Resource
    private DepartmentService departmentService;
    @Resource
    private RoleService roleService;
    @Resource
    private MenuDao menuDao;

    @Value("#{propertyConfigurer['data_password_salt']}")
    private String DATA_PASSWORD_SALT;
    @Value("#{propertyConfigurer['data_password_default']}")
    private String DATA_PASSWORD_DEFAULT;

    @Override
    public String insert(UserVo vo) {
        User user = this.convertBusinessValue(vo, User.class);

        //初始化公司
        String uuid = Util.Md516();
        CompanyVo companyVo = new CompanyVo();
        companyVo.setApplicationId(uuid);
        companyVo.setCompanyBelong(CompanyEnum.inside.getValue());
        companyVo.setCompanyType(CompanyEnum.ordinaryType.getValue());
        String companyId = companyService.insert(companyVo);
        
        //初始化部门
        Department department =new Department();
        department.setId(Util.Md516());
        department.setApplicationId(uuid);
        department.setPosition("管理员");
        department.setName(companyVo.getCompanyName());
        department.setCompanyId(companyId);
        departmentService.insert(department);
        
        user.setApplicationId(uuid);
        user.setName(UserEnum.adminName.getValue());
        user.setEmployeeNo("1");
        user.setCreateDate(new Date());
        user.setReadOnly(UserEnum.watchOnly.getValue());
        user.setPassword(Util.getMd5String(user.getPassword().concat(DATA_PASSWORD_SALT)));
        userDao.insert(user);

        //插入默认管理员角色
        RoleVo roleVo = new RoleVo();
        roleVo.setName("管理员");
        roleVo.setApplicationId(uuid);
        roleVo.setReadOnly(RoleEnum.readOnly.getValue());
        String roleId = roleService.insert(roleVo);

        //角色关联菜单
        List<MenuTo> menuTo = menuDao.findList();
        List<RoleVo> roleList = new ArrayList<>();
        for (MenuTo t : menuTo){
            RoleVo v = new RoleVo();
            v.setRoleId(roleId);
            v.setMenuId(t.getId());
            roleList.add(v);
        }
        roleService.insertMenuOfRole(roleList);

        //用户初始化角色用户公司关联对象
        List<String> roles = new ArrayList<>();
        roles.add(roleId);
        vo.setRoles(roles);
        List<RoleUserCompanyVo> userCompanies = new ArrayList<>();
        RoleUserCompanyVo userCompany = new RoleUserCompanyVo();
        userCompany.setCompanyId(companyId);
        userCompany.setRoleId(roles);
        userCompanies.add(userCompany);
        roleService.insertRoleOfUser(user.getId(),userCompanies);
        
        return user.getId();
    }

    @Override
    public String insertSysUser(UserVo vo) {
        User user = this.convertBusinessValue(vo, User.class);
        user.setCreateDate(new Date());
        user.setPassword(Util.getMd5String(Util.getMd5String(DATA_PASSWORD_DEFAULT).concat(DATA_PASSWORD_SALT)));
        userDao.insert(user);
        String userId = user.getId();
        if(!StringUtils.isEmpty(userId)){
            //关联直属领导
            if(!StringUtils.isEmpty(vo.getLeaderId()) && !vo.getLeaderId().equals(userId)){
                this.insertLeaderRelation(vo);
            }
            //关联角色
            if(vo.getRoleUserCompanies() != null && vo.getRoleUserCompanies().size() > 0){
                roleService.insertRoleOfUser(userId,vo.getRoleUserCompanies());
            }
        }
        return userId;
    }

    @Override
    public int update(UserVo vo) {
        User user = this.convertBusinessValue(vo, User.class);
        user.setUpdateDate(new Date());
        String userId = vo.getId();
        if(!StringUtils.isEmpty(userId)){
            //关联直属领导
            if(!StringUtils.isEmpty(vo.getLeaderId())){
                this.insertLeaderRelation(vo);
            }
            //关联角色
            if(vo.getRoleUserCompanies() != null && vo.getRoleUserCompanies().size() > 0){
                roleService.insertRoleOfUser(userId,vo.getRoleUserCompanies());
            }
        }
        return userDao.update(user);
    }

    @Override
    public int delete(String id) {
        roleService.deleteRoleOfUser(id);
        return userDao.delete(id);
    }

    @Override
    public UserTo findOne(String id) {
        return userDao.findOne(id);
    }

    @Override
    public UserTo findOneAll(String id) {
        UserTo to = userDao.findOne(id);
        List<RoleUserCompanyTo> roleUserCompanyTos = this.findCompanyRoleByUserId(id);
        /**
         * 获取同公司的角色
         */
        HashMap<String,RoleUserCompanyVo> m = new HashMap<>();
        for (RoleUserCompanyTo userCompanyTo:roleUserCompanyTos){
            String companyId = userCompanyTo.getCompanyId();
            RoleUserCompanyVo roles = m.get(companyId);
            if(roles == null){
                roles = new RoleUserCompanyVo();
            }
            roles.setCompanyId(companyId);
            if(roles.getRoleId() == null){
                roles.setRoleId(new ArrayList<String>());
            }
            roles.getRoleId().add(userCompanyTo.getRoleId());
            roles.setCompanyName(userCompanyTo.getCompanyName());
            m.put(companyId,roles);
        }

        List<RoleUserCompanyVo> roleUserCompanyVos = new ArrayList<>();
        List<String> companyIds = new ArrayList<>();
        for (String key : m.keySet()){
            roleUserCompanyVos.add(m.get(key));
            companyIds.add(key);
        }

        to.setRoleUserCompanies(roleUserCompanyVos);
        to.setCompanyIds(companyIds);
        return to;
    }

    @Override
    public Page findPage(UserVo vo) {
        List list = userDao.findPage(vo);
        int totalCount = userDao.findCount(vo);
        return new Page(vo.getPageIndex(),vo.getPageSize(),totalCount, list);
    }

    @Override
    public List findList(UserVo vo) {
        return userDao.findList(vo);
    }

    @Override
    public UserTo login(UserVo vo) {
        return userDao.login(vo);
    }

    @Override
    public int findRepeatUser(UserVo vo) {
        return userDao.findRepeatUser(vo);
    }

    @Override
    public int checkPhone(UserVo vo) {
        return userDao.checkPhone(vo);
    }

    @Override
    public int checkEmail(UserVo vo) {
        return userDao.checkEmail(vo);
    }

    @Override
    public List<UserTo> findUseSelect(UserVo vo) {
        return userDao.findUseSelect(vo);
    }

    @Override
    public List<UserTo> findSelectByCompanyId(String companyId) {
        return userDao.findSelectByCompanyId(companyId);
    }

    @Override
    public int insertLeaderRelation(UserVo vo) {
        userDao.deleteLeaderRelation(vo);
        return userDao.insertLeaderRelation(vo);
    }

    @Override
    public int deleteLeaderRelation(UserVo vo) {
        return userDao.deleteLeaderRelation(vo);
    }

    @Override
    public List<RoleUserCompanyTo> findCompanyRoleByUserId(String userId) {
        return userDao.findCompanyRoleByUserId(userId);
    }

    @Override
    public List<String> findUserLeader(String userId) {
        List<String> l = userDao.findUserLeader(userId);
        l.add(userId);
        return l;
    }
}
