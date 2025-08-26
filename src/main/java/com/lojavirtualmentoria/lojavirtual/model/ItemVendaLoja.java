package com.lojavirtualmentoria.lojavirtual.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "item_venda_loja")
@SequenceGenerator(name = "seq_item_Venda_loja", sequenceName = "seq_item_Venda_loja", allocationSize = 1, initialValue = 1)
public class ItemVendaLoja implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_Venda_loja")
    private Long id;

    private Double quantidade;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,
                    name = "produto_fk"))
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "venda_compra_loja_virtual_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,
                    name = "venda_compra_loja_virtual_fk"))
    private VendaCompraLojaVirtual vendaCompraLoja;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public VendaCompraLojaVirtual getVendaCompraLoja() {
        return vendaCompraLoja;
    }

    public void setVendaCompraLoja(VendaCompraLojaVirtual vendaCompraLoja) {
        this.vendaCompraLoja = vendaCompraLoja;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof ItemVendaLoja that)) return false;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}

