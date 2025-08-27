package com.lojavirtualmentoria.lojavirtual.service;

import com.lojavirtualmentoria.lojavirtual.model.Acesso;
import com.lojavirtualmentoria.lojavirtual.repository.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessoService {
    @Autowired
    private AcessoRepository acessoRepository;

    public Acesso save(Acesso acesso){

        /*qualquer tipo de validação*/
        return acessoRepository.save(acesso);

    }
}
