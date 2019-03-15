package com.xianguo.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 * 
 * @author Long.shangbo
 *
 * 2014-2-17 下午9:51:03
 */
public class DateUtils {
	
	private static ThreadLocal<SimpleDateFormat> dateFormatLocal = new ThreadLocal<SimpleDateFormat>();
	
	public static final String DEFAULT_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	public static final String TIME_FORMAT_PATTERN = "HH:mm:ss";
	
	public static final String CHINA_FORMAT_PATTERN = "yyyy年MM月dd日";
	
	public static final String ORDER_FORMAT_PATTERN = "yyyyMMddHHmmss";
	
	public static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd";
	
	
	
	/**
	 * 获得日期格式化对象
	 * @return
	 */
	private static DateFormat getDateFormat(String pattern){
		SimpleDateFormat dateFormat = dateFormatLocal.get();
		
		if(dateFormat == null || !dateFormat.toPattern().equals(pattern)){
			dateFormat = new SimpleDateFormat(pattern);
			dateFormatLocal.set(dateFormat);
		}
		
		return dateFormat;
	}
	
	/**
	 * 使用默认格式格式化日期   yyyy-MM-dd HH:mm:ss
	 * @return 
	 */
	public static String formatWithDefaultPattern(Date date){
		return format(date, DEFAULT_FORMAT_PATTERN);
	}
	
	/**
	 * 使用中文格式格式化日期 yyyy年MM月dd日
	 * @return
	 */
	public static String formatWithChinaPattern(Date date){
		return format(date, CHINA_FORMAT_PATTERN);
	}
	
	/**
	 * 格式化日期
	 * @param date
	 * @return
	 */
	public static String format(Date date, String pattern){
		return getDateFormat(pattern).format(date);
	}
	
	/**
	 * 使用时间格式格式化日期 HH:mm:ss
	 * @return
	 */
	public static String formatWithTimePattern(Date date){
		return format(date, TIME_FORMAT_PATTERN);
	}
	
	/**
	 * 获取当前时间 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String formatNowDate(){
	    return format(new Date(), DEFAULT_FORMAT_PATTERN);
	}
	
	/**
	 * 根据时间戳获取日期  yyyy-MM-dd HH:mm:ss 
	 * @return
	 */
	public static String formLongDate(long time){
	    return format(new Date(time), DEFAULT_FORMAT_PATTERN);
	}
	
	/**
	 * 将当前日期格式化成yyyy-MM-dd
	 * 
	 * @return
	 */
	public static String formatDate3() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(new Date());
	}
	
	/**
	 * 将日期格式化成yyyy-MM-dd
	 * 
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}
}
