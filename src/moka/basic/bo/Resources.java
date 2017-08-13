package moka.basic.bo;

import com.alibaba.fastjson.JSONObject;

public class Resources {
    protected static final int CODE_SUCCESS = 200;//成功
    protected static final int CODE_NO_LOGIN = 201;//未登录
    protected static final int CODE_PROMPT = 202;//文字提示
    protected static final int CODE_PROMPT_MASK = 203;//弹幕提示
    protected static final int CODE_NOT_AUTH = 205;//没有权限


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
}
