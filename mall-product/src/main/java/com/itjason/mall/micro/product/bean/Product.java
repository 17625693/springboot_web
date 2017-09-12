package com.itjason.mall.micro.product.bean;

import java.sql.Timestamp;

public class Product {
	private Integer pid;
	private String pname;
	private String type;
	private double price;
	private Timestamp createTime;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Product(Integer pid, String pname, String type, double price, Timestamp createTime) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.type = type;
		this.price = price;
		this.createTime = createTime;
	}
	public Product() {
		super();
	}
}
