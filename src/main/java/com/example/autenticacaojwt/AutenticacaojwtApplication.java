package com.example.autenticacaojwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AutenticacaojwtApplication {

	public static void main(String[] args) {
		System.out.println("Um exemplo da senha 123456 criptografada");
		System.out.println(new BCryptPasswordEncoder().encode("123456"));
		SpringApplication.run(AutenticacaojwtApplication.class, args);
	}

}
