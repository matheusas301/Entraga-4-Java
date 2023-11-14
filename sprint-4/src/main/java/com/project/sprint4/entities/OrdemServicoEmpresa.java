package com.project.sprint4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_ORDEM_SERVICO_EMPRESA")
/**
 * A classe <b>OrdemServicoEmpresa</b> recebe dados seram direcionados ao banco de dados.
 * @author Matheus
 * @since Nov 2023
 */
public class OrdemServicoEmpresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * Atributos necessário para gerar uma apolice
	 */
	private int id_ordem_serv_emp;
	private String data_hora;
	private String local_serv;
	private String rota_guincho;

	/**
	 * Contrutor padrão(vazio)
	 */
	public OrdemServicoEmpresa() {
		
	}
	
	/**
	 * Contrutor parametrizado com os atributos abaixo:
	 * @param id_ordem_serv_emp - identificador
	 * @param data_hora - data e hora do ordem de servico 
	 * @param local_serv - local da ordem de servico
	 * @param rota_guincho - rota que o guincho fara ate a ordem de servico
	 */
	public OrdemServicoEmpresa(int id_ordem_serv_emp, String data_hora, String local_serv, String rota_guincho) {
	
		this.id_ordem_serv_emp = id_ordem_serv_emp;
		this.data_hora = data_hora;
		this.local_serv = local_serv;
		this.rota_guincho = rota_guincho;
	}

	/**
	 * Get que recebe um id_ordem_serv_emp
	 * @return id_ordem_serv_emp
	 */
	public int getId_ordem_serv_emp() {
		return id_ordem_serv_emp;
	}

	/**
	 * Set que recebe um id_ordem_serv_emp
	 * @return id_ordem_serv_emp
	 */
	public void setId_ordem_serv_emp(int id_ordem_serv_emp) {
		this.id_ordem_serv_emp = id_ordem_serv_emp;
	}

	/**
	 * Get que recebe uma data_hora
	 * @return data_hora
	 */
	public String getData_hora() {
		return data_hora;
	}

	/**
	 * Set que recebe uma data_hora
	 * @return data_hora
	 */
	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}

	/**
	 * Get que recebe um local_serv
	 * @return local_serv
	 */
	public String getLocal_serv() {
		return local_serv;
	}

	/**
	 * Set que recebe um local_serv
	 * @return local_serv
	 */
	public void setLocal_serv(String local_serv) {
		this.local_serv = local_serv;
	}

	/**
	 * Get que recebe uma rota_guincho
	 * @return rota_guincho
	 */
	public String getRota_guincho() {
		return rota_guincho;
	}

	/**
	 * Set que recebe uma rota_guincho
	 * @return rota_guincho
	 */
	public void setRota_guincho(String rota_guincho) {
		this.rota_guincho = rota_guincho;
	}
}
