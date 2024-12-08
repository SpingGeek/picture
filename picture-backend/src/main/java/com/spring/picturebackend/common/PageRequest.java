package com.spring.picturebackend.common;

import lombok.Data;

/**
 * @program: picture-backend
 * @author: spring
 * @create: 2024-12-08
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";


}
