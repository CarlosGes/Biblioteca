package com.example.Biblioteca.DTO;

import com.example.Biblioteca.Entity.Cliente;
import com.example.Biblioteca.Entity.Livro;

import java.util.Date;
import java.util.List;

public class EmprestimoDTOResponse {
    public Long idEmprestimo;
    public Date data_inicial;
    public Date data_final;
    public Livro livro;
    public List<Cliente> clientes;

    public EmprestimoDTOResponse() {
    }

    public EmprestimoDTOResponse(Long idEmprestimo, Date data_inicial, Date data_final, Livro livro, List<Cliente> clientes) {
        this.idEmprestimo = idEmprestimo;
        this.data_inicial = data_inicial;
        this.data_final = data_final;
        this.livro = livro;
        this.clientes = clientes;
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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
