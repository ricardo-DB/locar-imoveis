package br.com.dbserver.locarimoveis.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.dbserver.locarimoveis.model.enums.StatusImovel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "IMOVEIS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Imovel extends EntidadeBase {

    private static final long serialVersionUID = 8892352153498360707L;

    private String descricao;
    private BigDecimal valorDiaria;
    private String endereco;

    @Enumerated(EnumType.STRING)
    private StatusImovel status;
}
