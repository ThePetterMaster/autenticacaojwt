package com.example.autenticacaojwt.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.autenticacaojwt.controllers.dto.TokenDto;
import com.example.autenticacaojwt.controllers.form.LoginForm;
import com.example.autenticacaojwt.config.security.TokenServiceJwt;


@CrossOrigin
@RestController
@RequestMapping("/auth")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private TokenServiceJwt tokenService;

    @PostMapping
    public ResponseEntity<TokenDto> autenticar(@RequestBody @Valid LoginForm form){
        System.out.println(form.getEmail());
        UsernamePasswordAuthenticationToken dadosLogin=form.converter();
        
     
        Authentication authentication = authManager.authenticate(dadosLogin);
        String token = tokenService.gerarToken(authentication);
        return ResponseEntity.ok(new TokenDto(token,"Bearer"));
    
        
    }
    
}
