package com.example.Blog.Model;

public class Post {
    private String titulo;
    private String conteudo;

    public Post(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nConteúdo: " + conteudo + "\n";
    }
}
