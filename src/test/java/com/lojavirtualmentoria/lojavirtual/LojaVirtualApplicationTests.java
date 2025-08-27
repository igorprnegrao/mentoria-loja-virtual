package com.lojavirtualmentoria.lojavirtual;

import com.lojavirtualmentoria.lojavirtual.controller.AcessoController;
import com.lojavirtualmentoria.lojavirtual.model.Acesso;
import com.lojavirtualmentoria.lojavirtual.repository.AcessoRepository;
import com.lojavirtualmentoria.lojavirtual.service.AcessoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = LojaVirtualApplication.class)
class LojaVirtualApplicationTests {


	@Autowired
	private AcessoController acessoController;


	@Test
	public void testCadastrarAcesso() {


		Acesso acesso = new Acesso();
		acesso.setDescricao("ROLE_ADMIN");
		acessoController.salvarAcesso(acesso);
	}

}
