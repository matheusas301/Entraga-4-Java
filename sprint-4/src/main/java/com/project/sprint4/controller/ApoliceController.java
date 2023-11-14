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

import com.project.sprint4.entities.Apolice;
import com.project.sprint4.service.ApoliceService;

/**
 * Controlador REST para manipulação de recursos relacionados à entidade Apolice.
 */
@RestController
public class ApoliceController {

    @Autowired
    private ApoliceService apoliceService;

    /**
     * Cria uma nova apólice.
     *
     * @param apolice A apólice a ser adicionada.
     * @return A apólice recém-criada.
     */
    @PostMapping("/addApolice")
    public Apolice addApolice(@RequestBody Apolice apolice) {
        return apoliceService.createApolice(apolice);
    }

    /**
     * Adiciona várias apólices.
     *
     * @param apolices Lista de apólices a serem adicionadas.
     * @return Lista das apólices recém-adicionadas.
     */
    @PostMapping("/addApolices")
    public List<Apolice> addApolices(@RequestBody List<Apolice> apolices) {
        return apoliceService.createApolices(apolices);
    }

    /**
     * Obtém uma apólice por ID.
     *
     * @param id_apolice O ID da apólice a ser recuperada.
     * @return A apólice correspondente ao ID fornecido.
     */
    @GetMapping("/Apolice/{id_apolice}")
    public Apolice getApoliceById(@PathVariable int id_apolice) {
        return apoliceService.getApoliceById(id_apolice);
    }

    /**
     * Obtém todas as apólices.
     *
     * @return Lista de todas as apólices.
     */
    @GetMapping("/Apolices")
    public List<Apolice> getAllApolice() {
        return apoliceService.getApolices();
    }

    /**
     * Atualiza uma apólice existente.
     *
     * @param apolice A apólice a ser atualizada.
     * @return A apólice atualizada.
     */
    @PutMapping("/updateApolice")
    public Apolice updatApolice(@RequestBody Apolice apolice) {
        return apoliceService.updateApolice(apolice);
    }

    /**
     * Exclui uma apólice por ID.
     *
     * @param id_apolice O ID da apólice a ser excluída.
     * @return Mensagem indicando o resultado da exclusão.
     */
    @DeleteMapping("/deleteApolice/{id_apolice}")
    public String deleteApolice(@PathVariable int id_apolice) {
        return apoliceService.deleteApoliceById(id_apolice);
    }
}
