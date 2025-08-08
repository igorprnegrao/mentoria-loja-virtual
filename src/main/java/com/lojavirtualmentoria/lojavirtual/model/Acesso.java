package com.lojavirtualmentoria.lojavirtual.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
@Entity
@Table(name="acesso")
@SequenceGenerator(name="seq_acesso", sequenceName = "seq_acesso", allocationSize = 1, initialValue = 1)
public class Acesso implements GrantedAuthority {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso")
    private Long id;
    @Column(name="descricao")
    private String descricao;//acesso admin getAuthority

    @Override
    public String getAuthority() {
        return this.descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Acesso acesso)) return false;

        return getId().equals(acesso.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
