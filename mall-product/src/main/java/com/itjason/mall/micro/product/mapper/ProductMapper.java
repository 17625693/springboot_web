package com.itjason.mall.micro.product.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itjason.mall.micro.product.bean.Product;

@Mapper
public interface ProductMapper {
	
	@Insert("insert into products(pname,type,price)values(#{pname},#{type},#{price})")
	public Integer addProduct(Product product);
	
	@Delete("delete from products where pid = #{pid}")
	public Integer deleteById(Integer pid);
	
	@Update("update products set pname=#{pname},type=#{type},price=#{price} where pid=#{pid}")
	public Integer updateProduct(Product product);
	
	@Select("select * from products where pid=#{pid}")
	public Product getProductById(Integer pid);
	
	@Select("select * from products order by pid")
	public List<Product> getAll();
}
