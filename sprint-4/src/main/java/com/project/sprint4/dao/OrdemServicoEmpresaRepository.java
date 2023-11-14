package com.project.sprint4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sprint4.entities.OrdemServicoEmpresa;

/**
 * Interface base para operações de persistência relacionadas à entidade OrdemServicoEmpresa.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <OrdemServicoEmpresa>   O tipo da entidade OrdemServicoEmpresa.
 * @param <Integer>     O tipo do ID da entidade OrdemServicoEmpresa.
 */

@Repository
public interface OrdemServicoEmpresaRepository extends JpaRepository<OrdemServicoEmpresa, Integer>{
	// Esta classe está vazia porque JpaRepository fornece automaticamente
    // implementações para operações básicas de persistência.

    // Métodos específicos podem ser adicionados aqui, se necessário,
    // para consultas personalizadas ou operações de persistência.
}