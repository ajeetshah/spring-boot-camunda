package com.example.demo;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.hibernate.event.spi.PostDeleteEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class SpringBootCamunda {

//	@Autowired
//	private RuntimeService runtimeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCamunda.class, args);
	}

//	private void processPostDeploy(PostDeleteEvent postDeleteEvent) {
//		runtimeService.startProcessInstanceByKey("loanApproval");
//	}

}
