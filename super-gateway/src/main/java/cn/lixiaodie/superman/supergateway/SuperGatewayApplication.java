package cn.lixiaodie.superman.supergateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SuperGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperGatewayApplication.class, args);
	}

}
