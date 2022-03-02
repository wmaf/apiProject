package com.careerdevs.apiProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ApiProjectApplication {  //JSON Placeholder application
					// @... goes above the method  - we respond with the return type.
	@GetMapping ("/ping")
	public String rootRoute () {
		return "you are home";
	}
	@PostMapping ("/ACK")
	public String response () {
		return "NAK";
	}
	@GetMapping("/jsonplaceholder")
	public Object jphUsers (RestTemplate restTemplate) {
		Object requestData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", Object.class);
		return requestData;
	}
//	@DeleteMapping
//	@PutMapping
//	@PatchMapping

	public static void main(String[] args) {
		SpringApplication.run(ApiProjectApplication.class, args);
	}

}
