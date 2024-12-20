package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.AccountsService;

@SpringBootApplication
public class SbmsCompositePKsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbmsCompositePKsApplication.class, args);
		AccountsService service = run.getBean(AccountsService.class);
		service.saveDetails();
		System.out.println("==============================");
	}

}
