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
import com.project.sprint4.entities.EmpresaVeiculo;
import com.project.sprint4.service.EmpresaVeiculoService;

/**
 * Controlador REST para manipulação de recursos relacionados à entidade EmpresaVeiculo.
 */
@RestController
public class EmpresaVeiculoController {

    @Autowired
    private EmpresaVeiculoService empresaVeiculoService;

    /**
     * Cria uma nova instância de EmpresaVeiculo.
     *
     * @param empresaVeiculo A instância de EmpresaVeiculo a ser adicionada.
     * @return A instância de EmpresaVeiculo recém-criada.
     */
    @PostMapping("/addEmpresaVeiculo")
    public EmpresaVeiculo addEmpresaVeiculo(@RequestBody EmpresaVeiculo empresaVeiculo) {
        return empresaVeiculoService.createEmpresaVeiculo(empresaVeiculo);
    }

    /**
     * Adiciona várias instâncias de EmpresaVeiculo.
     *
     * @param empresaVeiculos Lista de instâncias de EmpresaVeiculo a serem adicionadas.
     * @return Lista das instâncias de EmpresaVeiculo recém-adicionadas.
     */
    @PostMapping("/addEmpresaVeiculos")
    public List<EmpresaVeiculo> addEmpresaVeiculos(@RequestBody List<EmpresaVeiculo> empresaVeiculos) {
        return empresaVeiculoService.createEmpresaVeiculos(empresaVeiculos);
    }

    /**
     * Obtém uma instância de EmpresaVeiculo por ID.
     *
     * @param id_emp_veiculo O ID da instância de EmpresaVeiculo a ser recuperada.
     * @return A instância de EmpresaVeiculo correspondente ao ID fornecido.
     */
    @GetMapping("/empresaVeiculo/{id_emp_veiculo}")
    public EmpresaVeiculo getEmpresaVeiculoById(@PathVariable int id_emp_veiculo) {
        return empresaVeiculoService.getEmpresaVeiculoById(id_emp_veiculo);
    }

    /**
     * Obtém todas as instâncias de EmpresaVeiculo.
     *
     * @return Lista de todas as instâncias de EmpresaVeiculo.
     */
    @GetMapping("/empresaVeiculo")
    public List<EmpresaVeiculo> getAllEmpresaVeiculo() {
        return empresaVeiculoService.getEmpresaVeiculos();
    }

    /**
     * Atualiza uma instância de EmpresaVeiculo existente.
     *
     * @param empresaVeiculo A instância de EmpresaVeiculo a ser atualizada.
     * @return A instância de EmpresaVeiculo atualizada.
     */
    @PutMapping("/updateEmpresaVeiculo")
    public EmpresaVeiculo updatEmpresaVeiculo(@RequestBody EmpresaVeiculo empresaVeiculo) {
        return empresaVeiculoService.updateEmpresaVeiculo(empresaVeiculo);
    }

    /**
     * Exclui uma instância de EmpresaVeiculo por ID.
     *
     * @param id_emp_veiculo O ID da instância de EmpresaVeiculo a ser excluída.
     * @return Mensagem indicando o resultado da exclusão.
     */
    @DeleteMapping("/deleteEmpresaVeiculo/{id_emp_veiculo}")
    public String deleteEmpresaVeiculo(@PathVariable int id_emp_veiculo) {
        return empresaVeiculoService.deleteEmpresaVeiculoById(id_emp_veiculo);
    }
}
