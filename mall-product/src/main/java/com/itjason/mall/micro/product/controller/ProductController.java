package com.itjason.mall.micro.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itjason.mall.micro.product.bean.Product;
import com.itjason.mall.micro.product.service.ProductService;
import com.itjason.mall.micro.product.web.Response;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping("/soa/product/add")
	public Response addProduct(Product product){
    	Integer res = service.addProduct(product);
    	if(res == 1){
    		return new Response("200","success");
    	}
    	return new Response("500","Failed");	
	}
	
	@DeleteMapping("/soa/product/{pid}")
	public Response deleteProduct(@PathVariable("pid") Integer pid){
		Integer res = service.deleteProduct(pid);
		if(res == 1){
    		return new Response("200","success");
    	}
    	return new Response("500","Failed");
	}
	
	@PutMapping("/soa/product/update")
	public Response updateProduct(Product product){
		Integer res = service.updateProduct(product);
		if(res == 1){
			return new Response("200","success");
		}
		return new Response("500","Failed");
	}
	
	@GetMapping("/soa/product/{pid}")
	public Response getProductById(@PathVariable("pid")Integer pid){
		Product product = service.getProductById(pid);
    	if(product != null){
    		return new Response("200","success",product);
    	}
    	return new Response("500","Failed",null);
	}
	
	@GetMapping("/soa/product/list")
	public Response getProductList(){
		List<Product> list = service.getAll();
		if(list!=null){
			return new Response("200","success",list);
		}
		return new Response("500","Failed",null);
	}
}
