package com.lojavirtualmentoria.lojavirtual.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pessoa_fisica")
public class PessoaFisica extends Pessoa {
    private static final long serialVersionUID = 1L;
    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Temporal(TemporalType.DATE) //trabalhar com data JPA
    private Date dataNascimento;



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
