package br.com.dbserver.locarimoveis.rest;

import java.util.List;

import br.com.dbserver.locarimoveis.model.dto.AluguelDTO;
import br.com.dbserver.locarimoveis.model.dto.ImovelDTO;
import br.com.dbserver.locarimoveis.service.AluguelService;
import br.com.dbserver.locarimoveis.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("imoveis")
public class AluguelRestController {

    @Autowired
    private ImovelService imovelService;

    @Autowired
    private AluguelService aluguelService;

    @GetMapping(value = "/listar")
    public List<ImovelDTO> buscarImoveisDisponiveis() {

        return imovelService.buscarImoveisDisponiveis();
    }

    @PostMapping(value = "/alugar")
    public void buscarImoveisDisponiveis(@RequestBody AluguelDTO aluguelDTO) {

        aluguelService.salvarAluguel(aluguelDTO);
    }

}
