package com.example.Biblioteca.Controller;

import com.example.Biblioteca.DTO.EmprestimoDTO;
import com.example.Biblioteca.Entity.Cliente;
import com.example.Biblioteca.Entity.Emprestimo;
import com.example.Biblioteca.Service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @GetMapping
    public List<Emprestimo> getAll(){
        return emprestimoService.getAll();
    }

    @GetMapping("/{idEmprestimo}")
    public ResponseEntity<EmprestimoDTO> getById(@PathVariable Long idEmprestimo){
        Optional<EmprestimoDTO> emprestimoDTOOptional = emprestimoService.getById(idEmprestimo);
        if(emprestimoDTOOptional.isPresent()){
            return ResponseEntity.ok(emprestimoDTOOptional.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<EmprestimoDTO> create(@RequestBody EmprestimoDTO emprestimoDTO){
        EmprestimoDTO emprestimoDTOSave = emprestimoService.saveDto(emprestimoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(emprestimoDTOSave);
    }

    @PutMapping("/{idEmprestimo}")
    public ResponseEntity<EmprestimoDTO> update(@PathVariable Long idEmprestimo, @RequestBody EmprestimoDTO emprestimoDTO){
        Optional<EmprestimoDTO> emprestimoDTOOptional = emprestimoService.updateEmprestimo(idEmprestimo, emprestimoDTO);
        if(emprestimoDTOOptional.isPresent()){
            return ResponseEntity.ok(emprestimoDTOOptional.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idEmprestimo}")
    public ResponseEntity<Void> delete(@PathVariable Long idEmprestimo){
        if(emprestimoService.delete(idEmprestimo)){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
