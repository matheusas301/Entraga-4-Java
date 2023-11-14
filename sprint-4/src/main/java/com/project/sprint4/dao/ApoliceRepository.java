package com.project.sprint4.dao;

/**
 * Interface base para operações de persistência relacionadas à entidade Apolice.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <Apolice>   O tipo da entidade Apolice.
 * @param <Integer>     O tipo do ID da entidade Apolice.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sprint4.entities.Apolice;

@Repository
public interface ApoliceRepository extends JpaRepository<Apolice, Integer>{
	// Esta classe está vazia porque JpaRepository fornece automaticamente
    // implementações para operações básicas de persistência.

    // Métodos específicos podem ser adicionados aqui, se necessário,
    // para consultas personalizadas ou operações de persistência.
}
