package com.example.Blog.Service;

import com.example.Blog.Model.DoublyLinkedList;
import com.example.Blog.Model.Post;
import com.example.Blog.Model.Stack;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    private DoublyLinkedList lista = new DoublyLinkedList();
    private Stack pilha = new Stack();

    public void adicionarPost(String titulo, String conteudo) {
        Post novo = new Post(titulo, conteudo);
        lista.adicionar(novo);
        pilha.push(novo);
    }

    public void desfazer() {
        if (!pilha.isEmpty()) {
            pilha.pop();
            lista.removerUltimo();
        }
    }

    public String getPostsAsString() {
        return lista.getAllAsString();
    }
}
