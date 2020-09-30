package com.psing.professional_streaming.enums;

import lombok.Getter;

/**
 * 用户类型枚举
 */
@Getter
public enum UserTypeEnum {

    USER_TYPE_STUDENT(1, "student"),
    USER_TYPE_CHARGE(2,"charge"),
    USER_TYPE_ADMIN(0,"admin"),
    ;

    private Integer code;
    private String msg;
    UserTypeEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public static UserTypeEnum getUserTypeEnum(Integer code){
        for(UserTypeEnum u : UserTypeEnum.values()){
            if(u.getCode().equals(code)){
                return u;
            }
        }
        return null;
    }
}
