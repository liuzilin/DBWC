package com.lzl.dbwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.dbwc.*"})
public class DbwcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbwcApplication.class, args);
	}
}
