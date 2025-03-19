package com.example.Spring_Boot_Rest_Contacts.config;

import com.example.Spring_Boot_Rest_Contacts.SpringBootRestContactsApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootRestContactsApplication.class);
	}

}
