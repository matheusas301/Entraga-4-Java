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
import com.project.sprint4.entities.OrdemServicoEmpresa;
import com.project.sprint4.service.OrdemServicoEmpresaService;

/**
 * Controlador REST para manipulação de recursos relacionados à entidade OrdemServicoEmpresa.
 */
@RestController
public class OrdemServicoEmpresaController {

    @Autowired
    private OrdemServicoEmpresaService userService;

    /**
     * Cria uma nova instância de OrdemServicoEmpresa.
     *
     * @param ordemServicoEmpresa A instância de OrdemServicoEmpresa a ser adicionada.
     * @return A instância de OrdemServicoEmpresa recém-criada.
     */
    @PostMapping("/addOrdemServicoEmpresa")
    public OrdemServicoEmpresa addOrdemServicoEmpresa(@RequestBody OrdemServicoEmpresa ordemServicoEmpresa) {
        return userService.createOrdemServicoEmpresa(ordemServicoEmpresa);
    }

    /**
     * Adiciona várias instâncias de OrdemServicoEmpresa.
     *
     * @param ordemServicoEmpresas Lista de instâncias de OrdemServicoEmpresa a serem adicionadas.
     * @return Lista das instâncias de OrdemServicoEmpresa recém-adicionadas.
     */
    @PostMapping("/addOrdemServicoEmpresas")
    public List<OrdemServicoEmpresa> addOrdemServicoEmpresas(@RequestBody List<OrdemServicoEmpresa> ordemServicoEmpresas) {
        return userService.createOrdemServicoEmpresas(ordemServicoEmpresas);
    }

    /**
     * Obtém uma instância de OrdemServicoEmpresa por ID.
     *
     * @param id_ordem_serv_emp O ID da instância de OrdemServicoEmpresa a ser recuperada.
     * @return A instância de OrdemServicoEmpresa correspondente ao ID fornecido.
     */
    @GetMapping("/ordemServicoEmpresa/{id_ordem_serv_emp}")
    public OrdemServicoEmpresa getOrdemServicoEmpresaById(@PathVariable int id_ordem_serv_emp) {
        return userService.getOrdemServicoEmpresaById(id_ordem_serv_emp);
    }

    /**
     * Obtém todas as instâncias de OrdemServicoEmpresa.
     *
     * @return Lista de todas as instâncias de OrdemServicoEmpresa.
     */
    @GetMapping("/ordemServicoEmpresas")
    public List<OrdemServicoEmpresa> getAllOrdemServicoEmpresa() {
        return userService.getOrdemServicoEmpresas();
    }

    /**
     * Atualiza uma instância de OrdemServicoEmpresa existente.
     *
     * @param ordemServicoEmpresa A instância de OrdemServicoEmpresa a ser atualizada.
     * @return A instância de OrdemServicoEmpresa atualizada.
     */
    @PutMapping("/updateOrdemServicoEmpresa")
    public OrdemServicoEmpresa updatOrdemServicoEmpresa(@RequestBody OrdemServicoEmpresa ordemServicoEmpresa) {
        return userService.updateOrdemServicoEmpresa(ordemServicoEmpresa);
    }

    /**
     * Exclui uma instância de OrdemServicoEmpresa por ID.
     *
     * @param id_ordem_serv_emp O ID da instância de OrdemServicoEmpresa a ser excluída.
     * @return Mensagem indicando o resultado da exclusão.
     */
    @DeleteMapping("/deleteOrdemServicoEmpresa/{id_ordem_serv_emp}")
    public String deleteOrdemServicoEmpresa(@PathVariable int id_ordem_serv_emp) {
        return userService.deleteOrdemServicoEmpresaById(id_ordem_serv_emp);
    }
}
