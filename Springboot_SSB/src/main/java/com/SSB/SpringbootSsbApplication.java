package com.SSB;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSsbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSsbApplication.class, args);
		ApplicationContext con =  SpringApplication.run(SpringJpaApplication.class, args);
		SSBRecordRepository repo  = con.getBean(SSBRecordRepository.class);
	}

}
