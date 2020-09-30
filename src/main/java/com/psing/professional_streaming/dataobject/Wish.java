package com.psing.professional_streaming.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 志愿表
 *
 */
@Entity
@Data
public class Wish {

    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 学号
     */
    private String sno;

    /**
     *志愿专业
     */
    private String wishMajor;

    /**
     *志愿等级 1，2，3
     */
    private String wishLevel;
}
