package com.tads.dac.gerente.DTOs;

import java.io.Serializable;

public class GerenteDashboardDTO implements Serializable {
    
    private Long id;
    private String nome;
    private String email;
    private Long clientes;
    private Long pos;
    private Long neg;

    public GerenteDashboardDTO() {
    }

    public GerenteDashboardDTO(Long id, String nome, String email, Long clientes, Long pos, Long neg) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.clientes = clientes;
        this.pos = pos;
        this.neg = neg;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getClientes() {
        return clientes;
    }

    public void setClientes(Long clientes) {
        this.clientes = clientes;
    }

    public Long getPos() {
        return pos;
    }

    public void setPos(Long pos) {
        this.pos = pos;
    }

    public Long getNeg() {
        return neg;
    }

    public void setNeg(Long neg) {
        this.neg = neg;
    }
}
