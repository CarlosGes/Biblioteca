package com.example.Biblioteca.DTO;

import com.example.Biblioteca.Entity.Emprestimo;

import java.util.Date;

public class EmprestimoDTO {
    private Long idEmprestimo;
    private Date data_inicial;
    private Date data_final;
    private Emprestimo emprestimo;

    public EmprestimoDTO() {
    }

    public EmprestimoDTO(Long idEmprestimo, Date data_inicial, Date data_final, Emprestimo emprestimo) {
        this.idEmprestimo = idEmprestimo;
        this.data_inicial = data_inicial;
        this.data_final = data_final;
        this.emprestimo = emprestimo;
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

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}
