package com.project.sprint4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "TB_CLASSES_MODAL")
/**
 * A classe <b>ClassesModal</b> recebe dados seram direcionados ao banco de dados.
 * @author Matheus
 * @since Nov 2023
 */
public class ClassesModal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * Atributos necessário para gerar uma Classe de Modal
	 */
	private int id_classes_modal;
	private int peso_total;
	private Long carga_perigosa;
	private Long carga_viva;
	private String tipo_guincho;
	
	/**
	 * Recebe a ordem servico da Class OrdemServico
	 * @see OrdemServico
	 */
	//private OrdemServico ordem_serv;
	
	/**
	 * Recebe a ordem servico da empresa da Class OrdemServicoEmpresa
	 * @see OrdemServicoEmpresa
	 */
	//private OrdemServicoEmpresa ordem_serv_emp;

	/**
	 * Construtor padrão(vazio)
	 */
	public ClassesModal() {
		
	}
	
	
	/**
	 * Contrutor parametrizado com os atributos abaixo:
	 * @param id_classes_modal - identificador
	 * @param peso_total - peso total da classe modal
	 * @param carga_perigosa - se a classe do modal suporta uma carga perigosa
	 * @param carga_viva  - se a classe do modal suporta uma carga viva
	 * @param tipo_guincho - qual é o tipo de guincho
	 */
	public ClassesModal(int id_classes_modal, int peso_total, Long carga_perigosa, Long carga_viva,
			String tipo_guincho) {
		this.id_classes_modal = id_classes_modal;
		this.peso_total = peso_total;
		this.carga_perigosa = carga_perigosa;
		this.carga_viva = carga_viva;
		this.tipo_guincho = tipo_guincho;
	}
	
	/**
	 * Get que recebe um id_classes_modal
	 * @return id_classes_modal
	 */
	public int getId_classes_modal() {
		return id_classes_modal;
	}

	/**
	 * Set que recebe um id_classes_modal
	 * @return id_classes_modal
	 */
	public void setId_classes_modal(int id_classes_modal) {
		this.id_classes_modal = id_classes_modal;
	}
	
	/**
	 * Get que recebe um peso_total
	 * @return peso_total
	 */
	public int getPeso_total() {
		return peso_total;
	}

	/**
	 * Set que recebe um peso_total
	 * @return peso_total
	 */
	public void setPeso_total(int peso_total) {
		this.peso_total = peso_total;
	}

	/**
	 * Get que recebe uma carga_perigosa
	 * @return carga_perigosa
	 */
	public Long getCarga_perigosa() {
		return carga_perigosa;
	}

	/**
	 * Set que recebe uma carga_perigosa
	 * @return carga_perigosa
	 */
	public void setCarga_perigosa(Long carga_perigosa) {
		this.carga_perigosa = carga_perigosa;
	}

	/**
	 * Get que recebe uma carga_viva
	 * @return carga_viva
	 */
	public Long getCarga_viva() {
		return carga_viva;
	}

	/**
	 * Set que recebe uma carga_viva
	 * @return carga_viva
	 */
	public void setCarga_viva(Long carga_viva) {
		this.carga_viva = carga_viva;
	}

	/**
	 * Get que recebe um tipo_guincho
	 * @return tipo_guincho
	 */
	public String getTipo_guincho() {
		return tipo_guincho;
	}

	/**
	 * Set que recebe um tipo_guincho
	 * @return tipo_guincho
	 */
	public void setTipo_guincho(String tipo_guincho) {
		this.tipo_guincho = tipo_guincho;
	}
}
