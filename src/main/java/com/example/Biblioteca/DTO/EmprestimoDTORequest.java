package com.example.Biblioteca.DTO;

import java.util.Date;

public class EmprestimoDTORequest {

    private Long idEmprestimo;
    private Date data_inicial;
    private Date data_final;

    public EmprestimoDTORequest() {
    }

    public EmprestimoDTORequest(Long idEmprestimo, Date data_inicial, Date data_final) {
        this.idEmprestimo = idEmprestimo;
        this.data_inicial = data_inicial;
        this.data_final = data_final;
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
