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
import com.project.sprint4.entities.CaminhaoCli;
import com.project.sprint4.service.CaminhaoCliService;

/**
 * Controlador REST para manipulação de recursos relacionados à entidade CaminhaoCli.
 */
@RestController
public class CaminhaoCliController {

    @Autowired
    private CaminhaoCliService caminhaoCliService;

    /**
     * Cria uma nova instância de CaminhaoCli.
     *
     * @param caminhaoCli A instância de CaminhaoCli a ser adicionada.
     * @return A instância de CaminhaoCli recém-criada.
     */
    @PostMapping("/addCaminhaoCli")
    public CaminhaoCli addCaminhaoCli(@RequestBody CaminhaoCli caminhaoCli) {
        return caminhaoCliService.createCaminhaoCli(caminhaoCli);
    }

    /**
     * Adiciona várias instâncias de CaminhaoCli.
     *
     * @param caminhaoClis Lista de instâncias de CaminhaoCli a serem adicionadas.
     * @return Lista das instâncias de CaminhaoCli recém-adicionadas.
     */
    @PostMapping("/addCaminhaoClis")
    public List<CaminhaoCli> addCaminhaoClis(@RequestBody List<CaminhaoCli> caminhaoClis) {
        return caminhaoCliService.createCaminhaoClis(caminhaoClis);
    }

    /**
     * Obtém uma instância de CaminhaoCli por ID.
     *
     * @param id_caminhao_cli O ID da instância de CaminhaoCli a ser recuperada.
     * @return A instância de CaminhaoCli correspondente ao ID fornecido.
     */
    @GetMapping("/caminhaoCli/{id_caminhao_cli}")
    public CaminhaoCli getCaminhaoCliById(@PathVariable int id_caminhao_cli) {
        return caminhaoCliService.getCaminhaoCliById(id_caminhao_cli);
    }

    /**
     * Obtém todas as instâncias de CaminhaoCli.
     *
     * @return Lista de todas as instâncias de CaminhaoCli.
     */
    @GetMapping("/caminhaoClis")
    public List<CaminhaoCli> getAllCaminhaoCli() {
        return caminhaoCliService.getCaminhaoClis();
    }

    /**
     * Atualiza uma instância de CaminhaoCli existente.
     *
     * @param caminhaoCli A instância de CaminhaoCli a ser atualizada.
     * @return A instância de CaminhaoCli atualizada.
     */
    @PutMapping("/updateCaminhaoCli")
    public CaminhaoCli updatCaminhaoCli(@RequestBody CaminhaoCli caminhaoCli) {
        return caminhaoCliService.updateCaminhaoCli(caminhaoCli);
    }

    /**
     * Exclui uma instância de CaminhaoCli por ID.
     *
     * @param id_caminhao_cli O ID da instância de CaminhaoCli a ser excluída.
     * @return Mensagem indicando o resultado da exclusão.
     */
    @DeleteMapping("/deleteCaminhaoCli/{id_caminhao_cli}")
    public String deleteCaminhaoCli(@PathVariable int id_caminhao_cli) {
        return caminhaoCliService.deleteCaminhaoCliById(id_caminhao_cli);
    }
}