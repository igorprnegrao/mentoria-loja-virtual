package com.lojavirtualmentoria.lojavirtual.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "nota_item_produto")
@SequenceGenerator(name = "seq_nota_item_produto", sequenceName = "seq_nota_item_produto", allocationSize = 1, initialValue = 1)
public class NotaItemProduto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota_item_produto")
    private Long id;

    @Column(nullable = false)
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,
                    name = "produto_fk"))
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "nota_fiscal_compra_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,
                    name = "nota_fiscal_compra_fk"))
    private NotaFiscalCompra notaFiscalCompra;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public NotaFiscalCompra getNotaFiscalCompra() {
        return notaFiscalCompra;
    }

    public void setNotaFiscalCompra(NotaFiscalCompra notaFiscalCompra) {
        this.notaFiscalCompra = notaFiscalCompra;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof NotaItemProduto that)) return false;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
