package com.zmk.app1.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//(scanBasePackages = "com.zmk.library")
@ComponentScan({"com.zmk.library","com.zmk.app1"})
@EntityScan({"com.zmk.library.lib.entity"})
@EnableJpaRepositories("com.zmk.library.lib.repo")
public class MultiXApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(MultiXApp1Application.class, args);
	}

}
