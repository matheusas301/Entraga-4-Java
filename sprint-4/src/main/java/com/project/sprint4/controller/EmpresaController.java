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
import com.project.sprint4.entities.Empresa;
import com.project.sprint4.service.EmpresaService;

/**
 * Controlador REST para manipulação de recursos relacionados à entidade Empresa.
 */
@RestController
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    /**
     * Cria uma nova instância de Empresa.
     *
     * @param empresa A instância de Empresa a ser adicionada.
     * @return A instância de Empresa recém-criada.
     */
    @PostMapping("/addEmpresa")
    public Empresa addEmpresa(@RequestBody Empresa empresa) {
        return empresaService.createEmpresa(empresa);
    }

    /**
     * Adiciona várias instâncias de Empresa.
     *
     * @param empresas Lista de instâncias de Empresa a serem adicionadas.
     * @return Lista das instâncias de Empresa recém-adicionadas.
     */
    @PostMapping("/addEmpresas")
    public List<Empresa> addEmpresas(@RequestBody List<Empresa> empresas) {
        return empresaService.createEmpresas(empresas);
    }

    /**
     * Obtém uma instância de Empresa por ID.
     *
     * @param id_emp O ID da instância de Empresa a ser recuperada.
     * @return A instância de Empresa correspondente ao ID fornecido.
     */
    @GetMapping("/empresa/{id_emp}")
    public Empresa getEmpresaById(@PathVariable int id_emp) {
        return empresaService.getEmpresaById(id_emp);
    }

    /**
     * Obtém todas as instâncias de Empresa.
     *
     * @return Lista de todas as instâncias de Empresa.
     */
    @GetMapping("/empresas")
    public List<Empresa> getAllEmpresa() {
        return empresaService.getEmpresas();
    }

    /**
     * Atualiza uma instância de Empresa existente.
     *
     * @param empresa A instância de Empresa a ser atualizada.
     * @return A instância de Empresa atualizada.
     */
    @PutMapping("/updateEmpresa")
    public Empresa updatEmpresa(@RequestBody Empresa empresa) {
        return empresaService.updateEmpresa(empresa);
    }

    /**
     * Exclui uma instância de Empresa por ID.
     *
     * @param id_emp O ID da instância de Empresa a ser excluída.
     * @return Mensagem indicando o resultado da exclusão.
     */
    @DeleteMapping("/deleteEmpresa/{id_emp}")
    public String deleteEmpresa(@PathVariable int id_emp) {
        return empresaService.deleteEmpresaById(id_emp);
    }
}