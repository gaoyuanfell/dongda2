package moka.basic.ctrl;

import com.alibaba.fastjson.JSONObject;
import moka.basic.bo.Resources;
import moka.basic.bo.Token;
import moka.basic.service.RedisService;
import moka.user.to.UserTo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by moka on 2017/3/27 0027.
 */
public class BasicController extends Resources {

    @Resource
    private RedisService redisService;

    @Value("#{propertyConfigurer['data_token_name']}")
    protected String tokenName;

    @Resource
    private HttpServletRequest request;

    protected boolean addUserSession(Token t) {
        return redisService.addUserSession(t);
    }

    //获取用户
    protected UserTo getUserSession() {
        String token = request.getHeader(tokenName);
        if (StringUtils.isEmpty(token))
            return null;
        else
            return redisService.getUserSession(new Token(token));
    }

    protected String getUserSessionId() {
        UserTo user = getUserSession();
        if (user == null)
            return null;
        else
            return user.getId();
    }

    protected boolean flashLoginSession(Token t) {
        return redisService.flashLoginSession(t);
    }

    protected boolean deleteLoginSession(Token t){
        return redisService.deleteLoginSession(t);
    }
}