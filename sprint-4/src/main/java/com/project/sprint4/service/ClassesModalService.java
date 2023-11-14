package com.project.sprint4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sprint4.dao.ClassesModalRepository;
import com.project.sprint4.entities.ClassesModal;
@Service
/**
 * A classe <b>ClassesModalService</b> gerencia como os dados seram manipulados.
 * @author Matheus
 * @since Nov 2023
 */
public class ClassesModalService {
	/**
     * Repositório utilizado para acessar dados da entidade ClassesModal.
     */
    @Autowired
    private ClassesModalRepository classesModalRepository;

    /**
     * Cria um novo usuário ClassesModal no banco de dados.
     *
     * @param classesModal O objeto ClassesModal a ser criado.
     * @return O objeto ClassesModal criado e salvo no banco de dados.
     */
    public ClassesModal createClassesModal(ClassesModal classesModal) {
        return classesModalRepository.save(classesModal);
    }

    /**
     * Cria uma lista de usuários ClassesModal no banco de dados.
     *
     * @param classesModal A lista de objetos ClassesModal a serem criados.
     * @return A lista de objetos ClassesModal criados e salvos no banco de dados.
     */
    public List<ClassesModal> createClassesModals(List<ClassesModal> classesModal) {
        return classesModalRepository.saveAll(classesModal);
    }

    /**
     * Obtém um usuário ClassesModal do banco de dados com base no ID fornecido.
     *
     * @param id_classes_modal O ID do usuário ClassesModal a ser recuperado.
     * @return O objeto ClassesModal associado ao ID fornecido, ou null se não encontrado.
     */
    public ClassesModal getClassesModalById(int id_classes_modal) {
        return classesModalRepository.findById(id_classes_modal).orElse(null);
    }

    /**
     * Obtém todos os usuários ClassesModal armazenados no banco de dados.
     *
     * @return Uma lista de todos os objetos ClassesModal armazenados no banco de dados.
     */
    public List<ClassesModal> getClassesModals() {
        return classesModalRepository.findAll();
    }

    /**
     * Atualiza um usuário ClassesModal existente no banco de dados.
     *
     * @param classesModal O objeto ClassesModal com os dados atualizados.
     * @return O objeto ClassesModal atualizado e salvo no banco de dados, ou um novo objeto
     * ClassesModal se o ID não for encontrado.
     */
    public ClassesModal updateClassesModal(ClassesModal classesModal) {
        ClassesModal oldUser = null;
        Optional<ClassesModal> optionalUser = classesModalRepository.findById(classesModal.getId_classes_modal());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_classes_modal(classesModal.getId_classes_modal());
            oldUser.setPeso_total(classesModal.getPeso_total());
            oldUser.setCarga_perigosa(classesModal.getCarga_perigosa());
            oldUser.setCarga_viva(classesModal.getCarga_viva());
            oldUser.setTipo_guincho(classesModal.getTipo_guincho());

            classesModalRepository.save(oldUser);
        } else {
            return new ClassesModal();
        }
        return oldUser;
    }

    /**
     * Exclui um usuário ClassesModal do banco de dados com base no ID fornecido.
     *
     * @param id_classes_modal O ID do usuário ClassesModal a ser excluído.
     * @return Uma mensagem indicando o sucesso da exclusão.
     */
    public String deleteClassesModalById(int id_classes_modal) {
        classesModalRepository.deleteById(id_classes_modal);
        return "Usuário deletado";
    }
}
