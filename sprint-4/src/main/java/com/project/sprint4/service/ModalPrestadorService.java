package com.project.sprint4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.sprint4.dao.ModalPrestadorRepository;
import com.project.sprint4.entities.ModalPrestador;


@Service
/**
 * A classe <b>ModalPrestadorService</b> gerencia como os dados seram manipulados.
 * @author Matheus
 * @since Nov 2023
 */
public class ModalPrestadorService {
	/**
     * Repositório utilizado para acessar dados da entidade ClassesModal.
     */
    @Autowired
    private ModalPrestadorRepository modalPrestadorRepository;

    /**
     * Cria um novo usuário ClassesModal no banco de dados.
     *
     * @param classesModal O objeto ClassesModal a ser criado.
     * @return O objeto ClassesModal criado e salvo no banco de dados.
     */
    public ModalPrestador createClassesModal(ModalPrestador modalPrestador) {
        return modalPrestadorRepository.save(modalPrestador);
    }

    /**
     * Cria uma lista de usuários ClassesModal no banco de dados.
     *
     * @param classesModal A lista de objetos ClassesModal a serem criados.
     * @return A lista de objetos ClassesModal criados e salvos no banco de dados.
     */
    public List<ModalPrestador> createClassesModals(List<ModalPrestador> modalPrestador) {
        return modalPrestadorRepository.saveAll(modalPrestador);
    }

    /**
     * Obtém um usuário ClassesModal do banco de dados com base no ID fornecido.
     *
     * @param id_classes_modal O ID do usuário ClassesModal a ser recuperado.
     * @return O objeto ClassesModal associado ao ID fornecido, ou null se não encontrado.
     */
    public ModalPrestador getClassesModalById(int id_classes_modal) {
        return modalPrestadorRepository.findById(id_classes_modal).orElse(null);
    }

    /**
     * Obtém todos os usuários ClassesModal armazenados no banco de dados.
     *
     * @return Uma lista de todos os objetos ClassesModal armazenados no banco de dados.
     */
    public List<ModalPrestador> getClassesModals() {
        return modalPrestadorRepository.findAll();
    }

    /**
     * Atualiza um usuário ClassesModal existente no banco de dados.
     *
     * @param classesModal O objeto ClassesModal com os dados atualizados.
     * @return O objeto ClassesModal atualizado e salvo no banco de dados, ou um novo objeto
     * ClassesModal se o ID não for encontrado.
     */
    public ModalPrestador updateClassesModal(ModalPrestador modalPrestador) {
    	ModalPrestador oldUser = null;
        Optional<ModalPrestador> optionalUser = modalPrestadorRepository.findById(modalPrestador.getIdModalPrestador());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setIdModalPrestador(modalPrestador.getIdModalPrestador());
            modalPrestadorRepository.save(oldUser);
        } else {
            return new ModalPrestador();
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
    	modalPrestadorRepository.deleteById(id_classes_modal);
        return "Usuário deletado";
    }
}
