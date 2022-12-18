package com.example.Libraryeventsconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class LibraryEventsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryEventsConsumerApplication.class, args);
	}

}
