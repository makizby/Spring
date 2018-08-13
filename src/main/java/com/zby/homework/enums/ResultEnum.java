package com.zby.homework.enums;

public enum ResultEnum {
    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    LESS_THAN_18(100,"小于18"),
    BIGGER_THAN_25(101,"大于25");
    private int code;
    private String message;

    ResultEnum(int code,String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
