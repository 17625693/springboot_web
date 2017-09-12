package com.itjason.mall.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryOneTime;
import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;
import org.apache.curator.x.discovery.ServiceInstance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.itjason.mall.domain.LoadBalance;

@Component
public class ProductClient {
	@Value("${zookeeper.address}")
	private String zkAddress;
	
	public String getUrl() throws Exception{
		CuratorFramework client = CuratorFrameworkFactory.newClient(zkAddress,new RetryOneTime(1000));
	    client.start();
	    client.blockUntilConnected();
	    ServiceDiscovery<Object> serviceDiscovery = ServiceDiscoveryBuilder.builder(Object.class).client(client).basePath("/soa").build();
	    Collection<ServiceInstance<Object>> list = serviceDiscovery.queryForInstances("product");
	    List<String> services = new ArrayList<>();
	    list.forEach((instance)->{
	        services.add(instance.getAddress()+":"+instance.getPort());
	        System.out.println(instance.getAddress());
	        System.out.println(instance.getPort());
	    });
	    LoadBalance lb = new LoadBalance(services);
	    return "http://"+lb.choose();
	}
}
