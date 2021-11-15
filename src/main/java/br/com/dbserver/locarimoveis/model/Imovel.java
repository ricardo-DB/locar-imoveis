package br.com.dbserver.locarimoveis.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Imovel {

    @Id
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal valorDiaria;
    private String status;
}
