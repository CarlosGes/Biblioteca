package com.example.Biblioteca.DTO;

public class LivroDTO {
    private Long idLivro;
    private String nome;
    private String autor;
    private int isbn;
    private String genero;

    public LivroDTO() {

    }

    public LivroDTO(Long idLivro, String nome, String autor, int isbn, String genero) {
        this.idLivro = idLivro;
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
    }

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long idLivro) {
        this.idLivro = idLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

