package com.lojavirtualmentoria.lojavirtual.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "imagem_produto")
@SequenceGenerator(name = "seq_imagem_produto", sequenceName ="seq_imagem_produto", allocationSize = 1, initialValue = 1)
public class ImagemProduto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_imagem_produto")
    private Long id;

    @Column(columnDefinition = "text", nullable = false)
    private String imagemOriginal;

    @Column(columnDefinition = "text", nullable = false)
    private String imagemMiniatura;

    @ManyToOne(targetEntity = Produto.class)
    @JoinColumn(name = "produto_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
    private Produto produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagemOriginal() {
        return imagemOriginal;
    }

    public void setImagemOriginal(String imagemOriginal) {
        this.imagemOriginal = imagemOriginal;
    }

    public String getImagemMiniatura() {
        return imagemMiniatura;
    }

    public void setImagemMiniatura(String imagemMiniatura) {
        this.imagemMiniatura = imagemMiniatura;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof ImagemProduto that)) return false;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
