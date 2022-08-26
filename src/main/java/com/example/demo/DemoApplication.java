package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		final String test1 = "cat is in the bag the";

		final WordFrequency wordFrequency = new WordFrequency();
		wordFrequency.wordFrequencySolution(test1);
	}

}
