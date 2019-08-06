package com.cloud.common.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AjaxResult<T extends Object> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 消息
     */
    private String msg;

    /**
     * 数据对象
     */
    private T data;
}
