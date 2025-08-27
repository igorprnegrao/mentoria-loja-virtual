package com.lojavirtualmentoria.lojavirtual.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "cupom_desconto")
@SequenceGenerator(name = "seq_cupom_desconto", sequenceName = "seq_cupom_desconto", allocationSize = 1, initialValue = 1)
public class CupomDesconto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cupom_desconto")
    private String id;

    @Column(nullable = false)
    private String codigoDesconto;

    private BigDecimal valorRealDesconto;

    private BigDecimal valorPorcentagemDesconto;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataValidadeDesconto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigoDesconto() {
        return codigoDesconto;
    }

    public void setCodigoDesconto(String codigoDesconto) {
        this.codigoDesconto = codigoDesconto;
    }

    public BigDecimal getValorRealDesconto() {
        return valorRealDesconto;
    }

    public void setValorRealDesconto(BigDecimal valorRealDesconto) {
        this.valorRealDesconto = valorRealDesconto;
    }

    public BigDecimal getValorPorcentagemDesconto() {
        return valorPorcentagemDesconto;
    }

    public void setValorPorcentagemDesconto(BigDecimal valorPorcentagemDesconto) {
        this.valorPorcentagemDesconto = valorPorcentagemDesconto;
    }

    public Date getDataValidadeDesconto() {
        return dataValidadeDesconto;
    }

    public void setDataValidadeDesconto(Date dataValidadeDesconto) {
        this.dataValidadeDesconto = dataValidadeDesconto;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof CupomDesconto that)) return false;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }


}


