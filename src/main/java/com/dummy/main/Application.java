package com.dummy.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.dummy.service.CsvToJsonConverterService;

@SpringBootApplication
@ComponentScan(basePackages = { "com.dummy" })
public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		CsvToJsonConverterService csvProcessor = (CsvToJsonConverterService) ctx.getBean("csvToJsonConverterService");
		csvProcessor.readCsv(); 
	}
}