package br.com.dbserver.locarimoveis.repositorie;

import java.util.List;
import java.util.Optional;

import br.com.dbserver.locarimoveis.model.Imovel;
import br.com.dbserver.locarimoveis.model.enums.StatusImovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {

    List<Imovel> findAllByStatus(StatusImovel status);

    Optional<Imovel> findById(Long id);

}
