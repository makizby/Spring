package com.zby.homework.handle;

import com.zby.homework.Domian.Result;
import com.zby.homework.Utils.ResultUtils;
import com.zby.homework.enums.ResultEnum;
import com.zby.homework.exception.PersonException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e ){
        if(e instanceof PersonException){
            PersonException personException = (PersonException) e;
            return ResultUtils.failed(((PersonException) e).getCode(),personException.getMessage());
        }else {
            return ResultUtils.failed(ResultEnum.UNKONW_ERROR.getCode(),ResultEnum.UNKONW_ERROR.getMessage());
        }
    }
}
