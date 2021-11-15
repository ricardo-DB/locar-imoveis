package br.com.dbserver.locarimoveis.service;

import java.math.BigDecimal;
import java.util.Optional;

import br.com.dbserver.locarimoveis.model.Aluguel;
import br.com.dbserver.locarimoveis.model.Cliente;
import br.com.dbserver.locarimoveis.model.Imovel;
import br.com.dbserver.locarimoveis.model.dto.AluguelDTO;
import br.com.dbserver.locarimoveis.repositorie.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    @Autowired
    private ImovelService imovelService;

    public void salvarAluguel(AluguelDTO aluguelDTO) {

        Optional<Imovel> imovel = imovelService.buscarImovelPorId(aluguelDTO.getIdImovel());

        Aluguel aluguel = Aluguel.builder()
                .cliente(criarCliente(aluguelDTO))
                .imovel(imovel.orElseThrow())
                .periodo(aluguelDTO.getPeriodo())
                .valorTotal(imovel.map(i -> i.getValorDiaria().multiply(new BigDecimal(aluguelDTO.getPeriodo()))).orElse(BigDecimal.ZERO))
                .status(aluguelDTO.getStatus())
                .build();

        aluguelRepository.saveAndFlush(aluguel);
    }

    private Cliente criarCliente(AluguelDTO aluguelDTO) {
        return Cliente.builder()
                .telefone(aluguelDTO.getTelefone())
                .email(aluguelDTO.getEmail())
                .nome(aluguelDTO.getNome())
                .cpf(aluguelDTO.getCpf())
                .build();
    }
}
