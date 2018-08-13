package com.zby.homework.Utils;

import com.zby.homework.Domian.Result;

public class ResultUtils {
    /*
    成功
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMessage("success");
        result.setData(object);
        return result;
    }
    public static Result success(){
        return success(null);
    }
    /*
    失败
     */
    public static Result failed(Integer code,String message){
        Result result = new Result();
        result.setMessage(message);
        result.setCode(code);
        return result;
    }

}
