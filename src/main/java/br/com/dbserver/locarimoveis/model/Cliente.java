package br.com.dbserver.locarimoveis.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CLIENTES")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente extends EntidadeBase {

    private static final long serialVersionUID = -2548091420192768565L;

    private String nome;
    private String telefone;
    private String cpf;
    private String email;

}
