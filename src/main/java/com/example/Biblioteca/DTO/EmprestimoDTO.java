package com.example.Biblioteca.DTO;

import com.example.Biblioteca.Entity.Cliente;
import com.example.Biblioteca.Entity.Emprestimo;
import com.example.Biblioteca.Entity.Livro;

import java.util.Date;
import java.util.List;

public class EmprestimoDTO {
    private Long idEmprestimo;
    private Date data_inicial;
    private Date data_final;
    private Cliente cliente;

    private List<Livro> livros;

    public EmprestimoDTO() {
    }

    public EmprestimoDTO(Long idEmprestimo, Date data_inicial, Date data_final, Cliente cliente) {
        this.idEmprestimo = idEmprestimo;
        this.data_inicial = data_inicial;
        this.data_final = data_final;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
