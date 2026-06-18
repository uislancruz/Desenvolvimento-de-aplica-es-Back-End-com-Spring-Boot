package br.com.uislancruz.helloword.controller;

import br.com.uislancruz.helloword.model.Produto;
import br.com.uislancruz.helloword.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    @Qualifier("v1")
    private IMessageService service;

    @GetMapping("/hello")
    public String sayhello() {
        return service.sayCustomMessage("Hello World");
    }


}
