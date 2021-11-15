package br.com.dbserver.locarimoveis.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluguel {

    @Id
    private Long id;
    private Integer periodo;
    private BigDecimal valorTotal;
    private String status;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Imovel imovel;
}
