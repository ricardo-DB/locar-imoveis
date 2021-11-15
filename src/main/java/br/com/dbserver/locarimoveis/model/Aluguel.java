package br.com.dbserver.locarimoveis.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.dbserver.locarimoveis.model.enums.StatusPagamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ALUGUEIS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluguel extends EntidadeBase {

    private static final long serialVersionUID = -7061891405925027031L;

    private Integer periodo;
    private BigDecimal valorTotal;

    @Enumerated(EnumType.STRING)
    private StatusPagamento status;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Imovel imovel;
}
