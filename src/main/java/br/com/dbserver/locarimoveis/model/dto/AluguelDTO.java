package br.com.dbserver.locarimoveis.model.dto;

import br.com.dbserver.locarimoveis.model.enums.StatusPagamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Jacksonized
public class AluguelDTO {

    private Long idImovel;
    private String nome;
    private String telefone;
    private String cpf;
    private String email;
    private Integer periodo;
    private StatusPagamento status;
}
