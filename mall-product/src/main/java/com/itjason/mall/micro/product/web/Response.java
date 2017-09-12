package com.itjason.mall.micro.product.web;

public class Response {
	//satus code 200:success 500:failed
	private String code;
	//message
	private String msg;
	//data
	private Object data;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Response(){}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Response(String code,String msg,Object data){
		this.code = code;
		this.msg=msg;
		this.data=data;
	}
	
	public Response(String code, String msg) {
		this.code = code;
		this.msg=msg;
	}
	public String toString() {
		return "Response [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
}
