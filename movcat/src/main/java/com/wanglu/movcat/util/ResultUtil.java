package com.wanglu.movcat.util;

import com.wanglu.movcat.model.Result;

/**
 * Created by wangl on 2017/10/12 0012.
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setSuccess(true);
        result.setMsg("请求成功");
        result.setData(object);
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setSuccess(false);
        result.setMsg(msg);
        return result;
    }
}
