package com.spring.noXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

@Configuration
//@ComponentScan("com.spring.noXML")

public class javaConfige {
@Bean
	public masterInterface myMaster() {
		Master ms=new Master(mySport());
		return ms;
	}
@Bean
	public SportInterface mySport() {
		return new Sport();
	}
}
