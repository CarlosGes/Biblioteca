package com.example.Biblioteca.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprestimo;
    private Date data_inicial;
    private Date data_final;

    @OneToMany
    @JoinColumn(name = "idLivro", referencedColumnName = "idLivro")
    private Livro livro;

    @OneToOne(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Cliente> Clientes;

    public Emprestimo(Long idEmprestimo, Date data_inicial, Date data_final) {
        this.idEmprestimo = idEmprestimo;
        this.data_inicial = data_inicial;
        this.data_final = data_final;
    }

    public Emprestimo() {

    }

    public Long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Date getData_inicial() {
        return data_inicial;
    }

    public void setData_inicial(Date data_inicial) {
        this.data_inicial = data_inicial;
    }

    public Date getData_final() {
        return data_final;
    }

    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }
}
