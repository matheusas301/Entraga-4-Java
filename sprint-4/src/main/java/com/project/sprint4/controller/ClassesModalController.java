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
import com.project.sprint4.entities.ClassesModal;
import com.project.sprint4.service.ClassesModalService;

/**
 * Controlador REST para manipulação de recursos relacionados à entidade ClassesModal.
 */
@RestController
public class ClassesModalController {

    @Autowired
    private ClassesModalService classesModalService;

    /**
     * Cria uma nova instância de ClassesModal.
     *
     * @param classesModal A instância de ClassesModal a ser adicionada.
     * @return A instância de ClassesModal recém-criada.
     */
    @PostMapping("/addClassesModal")
    public ClassesModal addClassesModal(@RequestBody ClassesModal classesModal) {
        return classesModalService.createClassesModal(classesModal);
    }

    /**
     * Adiciona várias instâncias de ClassesModal.
     *
     * @param classesModals Lista de instâncias de ClassesModal a serem adicionadas.
     * @return Lista das instâncias de ClassesModal recém-adicionadas.
     */
    @PostMapping("/addClassesModals")
    public List<ClassesModal> addClassesModals(@RequestBody List<ClassesModal> classesModals) {
        return classesModalService.createClassesModals(classesModals);
    }

    /**
     * Obtém uma instância de ClassesModal por ID.
     *
     * @param id_classes_modal O ID da instância de ClassesModal a ser recuperada.
     * @return A instância de ClassesModal correspondente ao ID fornecido.
     */
    @GetMapping("/classesModal/{id_classes_modal}")
    public ClassesModal getClassesModalById(@PathVariable int id_classes_modal) {
        return classesModalService.getClassesModalById(id_classes_modal);
    }

    /**
     * Obtém todas as instâncias de ClassesModal.
     *
     * @return Lista de todas as instâncias de ClassesModal.
     */
    @GetMapping("/classesModals")
    public List<ClassesModal> getAllClassesModal() {
        return classesModalService.getClassesModals();
    }

    /**
     * Atualiza uma instância de ClassesModal existente.
     *
     * @param classesModal A instância de ClassesModal a ser atualizada.
     * @return A instância de ClassesModal atualizada.
     */
    @PutMapping("/updateClassesModal")
    public ClassesModal updatClassesModal(@RequestBody ClassesModal classesModal) {
        return classesModalService.updateClassesModal(classesModal);
    }

    /**
     * Exclui uma instância de ClassesModal por ID.
     *
     * @param id_classes_modal O ID da instância de ClassesModal a ser excluída.
     * @return Mensagem indicando o resultado da exclusão.
     */
    @DeleteMapping("/deleteClassesModal/{id_classes_modal}")
    public String deleteClassesModal(@PathVariable int id_classes_modal) {
        return classesModalService.deleteClassesModalById(id_classes_modal);
    }
}
