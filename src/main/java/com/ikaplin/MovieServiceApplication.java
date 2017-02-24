package com.ikaplin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class MovieServiceApplication {

	@RequestMapping("/fiction")
	public List<String> getMovies() {
		return Arrays.asList("Terminator (1992)", "Aliens (1987)", "Deadpool (2016)");
	}



	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}
}
