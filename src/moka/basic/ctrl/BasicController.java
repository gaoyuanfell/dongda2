package moka.basic.ctrl;

import com.alibaba.fastjson.JSONObject;
import moka.basic.bo.Token;
import moka.basic.service.RedisService;
import moka.user.bo.User;
import moka.user.to.UserTo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by moka on 2017/3/27 0027.
 */
public class BasicController {

    @Resource
    private RedisService redisService;

    @Value("#{propertyConfigurer['data_token_name']}")
    protected String tokenName;

    @Resource
    private HttpServletRequest request;

    protected static final int CODE_SUCCESS = 200;//成功
    protected static final int CODE_NO_LOGIN = 201;//未登录
    protected static final int CODE_PROMPT = 202;//文字提示
    protected static final int CODE_PROMPT_MASK = 203;//弹幕提示

    protected static JSONObject result(Object obj) {
        JSONObject json = new JSONObject();
        json.put("msg", "success");
        json.put("code", 200);
        json.put("data", obj);
        return json;
    }

    protected static JSONObject result(Object obj, int code, String msg) {
        JSONObject json = new JSONObject();
        json.put("msg", msg);
        json.put("code", code);
        json.put("data", obj);
        return json;
    }

    protected static JSONObject result(int code, String msg) {
        JSONObject json = new JSONObject();
        json.put("msg", msg);
        json.put("code", code);
        return json;
    }

    protected static JSONObject result() {
        JSONObject json = new JSONObject();
        json.put("msg", "success");
        json.put("code", 200);
        return json;
    }

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

    protected int getUserSessionId() {
        UserTo user = getUserSession();
        if (user == null)
            return 0;
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