package com.project.sprint4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sprint4.entities.Assegurado;

/**
 * Interface base para operações de persistência relacionadas à entidade Assegurado.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <Assegurado>   O tipo da entidade Assegurado.
 * @param <Integer>     O tipo do ID da entidade Assegurado.
 */

@Repository
public interface AsseguradoRepository extends JpaRepository<Assegurado, Integer>{
	// Esta classe está vazia porque JpaRepository fornece automaticamente
    // implementações para operações básicas de persistência.

    // Métodos específicos podem ser adicionados aqui, se necessário,
    // para consultas personalizadas ou operações de persistência.
}