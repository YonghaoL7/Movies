package com.yonghao.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //Lets the class know it's a REST API controller

public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/") //Shows that this method is a GET endpoint: A web API allowing clients to retreieve data from servers
	//If it was /root inside the parenthesis then, whenever the website URL with /root is invoked then it will call the method Ex: localhost:8080/root
	public String apiRoot() {
		return "Hello World!";
	}
}
