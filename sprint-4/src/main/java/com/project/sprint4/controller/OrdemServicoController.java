package com.project.sprint4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.sprint4.entities.OrdemServico;
import com.project.sprint4.service.OrdemServicoService;

/**
 * Controlador REST para manipulação de recursos relacionados à entidade OrdemServico.
 */
@RestController
public class OrdemServicoController {

    @Autowired
    private OrdemServicoService ordemServicoService;

    /**
     * Cria uma nova instância de OrdemServico.
     *
     * @param ordemServico A instância de OrdemServico a ser adicionada.
     * @return A instância de OrdemServico recém-criada.
     */
    @PostMapping("/addOrdemServico")
    public OrdemServico addOrdemServico(@RequestBody OrdemServico ordemServico) {
        return ordemServicoService.createOrdemServico(ordemServico);
    }

    /**
     * Adiciona várias instâncias de OrdemServico.
     *
     * @param ordemServicos Lista de instâncias de OrdemServico a serem adicionadas.
     * @return Lista das instâncias de OrdemServico recém-adicionadas.
     */
    @PostMapping("/addOrdemServicos")
    public List<OrdemServico> addOrdemServicos(@RequestBody List<OrdemServico> ordemServicos) {
        return ordemServicoService.createOrdemServicos(ordemServicos);
    }

    /**
     * Obtém uma instância de OrdemServico por ID.
     *
     * @param id_ordem_serv O ID da instância de OrdemServico a ser recuperada.
     * @return A instância de OrdemServico correspondente ao ID fornecido.
     */
    @GetMapping("/ordemServico/{id_ordem_serv}")
    public OrdemServico getOrdemServicoById(@PathVariable int id_ordem_serv) {
        return ordemServicoService.getOrdemServicoById(id_ordem_serv);
    }

    /**
     * Obtém todas as instâncias de OrdemServico.
     *
     * @return Lista de todas as instâncias de OrdemServico.
     */
    @GetMapping("/ordemServicos")
    public List<OrdemServico> getAllOrdemServico() {
        return ordemServicoService.getOrdemServicos();
    }

    /**
     * Atualiza uma instância de OrdemServico existente.
     *
     * @param ordemServico A instância de OrdemServico a ser atualizada.
     * @return A instância de OrdemServico atualizada.
     */
    @PutMapping("/updateOrdemServico")
    public OrdemServico updatOrdemServico(@RequestBody OrdemServico ordemServico) {
        return ordemServicoService.updateOrdemServico(ordemServico);
    }

    /**
     * Exclui uma instância de OrdemServico por ID.
     *
     * @param id_ordem_serv O ID da instância de OrdemServico a ser excluída.
     * @return Mensagem indicando o resultado da exclusão.
     */
    @DeleteMapping("/deleteOrdemServico/{id_ordem_serv}")
    public String deleteOrdemServico(@PathVariable int id_ordem_serv) {
        return ordemServicoService.deleteOrdemServicoById(id_ordem_serv);
    }
}