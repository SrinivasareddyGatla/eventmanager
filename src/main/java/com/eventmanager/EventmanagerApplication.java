package com.eventmanager;

import com.eventmanager.service.SolrInitializationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventmanagerApplication {

	public static void main(String[] args) {
		SolrInitializationService.init();
		SpringApplication.run(EventmanagerApplication.class, args);
	}
}
