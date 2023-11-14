package com.project.sprint4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sprint4.entities.ModalPrestador;

/**
 * Interface base para operações de persistência relacionadas à entidade ModalPrestador.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <ModalPrestador>   O tipo da entidade ModalPrestador.
 * @param <Integer>     O tipo do ID da entidade ModalPrestador.
 */

@Repository
public interface ModalPrestadorRepository extends JpaRepository<ModalPrestador, Integer>{
	// Esta classe está vazia porque JpaRepository fornece automaticamente
    // implementações para operações básicas de persistência.

    // Métodos específicos podem ser adicionados aqui, se necessário,
    // para consultas personalizadas ou operações de persistência.
}
