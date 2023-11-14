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
import com.project.sprint4.entities.ApoliceEmpresa;
import com.project.sprint4.service.ApoliceEmpresaService;

/**
 * Controlador REST para manipulação de recursos relacionados à entidade ApoliceEmpresa.
 */
@RestController
public class ApoliceEmpresaController {

    @Autowired
    private ApoliceEmpresaService apoliceEmpresaService;

    /**
     * Cria uma nova apólice de empresa.
     *
     * @param apoliceEmpresa A apólice de empresa a ser adicionada.
     * @return A apólice de empresa recém-criada.
     */
    @PostMapping("/addApoliceEmpresa")
    public ApoliceEmpresa addApoliceEmpresa(@RequestBody ApoliceEmpresa apoliceEmpresa) {
        return apoliceEmpresaService.createApoliceEmpresa(apoliceEmpresa);
    }

    /**
     * Adiciona várias apólices de empresa.
     *
     * @param apoliceEmpresas Lista de apólices de empresa a serem adicionadas.
     * @return Lista das apólices de empresa recém-adicionadas.
     */
    @PostMapping("/addApoliceEmpresas")
    public List<ApoliceEmpresa> addApoliceEmpresas(@RequestBody List<ApoliceEmpresa> apoliceEmpresas) {
        return apoliceEmpresaService.createApoliceEmpresas(apoliceEmpresas);
    }

    /**
     * Obtém uma apólice de empresa por ID.
     *
     * @param id_apolice_emp O ID da apólice de empresa a ser recuperada.
     * @return A apólice de empresa correspondente ao ID fornecido.
     */
    @GetMapping("/apoliceEmpresa/{id_apolice_emp}")
    public ApoliceEmpresa getApoliceEmpresaById(@PathVariable int id_apolice_emp) {
        return apoliceEmpresaService.getApoliceEmpresaById(id_apolice_emp);
    }

    /**
     * Obtém todas as apólices de empresa.
     *
     * @return Lista de todas as apólices de empresa.
     */
    @GetMapping("/apoliceEmpresas")
    public List<ApoliceEmpresa> getAllApoliceEmpresa() {
        return apoliceEmpresaService.getApoliceEmpresas();
    }

    /**
     * Atualiza uma apólice de empresa existente.
     *
     * @param apoliceEmpresa A apólice de empresa a ser atualizada.
     * @return A apólice de empresa atualizada.
     */
    @PutMapping("/updateApoliceEmpresa")
    public ApoliceEmpresa updatApoliceEmpresa(@RequestBody ApoliceEmpresa apoliceEmpresa) {
        return apoliceEmpresaService.updateApoliceEmpresa(apoliceEmpresa);
    }

    /**
     * Exclui uma apólice de empresa por ID.
     *
     * @param id_apolice_emp O ID da apólice de empresa a ser excluída.
     * @return Mensagem indicando o resultado da exclusão.
     */
    @DeleteMapping("/deleteApoliceEmpresa/{id_apolice_emp}")
    public String deleteApoliceEmpresa(@PathVariable int id_apolice_emp) {
        return apoliceEmpresaService.deleteApoliceEmpresaById(id_apolice_emp);
    }
}
