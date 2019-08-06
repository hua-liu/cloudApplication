package com.cloud.common.enums;

public enum ResultCodeEnum {

	OK(200), // 成功
	ERROR(300); // 失败

	private Integer value;

	ResultCodeEnum(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
	/**
	 * 获取元素
	 * @param value
	 * @return
	 */
	public static ResultCodeEnum getEnum(Integer value){
		ResultCodeEnum[] values = ResultCodeEnum.values();
		for(ResultCodeEnum em : values){
			if(em.getValue().equals(value)){
				return em;
			}
		}
		return null;
	}
}
