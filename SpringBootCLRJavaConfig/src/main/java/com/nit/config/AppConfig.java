package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.beans.MyRunner;

@Configuration
public class AppConfig {
    @Bean 
	public  MyRunner mr()
	{
		MyRunner m= new MyRunner();
		return m;
	}
}
