package com.cloud.common.exception;

import com.cloud.common.constant.SystemConstant;
import com.cloud.common.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.nio.file.AccessDeniedException;


/**
 * @Auther: lh
 * @Date: 2019/07/01 10:52
 * @Description: 全局异常处理
 */
@RestControllerAdvice
public class MyControllerAdvice {
    private static final Logger logger = LoggerFactory.getLogger(MyControllerAdvice.class);
    /**
     * 全局异常捕捉处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(Exception e) {
        logger.error(SystemConstant.HANDLE_ERROR,e);
        return ResultUtil.error(SystemConstant.HANDLE_ERROR);
    }

    @ExceptionHandler(value = MsgException.class)
    public Object myErrorHandler(MsgException ex) {
        logger.error(ex.getMessage());
        return ResultUtil.error(ex.getCode(),ex.getMessage());
    }
    @ExceptionHandler({BindException.class,MethodArgumentNotValidException.class})
    public Object handleBindException(BindException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        if(bindingResult.hasErrors()){
            return ResultUtil.error(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
        logger.error(ex.getMessage());
        return ResultUtil.error(SystemConstant.PARAM_ERROR);
    }
    @ExceptionHandler(NumberFormatException.class)
    public Object numberFormatException(NumberFormatException ex) {
        logger.error(ex.getMessage());
        return ResultUtil.error(SystemConstant.PARAM_ERROR);
    }
    @ExceptionHandler({AccessDeniedException.class,IllegalArgumentException.class,RuntimeException.class})
    public Object accessDeniedException(AccessDeniedException ex) {
        logger.error(ex.getMessage());
        return ResultUtil.error(ex.getMessage());
    }
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Object httpRequestMethodNotSupportedException() {
        return ResultUtil.error(SystemConstant.NOT_SUPPORT_REQUEST_ERROR);
    }
}
