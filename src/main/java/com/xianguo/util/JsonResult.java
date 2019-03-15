package com.xianguo.util;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.pagehelper.PageInfo;

import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonResult {
	private int code;
	private String message;
	private Object data;
	private Object data2;
	private Object data3;
	private Object data4;
	private int totalPage;
	private int pageNum;
	private int pageSize;
	private long rowCount;

	public int getCode() {
		return code;
	}

	public JsonResult setCode(int code) {
		this.code = code;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public JsonResult setMessage(String message) {
		this.message = message;
		return this;
	}

	public Object getData() {
		return data;
	}

	public JsonResult setData(Object data) {
		this.data = data;
		return this;
	}

	public Object getData2() {
		return data2;
	}

	public JsonResult setData2(Object data2) {
		this.data2 = data2;
		return this;
	}
	
	
	public JsonResult setData12(Object data,Object data2) {
		this.data = data;
		this.data2 = data2;
		return this;
	}

	public JsonResult setData123(Object data,Object data2,Object data3) {
		this.data = data;
		this.data2 = data2;
		this.data3 = data3;
		return this;
	}
	
	public JsonResult setData1234(Object data,Object data2,Object data3,Object data4) {
		this.data = data;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
		return this;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getRowCount() {
		return rowCount;
	}

	public void setRowCount(long rowCount) {
		this.rowCount = rowCount;
	}

	/**
	 * 成功200
	 * 
	 * @return
	 */
	public static JsonResult success() {
		return new JsonResult().setCode(200).setMessage("success");
	}

	public static JsonResult success(Object data) {
		return success().setData(data);
	}

	
	public static JsonResult success(Object data,Object data2) {
		return success().setData12(data,data2);
	}
	
	public static JsonResult success(Object data,Object data2,Object data3) {
		return success().setData123(data,data2,data3);
	}

	public static JsonResult success(Object data,Object data2,Object data3,Object data4) {
		return success().setData1234(data,data2,data3,data4);
	}

	
	/**
	 * 失败1
	 * 
	 * @param message
	 * @return
	 */
	public static JsonResult error(String message) {
		return new JsonResult().setCode(1).setMessage(message);
	}

	/**
	 * 提示信息0
	 * 
	 * @param message
	 * @return
	 */
	public static JsonResult tipInfo() {
		return new JsonResult().setCode(0).setMessage("other");
	}

	// 分页
	public static JsonResult createJsonResponse(PageInfo<?> pageInfo) {
		JsonResult jor = new JsonResult();
		jor.code = 200;
		jor.message = "success";
		if (pageInfo != null) {
			jor.data = pageInfo.getList();
			jor.pageNum = pageInfo.getPageNum();
			jor.pageSize = pageInfo.getPageSize();
			jor.rowCount = pageInfo.getTotal();
			jor.totalPage = pageInfo.getPages();
		}
		return jor;
	}

	public void setData3(Object data3) {
		this.data3 = data3;
	}

	public void setData4(Object data4) {
		this.data4 = data4;
	}
	
	public static JsonResult createJsonResponse(List<?> list) {
		JsonResult jor = new JsonResult();
		jor.code = 200;
		jor.message = "success";
		jor.data = list;
		return jor;
	}

}
