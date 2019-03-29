package org.stary.campusoaactiviti;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableFeignClients(basePackages = {"com.bootdo"})
@EnableCaching
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"org.stary.campusoaactiviti", "com.bootdo.clouddocommon"})
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class CampusoaActivitiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampusoaActivitiApplication.class, args);
	}

}