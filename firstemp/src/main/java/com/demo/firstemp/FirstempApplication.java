package com.demo.firstemp;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@RestController
@SpringBootApplication
public class FirstempApplication {
	
	@GetMapping("/redirect")
	public String redirectTohome() {
		return "redirect:/index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstempApplication.class, args);
	}

}
