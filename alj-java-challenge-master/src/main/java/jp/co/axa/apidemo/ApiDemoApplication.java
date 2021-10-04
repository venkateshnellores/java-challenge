package jp.co.axa.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


/*
 * To Enable Spring managed Caching, 
 * we just need to add @EnableCaching annotation in the Spring Boot application class
 */
@EnableSwagger2
@SpringBootApplication
@EnableCaching
public class ApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}

}
