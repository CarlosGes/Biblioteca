package com.example.Biblioteca.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivro;
    private String nome;
    private String autor;
    private int isbn;
    private String genero;


    public Livro(Long idLivro, String nome, String autor, int isbn, String genero) {
        this.idLivro = idLivro;
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
    }

    @ManyToMany(mappedBy = "livros")
    @JsonIgnore
    private Set<Emprestimo> emprestimos;

    public Livro() {

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long idLivro) {
        this.idLivro = idLivro;
    }
}
