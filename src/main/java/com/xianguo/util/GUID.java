package com.xianguo.util;
/**
 * 主键生产
 * @author ybw
 *
 */
public class GUID {
	
	/**
	 * 生成UUID字符串(主键)
	 * @return
	 */
	public static String newGUID() {
		return java.util.UUID.randomUUID().toString().replaceAll("-", "");
	}

}
