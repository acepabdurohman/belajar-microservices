package com.acepabdurohman.webclient;

import com.acepabdurohman.webclient.service.AccountService;
import com.acepabdurohman.webclient.service.impl.AccountServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class WebClientApplication {

	//public static final String ACCOUNT_SERVICE_URL = "http://account-service";

	public static void main(String[] args) {
		SpringApplication.run(WebClientApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	/*@Bean
	public AccountService accountService(){
		return new AccountServiceImpl(ACCOUNT_SERVICE_URL);
	}*/

}
