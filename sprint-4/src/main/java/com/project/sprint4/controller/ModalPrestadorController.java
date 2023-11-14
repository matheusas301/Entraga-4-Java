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

import com.project.sprint4.entities.ModalPrestador;
import com.project.sprint4.service.ModalPrestadorService;

/**
 * Controlador REST para manipulação de recursos relacionados à entidade ModalPrestador.
 */
@RestController
public class ModalPrestadorController {

	@Autowired
    private ModalPrestadorService modalPrestadorService;
	
	/**
     * Cria uma nova instância de ClassesModal.
     *
     * @param classesModal A instância de ClassesModal a ser adicionada.
     * @return A instância de ClassesModal recém-criada.
     */
    @PostMapping("/addModalPrestador")
    public ModalPrestador addClassesModal(@RequestBody ModalPrestador modalPrestador) {
        return modalPrestadorService.createClassesModal(modalPrestador);
    }

    /**
     * Adiciona várias instâncias de ClassesModal.
     *
     * @param classesModals Lista de instâncias de ClassesModal a serem adicionadas.
     * @return Lista das instâncias de ClassesModal recém-adicionadas.
     */
    @PostMapping("/addModalPrestadores")
    public List<ModalPrestador> addClassesModals(@RequestBody List<ModalPrestador> modalPrestador) {
        return modalPrestadorService.createClassesModals(modalPrestador);
    }

    /**
     * Obtém uma instância de ClassesModal por ID.
     *
     * @param id_classes_modal O ID da instância de ClassesModal a ser recuperada.
     * @return A instância de ClassesModal correspondente ao ID fornecido.
     */
    @GetMapping("/modalPrestador/{id_modal_prestador}")
    public ModalPrestador getClassesModalById(@PathVariable int id_modal_prestador) {
        return modalPrestadorService.getClassesModalById(id_modal_prestador);
    }

    /**
     * Obtém todas as instâncias de ClassesModal.
     *
     * @return Lista de todas as instâncias de ClassesModal.
     */
    @GetMapping("/modalPrestadores")
    public List<ModalPrestador> getAllClassesModal() {
        return modalPrestadorService.getClassesModals();
    }

    /**
     * Atualiza uma instância de ClassesModal existente.
     *
     * @param classesModal A instância de ClassesModal a ser atualizada.
     * @return A instância de ClassesModal atualizada.
     */
    @PutMapping("/updateModalPrestador")
    public ModalPrestador updatClassesModal(@RequestBody ModalPrestador classesModal) {
        return modalPrestadorService.updateClassesModal(classesModal);
    }

    /**
     * Exclui uma instância de ClassesModal por ID.
     *
     * @param id_classes_modal O ID da instância de ClassesModal a ser excluída.
     * @return Mensagem indicando o resultado da exclusão.
     */
    @DeleteMapping("/deleteModalPrestador/{id_modal_prestador}")
    public String deleteClassesModal(@PathVariable int id_modal_prestador) {
        return modalPrestadorService.deleteClassesModalById(id_modal_prestador);
    }
}
