package com.psing.professional_streaming.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * 学生信息表
 */
@Entity
@Data
public class Student {


    /**
     * 学号
     */
    @Id
    private String sno;

    /**
     * 学生姓名
     */
    private String sname;

    /**
     * 学院
     */
    private String insititute;

    /**
     * 专业
     */
    private String major;

    /**
     * 班级
     */
    private String classname;

    /**
     * 年级
     */
    private String grade;

    /**
     * 邮箱
     */
    private String email;

    /**
     *绩点
     */
    private Integer gpa;
}
