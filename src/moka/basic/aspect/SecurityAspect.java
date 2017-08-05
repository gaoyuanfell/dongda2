package moka.basic.aspect;

import com.alibaba.fastjson.JSONObject;
import moka.auth.to.AuthTo;
import moka.basic.annotation.AuthSecurity;
import moka.basic.annotation.IgnoreSecurity;
import moka.basic.bo.Token;
import moka.basic.service.RedisService;
import moka.user.to.UserTo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 主要用于登录拦截
 * Created by moka on 2017/3/29 0029.
 */
public class SecurityAspect {

    @Value("#{propertyConfigurer['data_token_name']}")
    private String DEFAULT_TOKEN_NAME;

    private String tokenName;

    public void setTokenName(String tokenName) {
        if (StringUtils.isEmpty(tokenName)) {
            tokenName = DEFAULT_TOKEN_NAME;
        }
        this.tokenName = tokenName;
    }

    @Resource
    private RedisService redisService;

    public Object execute(ProceedingJoinPoint pjp) throws Throwable {
        // 从切点上获取目标方法
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method method = methodSignature.getMethod();
        //获取方法上面的注解 有此注解，不进行任何验证
        boolean IgnoreSecurity_b = method.isAnnotationPresent(IgnoreSecurity.class);
        if (IgnoreSecurity_b) return pjp.proceed();

        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        HttpServletResponse response = servletRequestAttributes.getResponse();

        String token = request.getHeader(tokenName);
        Token t = new Token(token);
        UserTo user = redisService.getUserSession(t);

        //判断用户是否登陆
        if(!StringUtils.isEmpty(token)){
            if (user == null || StringUtils.isEmpty(user.getId())) return result();
            redisService.flashLoginSession(t);
            response.setHeader(tokenName,token);
        }else{
            return result();
        }

        //判断用户权限 有注解就判断用户是否有这些权限
        boolean authSecurity_b = method.isAnnotationPresent(AuthSecurity.class);
        if(authSecurity_b){
            List<AuthTo> authList = user.getAuthList();
            AuthSecurity authSecurity = method.getAnnotation(AuthSecurity.class);
            String[] va = authSecurity.value();
            Boolean b = this.findAuth(authList,va);
            if(!b){
                return result(205,"暂无此权限");
            }
        }
        return pjp.proceed();
    }

    private Object result(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 201);
        jsonObject.put("msg", "用户没有登录");
        return jsonObject;
    }

    private Object result(int code,String msg){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", code);
        jsonObject.put("msg", msg);
        return jsonObject;
    }

    /**
     * 判断用户是否有权限
     * @param authList
     * @param value
     * @return
     */
    private Boolean findAuth(List<AuthTo> authList,String[] value){
        if(authList != null && authList.size() > 0 && value != null && value.length > 0){
            for(String sign : value){
                if(!this.arrayMap(authList,sign)){
                    return false;
                }
            }
        }
        return true;
    }

    private Boolean arrayMap(List<AuthTo> authList,String sign){
        for(AuthTo to : authList){
            if(sign.equals(to.getSign())){
                return true;
            }
        }
        return false;
    }

}