package com.spring.security;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SpringSecurityOAuth2Application {

	@GetMapping("/")
	public String welcomeMsg(Principal principal) {
		return "Hi " + principal.getName() + " Welcome to OAuth2.0 Testing App";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOAuth2Application.class, args);
	}

}
