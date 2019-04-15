package org.stary.campusoa.activiti;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableFeignClients(basePackages = {"org.stary.campusoa","com.bootdo"})
@EnableCaching
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"org.stary.campusoa.activiti", "com.bootdo.clouddocommon"})
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class CampusoaActivitiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampusoaActivitiApplication.class, args);
	}

}
