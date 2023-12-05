package com.m2m.jaxfitness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan({"data.*"})
public class JaxfitnessApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxfitnessApplication.class, args);
	}
  /**/
	// 첫 커밋 branch developGw
	// 최종 테스트 onings

}
