package com.cloud.common.util;

import com.cloud.common.entity.AjaxResult;
import com.cloud.common.enums.ResultCodeEnum;

/**
 * ajax返回工具类
 * @author lh
 *
 */
public class ResultUtil {

	/**
	 * 	不知成功还是失败
	 * @param result
	 * @return
	 */
	public static AjaxResult result(Boolean result){
		return result?success():error();
	}
	/**
	 * 	成功返回
	 * @param msg
	 * @return
	 */
	public static AjaxResult success(String msg){
		return AjaxResult.builder().code(ResultCodeEnum.OK.getValue()).msg(msg).build();
	}
	/**
	 * 	成功返回
	 * @param msg
	 * @param data
	 * @return
	 */
	public static AjaxResult success(String msg, Object data){
		return AjaxResult.builder().code(ResultCodeEnum.OK.getValue()).msg(msg).data(data).build();
	}
	/**
	 * 	成功返回
	 * @return
	 */
	public static AjaxResult success(){
		return AjaxResult.builder().code(ResultCodeEnum.OK.getValue()).msg("ok").build();
	}
	/**
	 * 	成功返回
	 * @param data
	 * @return
	 */
	public static AjaxResult success(Object data){
		return AjaxResult.builder().code(ResultCodeEnum.OK.getValue()).msg("ok").data(data).build();
	}
	/**
	 * 	错误返回
	 * @return
	 */
	public static AjaxResult error(){
		return AjaxResult.builder().code(ResultCodeEnum.ERROR.getValue()).msg("error").build();
	}
	/**
	 * 	错误返回
	 * @param msg
	 * @return
	 */
	public static AjaxResult error(String msg){
		return AjaxResult.builder().code(ResultCodeEnum.ERROR.getValue()).msg(msg).build();
	}
	/**
	 * 	错误返回
	 * @param code
	 * @param msg
	 * @return
	 */
	public static AjaxResult error(Integer code, String msg){
		if(code==null) {
			return error(msg);
		}
		return AjaxResult.builder().code(code).msg(msg).build();
	}
	/**
	 * 	错误返回
	 * @param code
	 * @return
	 */
	public static AjaxResult error(Integer code){
		if(code==null) {
			return error();
		}
		return AjaxResult.builder().code(code).msg("error").build();
	}
	/**
	 * 	错误返回
	 * @param msg
	 * @param obj
	 * @return
	 */
	public static AjaxResult error(String msg, Object obj){
		return AjaxResult.builder().code(ResultCodeEnum.ERROR.getValue()).msg(msg).data(obj).build();
	}
}
