package com.lojavirtualmentoria.lojavirtual.controller;

import com.lojavirtualmentoria.lojavirtual.model.Acesso;
import com.lojavirtualmentoria.lojavirtual.service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AcessoController {

    @Autowired
    private AcessoService acessoService;

    @PostMapping("/salvarAcesso")
    public Acesso salvarAcesso(Acesso acesso){
        return acessoService.save(acesso);
    }
}
