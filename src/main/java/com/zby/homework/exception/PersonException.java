package com.zby.homework.exception;

import com.zby.homework.enums.ResultEnum;

public class PersonException extends RuntimeException {    //spring只对runtimeexcptionshiwu回滚
private Integer code;

    public PersonException(ResultEnum resultEnum){
       super(resultEnum.getMessage());
       this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
