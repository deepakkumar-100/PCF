package com.techM.SpringPorgedSQL;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPorgedSqlApplication {

	@Autowired
	ApplicationMetarepository applicationMetarepository;

	public static void main(String[] args) {
		 SpringApplication.run(SpringPorgedSqlApplication.class, args);
			}
}
