package com.psing.professional_streaming.exception;


import com.psing.professional_streaming.enums.ResultEnum;

/**
 * 异常
 */
public class PSingException extends RuntimeException{

    private Integer code;

    public PSingException(ResultEnum resultEnum){
        //传到父类方法 即存入异常信息
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public PSingException(Integer code, String msg){
        super(msg);
        this.code = code;
    }
}
