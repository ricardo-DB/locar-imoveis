package br.com.dbserver.locarimoveis.model.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum StatusPagamento {

    PAGO("Pago"),
    PENDENTE("Pendente");

    private String descricao;

}
