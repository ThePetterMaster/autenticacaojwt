package com.example.autenticacaojwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.autenticacaojwt.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    Optional<Usuario> findByEmail(String email);
    
}
