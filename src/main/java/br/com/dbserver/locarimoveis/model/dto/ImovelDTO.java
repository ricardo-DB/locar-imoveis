package br.com.dbserver.locarimoveis.model.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImovelDTO {

    private String descricao;
    private BigDecimal valorDiaria;
    private String endereco;
    private String status;
}
