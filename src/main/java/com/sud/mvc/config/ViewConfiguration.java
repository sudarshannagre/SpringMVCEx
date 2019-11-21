package com.sud.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = "com.sud.mvc")
@EnableWebMvc
public class ViewConfiguration {

	@Bean
	ViewResolver viewResolver() {
		InternalResourceViewResolver rs = new InternalResourceViewResolver();
		rs.setViewClass(JstlView.class);
		rs.setSuffix(".jsp");
		rs.setPrefix("/WEB-INF/views/");
		return rs;
	}
}
