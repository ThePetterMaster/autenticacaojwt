package com.example.autenticacaojwt.modelo;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;


@Entity
@Table(name = "TB_ROLE")
public class RoleModel implements GrantedAuthority{
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nome;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String getAuthority() {
        return nome;
    }
    
    
}