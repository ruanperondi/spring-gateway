package br.com.ruanperondi.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

  public static void main(final String[] args) {
    SpringApplication.run(GatewayApplication.class, args);
  }

}

