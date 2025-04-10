package com.example.Biblioteca.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String nome;
    private String sobrenome;
    private String cpf;


    @OneToOne
    @JoinColumn(name = "idEmprestimo", referencedColumnName = "idEmprestimo")
    @JsonIgnoreProperties("clientes")
    private Emprestimo emprestimo;


    public Cliente(Long idCliente, String nome, String sobrenome, String cpf) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public Cliente() {
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

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}
