package br.com.dbserver.locarimoveis.repositorie;

import br.com.dbserver.locarimoveis.model.Aluguel;
import br.com.dbserver.locarimoveis.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AluguelRepository extends JpaRepository<Imovel, Long> {

    void saveAndFlush(Aluguel aluguel);

}
