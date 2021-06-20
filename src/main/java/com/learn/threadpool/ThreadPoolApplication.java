package com.learn.threadpool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching(proxyTargetClass = true)
@EnableAsync
public class ThreadPoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreadPoolApplication.class, args);
	}

}
