package com.itjason.mall.micro.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itjason.mall.micro.product.bean.Product;
import com.itjason.mall.micro.product.mapper.ProductMapper;

@Service
public class ProductService {
	@Autowired
	private ProductMapper mapper;
	
	public Integer addProduct(Product product){
		return mapper.addProduct(product);
	}
	
	public Integer deleteProduct(Integer pid){
		return mapper.deleteById(pid);
	}
	
	public Integer updateProduct(Product product){
		return mapper.updateProduct(product);
	}
	
	public Product getProductById(Integer pid){
		return mapper.getProductById(pid);
	}
	
	public List<Product> getAll(){
		return mapper.getAll();
	}
}
