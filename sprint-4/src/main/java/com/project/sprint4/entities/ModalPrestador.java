package com.project.sprint4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "TB_MODAL_PRESTADOR")
public class ModalPrestador {
	/**
     * O identificador único para a modalidade do prestador.
     * Este valor é gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_modal_prestador;

    /**
     * Contrutor padrão(vazio)
     */
    public ModalPrestador() {
    	
    }
    
    /**
     * Construtor parametrizado
     * @param id_modal_prestador
     */
    public ModalPrestador(int id_modal_prestador) {
		this.id_modal_prestador = id_modal_prestador;
	}


	/**
     * Obtém o identificador único para a modalidade do prestador.
     *
     * @return O identificador único para a modalidade do prestador.
     */
    public int getIdModalPrestador() {
        return id_modal_prestador;
    }

    /**
     * Define o identificador único para a modalidade do prestador.
     *
     * @param id_modal_prestador O identificador único para a modalidade do prestador.
     */
    public void setIdModalPrestador(int id_modal_prestador) {
        this.id_modal_prestador = id_modal_prestador;
    }
}
