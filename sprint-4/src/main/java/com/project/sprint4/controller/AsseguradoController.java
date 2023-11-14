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
import com.project.sprint4.entities.Assegurado;
import com.project.sprint4.service.AsseguradoService;

/**
 * Controlador REST para manipulação de recursos relacionados à entidade Assegurado.
 */
@RestController
public class AsseguradoController {

    @Autowired
    private AsseguradoService asseguradoService;

    /**
     * Cria um novo assegurado.
     *
     * @param assegurado O assegurado a ser adicionado.
     * @return O assegurado recém-criado.
     */
    @PostMapping("/addAssegurado")
    public Assegurado addAssegurado(@RequestBody Assegurado assegurado) {
        return asseguradoService.createAssegurado(assegurado);
    }

    /**
     * Adiciona vários assegurados.
     *
     * @param assegurados Lista de assegurados a serem adicionados.
     * @return Lista dos assegurados recém-adicionados.
     */
    @PostMapping("/addAssegurados")
    public List<Assegurado> addAssegurados(@RequestBody List<Assegurado> assegurados) {
        return asseguradoService.createAssegurados(assegurados);
    }

    /**
     * Obtém um assegurado por ID.
     *
     * @param id_assegurado O ID do assegurado a ser recuperado.
     * @return O assegurado correspondente ao ID fornecido.
     */
    @GetMapping("/assegurado/{id_assegurado}")
    public Assegurado getAsseguradoById(@PathVariable int id_assegurado) {
        return asseguradoService.getAsseguradoById(id_assegurado);
    }

    /**
     * Obtém todos os assegurados.
     *
     * @return Lista de todos os assegurados.
     */
    @GetMapping("/assegurados")
    public List<Assegurado> getAllAssegurado() {
        return asseguradoService.getAssegurados();
    }

    /**
     * Atualiza um assegurado existente.
     *
     * @param assegurado O assegurado a ser atualizado.
     * @return O assegurado atualizado.
     */
    @PutMapping("/updateAssegurado")
    public Assegurado updateAssegurado(@RequestBody Assegurado assegurado) {
        return asseguradoService.updateAssegurado(assegurado);
    }

    /**
     * Exclui um assegurado por ID.
     *
     * @param id_assegurado O ID do assegurado a ser excluído.
     * @return Mensagem indicando o resultado da exclusão.
     */
    @DeleteMapping("/deleteAssegurado/{id_assegurado}")
    public String deleteAssegurado(@PathVariable int id_assegurado) {
        return asseguradoService.deleteAsseguradoById(id_assegurado);
    }
}
