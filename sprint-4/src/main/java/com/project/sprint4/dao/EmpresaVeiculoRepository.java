package com.project.sprint4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sprint4.entities.EmpresaVeiculo;

/**
 * Interface base para operações de persistência relacionadas à entidade EmpresaVeiculo.
 * Esta interface estende JpaRepository para fornecer operações CRUD básicas.
 *
 * @param <EmpresaVeiculo>   O tipo da entidade EmpresaVeiculo.
 * @param <Integer>     O tipo do ID da entidade EmpresaVeiculo.
 */

@Repository
public interface EmpresaVeiculoRepository extends JpaRepository<EmpresaVeiculo, Integer>{
	// Esta classe está vazia porque JpaRepository fornece automaticamente
    // implementações para operações básicas de persistência.

    // Métodos específicos podem ser adicionados aqui, se necessário,
    // para consultas personalizadas ou operações de persistência.
}
