package com.psing.professional_streaming.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 管理员
 */
@Entity
@Data
public class Admin {

    @Id
    private String Id;

    /**
     * 管理员
     */
    private String adminName;
}
