package com.example.jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class AdminController {
	@GetMapping("/admin")
	public String admin() {
		return "Admin Controller";
	}
}
