package br.com.dbserver.locarimoveis.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Cliente implements Serializable {

    private static final long serialVersionUID = -2548091420192768565L;

    private String nome;
    private String telefone;
    private String cpf;
    private String email;

}
