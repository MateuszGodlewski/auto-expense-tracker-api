package com.autoexpensetrackerapi.autoexpensetrackerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AutoExpenseTrackerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoExpenseTrackerApiApplication.class, args);
	}

}
