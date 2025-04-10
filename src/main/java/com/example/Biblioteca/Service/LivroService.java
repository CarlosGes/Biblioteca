package com.example.Biblioteca.Service;

import com.example.Biblioteca.DTO.LivroDTO;
import com.example.Biblioteca.Entity.Livro;
import com.example.Biblioteca.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;


    public Livro fromDTO(LivroDTO livroDTO){
        Livro livro = new Livro();
        livro.setIdLivro(livroDTO.getIdLivro());
        livro.setNome(livroDTO.getNome());
        livro.setAutor(livroDTO.getAutor());
        livro.setIsbn(livroDTO.getIsbn());
        livro.setGenero(livroDTO.getGenero());

        return livro;
    }

    public LivroDTO toDTO(Livro livro){
        LivroDTO livroDTO = new LivroDTO();
        livro.setIdLivro(livroDTO.getIdLivro());
        livro.setNome(livroDTO.getNome());
        livro.setAutor(livroDTO.getAutor());
        livro.setIsbn(livroDTO.getIsbn());
        livro.setGenero(livroDTO.getGenero());

        return livroDTO;
    }

    public List<Livro> getAll(){
        return livroRepository.findAll();
    }

    public Optional<LivroDTO> getById(Long id){
        Optional<Livro> optionalLivro = livroRepository.findById(id);
        if(optionalLivro.isPresent()){
            return Optional.of(this.toDTO(optionalLivro.get()));
        }else {
            return Optional.empty();
        }

    }

    public LivroDTO save(LivroDTO livroDTO){
        Livro livro = this.fromDTO(livroDTO);
        Livro professorBd = livroRepository.save(livro);
        return this.toDTO(professorBd);
    }

    public Optional<LivroDTO> updateLivro(Long id, LivroDTO livroDTO){
        Optional<Livro> optionalLivro = livroRepository.findById(id);
        if(optionalLivro.isPresent()){
            Livro livro = optionalLivro.get();
            livro.setNome(livroDTO.getNome());
            livro.setAutor(livroDTO.getAutor());
            livro.setIsbn(livroDTO.getIsbn());
            livro.setGenero(livroDTO.getGenero());

            Livro livroUpdate = livroRepository.save(livro);

            return Optional.of(this.toDTO(livroUpdate));
        }else {
            return Optional.empty();
        }
    }

    public boolean delete(Long id){

        if(livroRepository.existsById(id)){
            livroRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
