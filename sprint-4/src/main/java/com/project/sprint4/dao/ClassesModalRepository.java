package com.project.sprint4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sprint4.entities.ClassesModal;

/**
 * Interface base para operações de persistência relacionadas à entidade ClassesModal.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <ClassesModal>   O tipo da entidade ClassesModal.
 * @param <Integer>     O tipo do ID da entidade ClassesModal.
 */

@Repository
public interface ClassesModalRepository extends JpaRepository<ClassesModal, Integer>{
	// Esta classe está vazia porque JpaRepository fornece automaticamente
    // implementações para operações básicas de persistência.

    // Métodos específicos podem ser adicionados aqui, se necessário,
    // para consultas personalizadas ou operações de persistência.
}