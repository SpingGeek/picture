package com.spring.picturebackend.common;

import java.io.Serializable;
import lombok.Data;

/**
 * @program: picture-backend
 * @author: spring
 * @create: 2024-12-08
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;


}
