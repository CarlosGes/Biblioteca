package com.example.Biblioteca.Entity;

import jakarta.persistence.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivro;
    private String nome;
    private String autor;
    private String isbn;
    private String genero;


    public Livro(Long idLivro, String nome, String autor, String isbn, String genero) {
        this.idLivro = idLivro;
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
    }

    public Livro() {

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
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
