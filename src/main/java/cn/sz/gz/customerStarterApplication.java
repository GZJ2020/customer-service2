package cn.sz.gz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//@EnableFeignClients({"cn.sz.gz.util"})
@EnableFeignClients
public class customerStarterApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(customerStarterApplication.class, args);
	}
}
