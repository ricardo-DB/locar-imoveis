package br.com.dbserver.locarimoveis.service.converter;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

import br.com.dbserver.locarimoveis.model.Imovel;
import br.com.dbserver.locarimoveis.model.dto.ImovelDTO;

public class ImovelToDTOConverter implements Function<Imovel, ImovelDTO> {

    private static ImovelToDTOConverter instance;

    private ImovelToDTOConverter() {

    }

    public static ImovelToDTOConverter getInstance() {

        if (Objects.isNull(instance)) {
            instance = new ImovelToDTOConverter();
        }

        return instance;
    }

    @Override
    public ImovelDTO apply(Imovel input) {

        return Optional.ofNullable(input).map(ImovelToDTOConverter::convert)
                .orElse(null);

    }

    private static ImovelDTO convert(Imovel input) {

        return ImovelDTO.builder()
                .descricao(input.getDescricao())
                .endereco(input.getEndereco())
                .valorDiaria(input.getValorDiaria())
                .status(input.getStatus().getDescricao())
                .build();
    }
}
