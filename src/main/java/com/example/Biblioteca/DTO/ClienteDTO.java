package com.example.Biblioteca.DTO;

import com.example.Biblioteca.Entity.Emprestimo;

public class ClienteDTO {
    private Long idCliente;
    private String nome;
    private String sobrenome;
    private String cpf;
    private Emprestimo emprestimo;


    public ClienteDTO() {
    }

    public ClienteDTO(Long idCliente, String nome, String sobrenome, String cpf, Emprestimo emprestimo) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.emprestimo = emprestimo;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}
