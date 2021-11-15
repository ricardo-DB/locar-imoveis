package br.com.dbserver.locarimoveis.service;

import java.util.List;
import java.util.stream.Collectors;

import br.com.dbserver.locarimoveis.model.dto.ImovelDTO;
import br.com.dbserver.locarimoveis.model.enums.StatusImovel;
import br.com.dbserver.locarimoveis.repositorie.ImovelRepository;
import br.com.dbserver.locarimoveis.service.converter.ImovelToDTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public List<ImovelDTO> buscarImoveisDisponiveis() {

        return imovelRepository.findAllByStatus(StatusImovel.DISPONIVEL)
                .stream()
                .map(imovel -> ImovelToDTOConverter.getInstance().apply(imovel))
                .collect(Collectors.toList());
    }
}
