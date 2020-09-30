package com.psing.professional_streaming.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *专业
 */
@Entity
@Data
public class Major {

    @Id
    private String id;

    /**
     * 专业负责人
     */
    private String charge;

    /**
     * 学院
     */
    private String institute;

    /**
     * 分流专业
     */
    private String major;

    /**
     * 大类专业
     */
    private String majorCategories;
}
