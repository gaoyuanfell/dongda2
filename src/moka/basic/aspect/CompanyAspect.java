package moka.basic.aspect;

import moka.basic.annotation.MetaDataSecurity;
import moka.basic.bo.Token;
import moka.basic.log4j.LoggerService;
import moka.basic.service.RedisService;
import moka.company.service.CompanyService;
import moka.user.to.UserTo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 增加绑定controller参数  必须MetaData 其实可以通过 MetaDataSecurity注解来获取对应的参数，不过目前不需要，没有复杂的业务，固定对象即可。
 */
public class CompanyAspect implements HandlerMethodArgumentResolver {

    private Logger logger = LoggerService.getLogger(this.getClass());

    @Resource
    private CompanyService companyService;
    @Resource
    private RedisService redisService;
    @Resource
    private HttpServletRequest request;
    @Value("#{propertyConfigurer['data_token_name']}")
    protected String tokenName;

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().equals(MetaData.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        MetaDataSecurity m = parameter.getParameterAnnotation(MetaDataSecurity.class);
        MetaData me = null;
        if(m != null){
            me = new MetaData();
            String[] fields = m.value();
            this.fillingData(me,fields);
        }
        return me;
    }

    /**
     * 填充数据
     * @param metaData
     * @param fields
     * @return
     */
    private MetaData fillingData(MetaData metaData, String[] fields){
        UserTo userTo = redisService.getUserSession(new Token(request.getHeader(tokenName)));
        for (int i = 0; i < fields.length; ++i){
            switch (fields[i]){
                case "companyIds":
                    List<String> companyIds = this.getCompanyIds(userTo.getId());
                    metaData.setCompanyIds(companyIds);
                    break;
                case "followUserIds":
                    break;
            }
        }
        return metaData;
    }

    /**
     * 获取用户公司ID
     * @param userId
     * @return
     */
    private List<String> getCompanyIds(String userId){
        return companyService.findCompanyIdByUser(userId);
    }
}
