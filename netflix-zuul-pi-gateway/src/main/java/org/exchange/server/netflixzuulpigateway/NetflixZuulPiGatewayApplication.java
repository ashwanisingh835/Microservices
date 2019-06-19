package org.exchange.server.netflixzuulpigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulServer
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixZuulPiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulPiGatewayApplication.class, args);
	}

}
