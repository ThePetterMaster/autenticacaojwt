package com.example.autenticacaojwt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/")
public class HelloController {
	

	@GetMapping("/admin")
	public String admin() {
		return "Somente admin pode acessar essa rota";
	}
	@GetMapping("/user")
	public String user() {
		return "Somente user pode acessar essa rota";
	}

}
