package com.project.sprint4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sprint4.entities.OrdemServico;

/**
 * Interface base para operações de persistência relacionadas à entidade OrdemServico.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <OrdemServico>   O tipo da entidade OrdemServico.
 * @param <Integer>     O tipo do ID da entidade OrdemServico.
 */

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Integer>{
	// Esta classe está vazia porque JpaRepository fornece automaticamente
    // implementações para operações básicas de persistência.

    // Métodos específicos podem ser adicionados aqui, se necessário,
    // para consultas personalizadas ou operações de persistência.
}
