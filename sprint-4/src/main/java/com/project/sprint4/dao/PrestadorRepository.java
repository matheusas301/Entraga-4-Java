package com.project.sprint4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sprint4.entities.Prestador;

/**
 * Interface base para operações de persistência relacionadas à entidade Prestador.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <Prestador>   O tipo da entidade Prestador.
 * @param <Integer>     O tipo do ID da entidade Prestador.
 */

@Repository
public interface PrestadorRepository extends JpaRepository<Prestador, Integer> {
    // Esta classe está vazia porque JpaRepository fornece automaticamente
    // implementações para operações básicas de persistência.

    // Métodos específicos podem ser adicionados aqui, se necessário,
    // para consultas personalizadas ou operações de persistência.
}
