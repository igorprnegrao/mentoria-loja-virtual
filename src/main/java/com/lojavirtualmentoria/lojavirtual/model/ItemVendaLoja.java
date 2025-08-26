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

}
