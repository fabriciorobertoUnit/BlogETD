package com.example.Blog.Controller;

import com.example.Blog.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BlogController {

    private final BlogService service;

    // Injeção de dependência via construtor (melhor para testes)
    @Autowired
    public BlogController(BlogService service) {
        this.service = service;
    }

    /**
     * Exibe a página inicial com a lista de posts
     */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("posts", service.getPostsAsString());
        return "index";
    }

    /**
     * Adiciona um novo post
     */
    @PostMapping("/add")
    public String add(@RequestParam String titulo,
                      @RequestParam String conteudo) {
        service.adicionarPost(titulo, conteudo);
        return "redirect:/";
    }

    /**
     * Desfaz a última ação (remover post)
     */
    @PostMapping("/undo")
    public String undo() {
        service.desfazer();
        return "redirect:/";
    }
}
