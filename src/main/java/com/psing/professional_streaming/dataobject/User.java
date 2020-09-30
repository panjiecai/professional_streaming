package com.psing.professional_streaming.dataobject;

import com.psing.professional_streaming.enums.UserTypeEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 账号
 */

@Entity
@Data
public class User {

    @Id
    private String username;

    /**
     * 密码
     *
     */
    private String password;

    /**
     * 用户类型:默认为学生
     */
    private Integer type = UserTypeEnum.USER_TYPE_STUDENT.getCode();

}
