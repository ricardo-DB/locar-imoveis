package br.com.dbserver.locarimoveis.model;

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
public class Cliente {

    @Id
    private Long id;
    private String nome;
    private String telefone;
    private String cpf;
    private String email;
    private String endereco;
}
