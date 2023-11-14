package com.project.sprint4.dao;

/**
 * Interface base para operações de persistência relacionadas à entidade ApoliceEmpresa.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <ApoliceEmpresa>   O tipo da entidade ApoliceEmpresa.
 * @param <Integer>     O tipo do ID da entidade ApoliceEmpresa.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sprint4.entities.ApoliceEmpresa;

/**
 * Interface base para operações de persistência relacionadas à entidade ApoliceEmpresa.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <ApoliceEmpresa>   O tipo da entidade ApoliceEmpresa.
 * @param <Integer>     O tipo do ID da entidade ApoliceEmpresa.
 */

@Repository
public interface ApoliceEmpresaRepository extends JpaRepository<ApoliceEmpresa, Integer>{
	// Esta classe está vazia porque JpaRepository fornece automaticamente
    // implementações para operações básicas de persistência.

    // Métodos específicos podem ser adicionados aqui, se necessário,
    // para consultas personalizadas ou operações de persistência.
}
