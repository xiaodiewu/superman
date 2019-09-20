package cn.lixiaodie.superman.supereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SuperEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperEurekaApplication.class, args);
	}

}
