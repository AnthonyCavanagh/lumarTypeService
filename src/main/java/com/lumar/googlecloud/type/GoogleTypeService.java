package com.lumar.googlecloud.type;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleTypeService{
	
    public static void main( String[] args ) {
    	SpringApplication.run(GoogleTypeService.class, args);
    }
    
    @RequestMapping("/")
    public String home() {
            return "Hello from google cloud";
    }
}
