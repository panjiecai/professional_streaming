package com.psing.professional_streaming.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    USER_NAME_ERROR(10, "用户名不存在"),
    USER_PWD_ERROR(11, "密码不正确"),
    ;

    private Integer code;
    private String msg;
    ResultEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
