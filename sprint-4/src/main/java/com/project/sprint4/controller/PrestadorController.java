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
import com.project.sprint4.entities.Prestador;
import com.project.sprint4.service.PrestadorService;

/**
 * Controlador REST para manipulação de recursos relacionados à entidade Prestador.
 */
@RestController
public class PrestadorController {

    @Autowired
    private PrestadorService prestadorService;

    /**
     * Cria um novo prestador.
     *
     * @param prestador O prestador a ser adicionado.
     * @return O prestador recém-criado.
     */
    @PostMapping("/addPrestador")
    public Prestador addPrestador(@RequestBody Prestador prestador) {
        return prestadorService.createPrestador(prestador);
    }

    /**
     * Adiciona vários prestadores.
     *
     * @param prestadores Lista de prestadores a serem adicionados.
     * @return Lista dos prestadores recém-adicionados.
     */
    @PostMapping("/addPrestadores")
    public List<Prestador> addPrestadores(@RequestBody List<Prestador> prestadores) {
        return prestadorService.createPrestadores(prestadores);
    }

    /**
     * Obtém um prestador por ID.
     *
     * @param id_prestador O ID do prestador a ser recuperado.
     * @return O prestador correspondente ao ID fornecido.
     */
    @GetMapping("/prestador/{id_prestador}")
    public Prestador getPrestadorById(@PathVariable int id_prestador) {
        return prestadorService.getPrestadorById(id_prestador);
    }

    /**
     * Obtém todos os prestadores.
     *
     * @return Lista de todos os prestadores.
     */
    @GetMapping("/prestadores")
    public List<Prestador> getAllPrestador() {
        return prestadorService.getPrestadores();
    }

    /**
     * Atualiza um prestador existente.
     *
     * @param prestador O prestador a ser atualizado.
     * @return O prestador atualizado.
     */
    @PutMapping("/updatePrestador")
    public Prestador updatPrestador(@RequestBody Prestador prestador) {
        return prestadorService.updatePrestador(prestador);
    }

    /**
     * Exclui um prestador por ID.
     *
     * @param id_prestador O ID do prestador a ser excluído.
     * @return Mensagem indicando o resultado da exclusão.
     */
    @DeleteMapping("/deletePrestador/{id_prestador}")
    public String deletePrestador(@PathVariable int id_prestador) {
        return prestadorService.deletePrestadorById(id_prestador);
    }
}
