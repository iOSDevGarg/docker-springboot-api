package com.mkyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Docker + Spring Boot");
        model.addAttribute("msg", "Welcome to the docker container!");
        return "index";
    }

    @GetMapping("/greet")
    public ResponseEntity<String> exampleEndpoint() {
        return ResponseEntity.ok("Hi Welcome Jatin!!!");
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
