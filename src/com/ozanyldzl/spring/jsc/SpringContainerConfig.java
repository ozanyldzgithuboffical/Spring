package com.ozanyldzl.spring.jsc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ozanyldzl.spring.jsc")
public class SpringContainerConfig {

	@Bean
	public CarModel audiModel() {
		AudiModel model=new AudiModel();
		return model;
	}
	
	@Bean
	public Car audi() {
		Audi model=new Audi(audiModel());
		return model;
	}
}
