package com.example.Biblioteca.Controller;

import com.example.Biblioteca.DTO.LivroDTO;
import com.example.Biblioteca.Entity.Livro;
import com.example.Biblioteca.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> getAll(){
        return livroService.getAll();
    }

    @GetMapping("/{idLivro}")
    public ResponseEntity<LivroDTO> getById(@PathVariable Long idLivro){
        Optional<LivroDTO> livroDTOOptional = livroService.getById(idLivro);
        if(livroDTOOptional.isPresent()){
            return ResponseEntity.ok(livroDTOOptional.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<LivroDTO> create(@RequestBody LivroDTO livroDTO){
        LivroDTO livroDTOSave = livroService.save(livroDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(livroDTOSave);
    }

    @PutMapping("/{idLivro}")
    public ResponseEntity<LivroDTO> update(@PathVariable Long idLivro, @RequestBody LivroDTO livroDTO){
        Optional<LivroDTO> livroDTOOptional = livroService.updateLivro(idLivro, livroDTO);
        if(livroDTOOptional.isPresent()){
            return ResponseEntity.ok(livroDTOOptional.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idLivro}")
    public ResponseEntity<Void> delete(@PathVariable Long idLivro){
        if(livroService.delete(idLivro)){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
