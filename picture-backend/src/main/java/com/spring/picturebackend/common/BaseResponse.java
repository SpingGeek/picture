package com.spring.picturebackend.common;

import com.spring.picturebackend.exception.ErrorCode;
import java.io.Serializable;
import lombok.Data;

/**
 * @program: picture-backend
 * @author: spring
 * @create: 2024-12-08
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }

}
