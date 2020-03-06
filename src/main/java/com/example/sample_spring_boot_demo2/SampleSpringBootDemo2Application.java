package com.example.sample_spring_boot_demo2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringBootDemo2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootDemo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello world 2 !!!");
	}
}
