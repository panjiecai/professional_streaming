package com.psing.professional_streaming.enums;

import lombok.Getter;

/**
 * 用户类型枚举
 */
@Getter
public enum UserTypeEnum {

    USER_TYPE_STUDENT(1, "学生"),
    USER_TYPE_CHARGE(2,"专业负责人"),
    USER_TYPE_ADMIN(0,"管理员"),
    ;

    private Integer code;
    private String msg;
    UserTypeEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
