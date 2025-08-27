package com.lojavirtualmentoria.lojavirtual.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity  //JPA annotation = criar entidade
@Table(name="marca_produto") // criar o nome da tabela
@SequenceGenerator(name="seq_marca_produto", sequenceName = "seq_marca_produto", allocationSize = 1, initialValue = 1)
public class MarcaProduto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id //id da entidade
    //usar o sequencegenerator id ser gerado na ordem 1, 2, 3, 4, etc..
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
    private Long id;
    @Column(name="nome_descricao", nullable = false)
    private String nomeDescricao;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDescricao() {
        return nomeDescricao;
    }

    public void setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof MarcaProduto that)) return false;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
