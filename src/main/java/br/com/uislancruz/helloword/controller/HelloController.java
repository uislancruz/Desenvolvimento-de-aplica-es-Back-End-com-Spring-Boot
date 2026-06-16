package br.com.uislancruz.helloword.controller;

import br.com.uislancruz.helloword.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayhello() {
        return "Hello World!";
    }

    @GetMapping("/produtos")
    public Produto getProduto() {
        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("Notebook");
        produto.setPreco(1000.00);
        return produto;
    }

    @PostMapping("/produtos")
    public String addNewProduct(@RequestBody Produto produto) {
        System.out.println("Produto recebido: ");
        System.out.println(produto.getId() + " - " + produto.getNome() + " - " + produto.getPreco() );
        return "Produto salvo com sucesso!";
    }
}
