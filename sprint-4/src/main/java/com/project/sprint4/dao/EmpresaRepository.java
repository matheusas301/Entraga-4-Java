package com.project.sprint4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sprint4.entities.Empresa;

/**
 * Interface base para operações de persistência relacionadas à entidade Empresa.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <Empresa>   O tipo da entidade Empresa.
 * @param <Integer>     O tipo do ID da entidade Empresa.
 */

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{
	// Esta classe está vazia porque JpaRepository fornece automaticamente
    // implementações para operações básicas de persistência.

    // Métodos específicos podem ser adicionados aqui, se necessário,
    // para consultas personalizadas ou operações de persistência.
}
