package org.stary.campusoa.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * @author stary
 * @date 2019/4/13 9:08 PM
 */
@EnableFeignClients(basePackages = {"org.stary.campusoa","com.bootdo"})
@EnableCaching
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"org.stary.campusoa.business","com.bootdo.clouddocommon"})
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class CampusoaBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusoaBusinessApplication.class, args);
    }

}
