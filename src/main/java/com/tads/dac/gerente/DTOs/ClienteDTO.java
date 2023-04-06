/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tads.dac.gerente.DTOs;


public class ClienteDTO {
    
    //DTO são as classes que vão servir de modelo pra transferencia de dados
    
    private Integer idConta;
    private String nome;
    private String cpf;
    private String nomeGerente;
    private Float saldo;
    private Float limite;

    public ClienteDTO() {
    }

    public ClienteDTO(Integer idConta, String nome, String cpf, String nomeGerente, Float saldo, Float limite) {
        this.idConta = idConta;
        this.nome = nome;
        this.cpf = cpf;
        this.nomeGerente = nomeGerente;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Float getLimite() {
        return limite;
    }

    public void setLimite(Float limite) {
        this.limite = limite;
    }
    
    
    
    
    
}
