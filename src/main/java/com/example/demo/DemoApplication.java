package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	String hello() {
		return "Hello Monday!";
	}

}

// A change added : new-branch no conflicts after the merge

// master: no conflicts after the merge

// A local change - no conflict after the merge
// Just trying another time
// A remote change - no conflict after the merge
//another commit


//A local change
// A remote change (imagine someone has pushed her change to the remote)

//update 1 - OK
//update 2 - OK