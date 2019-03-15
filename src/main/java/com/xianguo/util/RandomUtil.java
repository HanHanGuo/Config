package com.xianguo.util;

import java.util.Date;
import java.util.Random;

/**
 * 生成6位随机数
 * 
 * @author zk 2018-6-25 17:22:57
 *
 */
public class RandomUtil {

	/**
	 * 生产订单编号
	 * 
	 * @param prefix
	 * @return
	 */
	public static String getOrderNumber(String prefix) {
		StringBuilder result = new StringBuilder();
		result.append(prefix + DateUtils.format(new Date(), DateUtils.ORDER_FORMAT_PATTERN));
		Random random = new Random();
		for (int i = 0; i < 2; i++) {
			result.append(random.nextInt(10));
		}
		return result.toString();
	}

	/**
	 * 生成一个n位的随机数字符串
	 * 
	 * @param n
	 * @return
	 */
	public static String getRandomNum(int length) {
		String str = "0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < length; ++i) {
			int number = random.nextInt(9);// [1,9)
			sb.append(str.charAt(number + 1));
		}
		return sb.toString();
	}

	/**
	 * 随机生成字符串
	 * @param length
	 * @return
	 */
	public static String getRandomString(int length) {
		// 定义一个字符串（A-Z，a-z，0-9）即62位；
		String str = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890";
		// 由Random生成随机数
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		
		// 长度为几就循环几次
		for (int i = 0; i < length; ++i) {
			// 产生0-61的数字
			int number = random.nextInt(36);
			// 将产生的数字通过length次承载到sb中
			sb.append(str.charAt(number));
		}
		// 将承载的字符转换成字符串
		return sb.toString();
	}

}
