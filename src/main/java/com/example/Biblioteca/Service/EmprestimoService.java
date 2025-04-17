package com.example.Biblioteca.Service;



import com.example.Biblioteca.DTO.EmprestimoDTO;

import com.example.Biblioteca.Entity.Emprestimo;
import com.example.Biblioteca.Repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {
    @Autowired
    private EmprestimoRepository emprestimoRepository;


    public List<Emprestimo> getAll(){
        return emprestimoRepository.findAll();
    }

    public Emprestimo fromDTO(EmprestimoDTO emprestimoDTO){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setIdEmprestimo(emprestimoDTO.getIdEmprestimo());
        emprestimo.setData_inicial(emprestimoDTO.getData_inicial());
        emprestimo.setData_final(emprestimoDTO.getData_final());
        return emprestimo;
    }

    public EmprestimoDTO toDTO(Emprestimo emprestimo){
        EmprestimoDTO emprestimoDTO = new EmprestimoDTO();
        emprestimoDTO.setIdEmprestimo(emprestimo.getIdEmprestimo());

        return emprestimoDTO;
    }


    public Optional<EmprestimoDTO> getById(Long id){
        Optional<Emprestimo> optionalEmprestimo = emprestimoRepository.findById(id);
        if(optionalEmprestimo.isPresent()){
            return Optional.of(this.toDTO(optionalEmprestimo.get()));
        }else {
            return Optional.empty();
        }

    }

    public EmprestimoDTO saveDto(EmprestimoDTO emprestimoDTO){
        Emprestimo emprestimo = this.fromDTO(emprestimoDTO);
        Emprestimo clienteBd = emprestimoRepository.save(emprestimo);
        return this.toDTO(clienteBd);
    }

    public Optional<EmprestimoDTO> updateEmprestimo(Long id, EmprestimoDTO emprestimoDTO){
        Optional<Emprestimo> optionalEmprestimo = emprestimoRepository.findById(id);
        if(optionalEmprestimo.isPresent()){
            Emprestimo emprestimo = optionalEmprestimo.get();
            emprestimo.setData_final(emprestimoDTO.getData_final());
            Emprestimo clienteUpdate = emprestimoRepository.save(emprestimo);
            return Optional.of(this.toDTO(clienteUpdate));
        }else {
            return Optional.empty();
        }
    }

    public boolean delete(Long id){
        if(emprestimoRepository.existsById(id)){
            emprestimoRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
