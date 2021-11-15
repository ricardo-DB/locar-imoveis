package br.com.dbserver.locarimoveis.model.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum StatusImovel {

    DISPONIVEL("Disponível"),
    OCUPADO("Ocupado");

    private String descricao;

}
