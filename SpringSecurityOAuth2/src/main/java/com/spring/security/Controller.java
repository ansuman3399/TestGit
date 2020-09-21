package com.spring.security;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {

	@GetMapping("/")
	public String welcomeMsg(Principal principal) {
		return "Hi " + principal.getName() + " Welcome to OAuth2.0 Testing App";
	}
}
