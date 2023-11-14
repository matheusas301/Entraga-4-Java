package com.project.sprint4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sprint4.entities.CaminhaoCli;

/**
 * Interface base para operações de persistência relacionadas à entidade CaminhaoCli.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <CaminhaoCli>   O tipo da entidade CaminhaoCli.
 * @param <Integer>     O tipo do ID da entidade CaminhaoCli.
 */

@Repository
public interface CaminhaoCliRepository extends JpaRepository<CaminhaoCli, Integer>{
	// Esta classe está vazia porque JpaRepository fornece automaticamente
    // implementações para operações básicas de persistência.

    // Métodos específicos podem ser adicionados aqui, se necessário,
    // para consultas personalizadas ou operações de persistência.
}
