package com.itjason.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.itjason.mall.client.CommonClient;
import com.itjason.mall.client.ProductClient;

@SpringBootApplication
public class App {
    public static void main( String[] args ) throws Exception{
    	ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    	CommonClient client = context.getBean(CommonClient.class);
    	ProductClient pclient = context.getBean(ProductClient.class);
    	client.setRestUrl(pclient.getUrl()+"/soa/product/12");
    	String jsonStr = client.getData();
    	System.out.println(jsonStr);
    }
}
