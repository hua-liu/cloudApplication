package com.cloud.common.exception;

/**
 * Created by wyp on 2017/9/21.
 */
public class MsgException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private Integer code;

    public MsgException(Throwable cause) {
        super(cause);
    }

    public MsgException(String message) {
        super(message);
    }

    public MsgException(String message, Throwable cause) {
        super(message, cause);
    }

    public MsgException(Integer code, String message) {
        super(message);
        this.code=code;
    }

    public Integer getCode() {
        return code;
    }

}
