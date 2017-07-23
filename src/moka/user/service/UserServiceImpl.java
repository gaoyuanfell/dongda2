package moka.user.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.basic.util.Util;
import moka.company.bo.Company;
import moka.company.dao.CompanyDao;
import moka.menu.dao.MenuDao;
import moka.menu.to.MenuTo;
import moka.role.enums.RoleEnum;
import moka.role.service.RoleService;
import moka.role.to.RoleTo;
import moka.role.vo.RoleVo;
import moka.user.bo.User;
import moka.user.dao.UserDao;
import moka.user.to.UserTo;
import moka.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by moka on 2017/3/6 0006.
 */
@Service("userService")
public class UserServiceImpl extends BasicServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
//    @Resource
//    private CompanyDao companyDao;
    @Resource
    private RoleService roleService;
    @Resource
    private MenuDao menuDao;

    @Value("#{propertyConfigurer['data_password_salt']}")
    private String DATA_PASSWORD_SALT;
    @Value("#{propertyConfigurer['data_password_default']}")
    private String DATA_PASSWORD_DEFAULT;

    @Override
    public int insert(UserVo vo) {
        User user = this.convertBusinessValue(vo, User.class);

        //初始化公司
        String uuid = Util.Md516();
//        Company company = new Company();
//        company.setApplicationId(uuid);
//        companyDao.insert(company);

//        user.setCompanyId(company.getId());
        user.setApplicationId(uuid);
        user.setName("管理员");
        user.setEmployeeNo("1");
        user.setCreateDate(new Date());
        user.setPassword(Util.getMd5String(user.getPassword().concat(DATA_PASSWORD_SALT)));
        userDao.insert(user);

        //插入默认管理员角色
        RoleVo roleVo = new RoleVo();
        roleVo.setName("管理员");
        roleVo.setApplicationId(uuid);
        roleVo.setReadOnly(RoleEnum.readOnly.getValue());
        int roleId = roleService.insert(roleVo);

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

        //用户初始化角色对象
        List<Integer> roles = new ArrayList<>();
        roles.add(roleId);
        vo.setRoles(roles);
        roleService.insertRoleOfUser(user.getId(),vo.getRoles());
        return user.getId();
    }

    @Override
    public int insertSysUser(UserVo vo) {
        User user = this.convertBusinessValue(vo, User.class);
        user.setCreateDate(new Date());
        user.setPassword(Util.getMd5String(Util.getMd5String(DATA_PASSWORD_DEFAULT).concat(DATA_PASSWORD_SALT)));
        userDao.insert(user);
        roleService.insertRoleOfUser(user.getId(),vo.getRoles());//关联角色
        return user.getId();
    }

    @Override
    public int update(UserVo vo) {
        roleService.insertRoleOfUser(vo.getId(),vo.getRoles());
        User user = this.convertBusinessValue(vo, User.class);
        user.setUpdateDate(new Date());
        return userDao.update(user);
    }

    @Override
    public int delete(int id) {
        roleService.deleteRoleOfUser(id);
        return userDao.delete(id);
    }

    @Override
    public UserTo findOne(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public UserTo findOneAll(Integer id) {
        UserTo to = userDao.findOne(id);
        if(to != null){
            List<Integer> roles = new ArrayList<>();
            List<RoleTo> l = roleService.findUserRoles(id);
            for (RoleTo t:l){
                roles.add(t.getId());
            }
            to.setRoles(roles);
        }
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
}
