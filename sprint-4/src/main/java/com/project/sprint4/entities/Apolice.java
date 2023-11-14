package com.project.sprint4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "TB_APOLICE")
/**
 * A classe <b>Apolice</b> recebe dados seram direcionados ao banco de dados.
 * @author Matheus
 * @since Nov 2023
 */
public class Apolice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * Atributos necessário para gerar uma apolice
	 */
	private int id_apolice;
	private int cod_cli;
	private String data_inicio_vigencia;
	private String num_proposta;
	private String num_apolice;
	private String renova_apolice;
	private String classe_bonus;
	private String data_fim_vigencia;
	private String data_emissao_apolice;

	/**
	 * Recebe a ordem de servico da Class OrdemServico
	 * @see OrdemServico
	 */
	//private OrdemServico ordem_serv;
	
	/**
	 * Contrutor padrão(vazio)
	 */
	public Apolice() {
		
	}
	
	/**
	 * Contrutor parametrizado com os atributos abaixo:
	 * @param id - identificador
	 * @param cod_cli - codigo do cliente
	 * @param data_inicio_vigencia - data do inicio da vigencia
	 * @param num_proposta - numero da proposta
	 * @param num_apolice - numero da apolice
	 * @param renova_apolice - dados de renovação de apolice
	 * @param classe_bonus - informações de uma classe bonus
	 * @param data_fim_vigencia - data do fim da vigencia de uma apolice
	 * @param data_emissao_apolice - data do emissao da vigencia de uma apolice
	 */
	public Apolice(int id_apolice, int cod_cli, String data_inicio_vigencia, String num_proposta, String num_apolice,
			String renova_apolice, String classe_bonus, String data_fim_vigencia, String data_emissao_apolice) {
		this.id_apolice = id_apolice;
		this.cod_cli = cod_cli;
		this.data_inicio_vigencia = data_inicio_vigencia;
		this.num_proposta = num_proposta;
		this.num_apolice = num_apolice;
		this.renova_apolice = renova_apolice;
		this.classe_bonus = classe_bonus;
		this.data_fim_vigencia = data_fim_vigencia;
		this.data_emissao_apolice = data_emissao_apolice;
	}
	
	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public int getId_apolice() {
		return id_apolice;
	}
	
	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setId_apolice(int id_apolice) {
		this.id_apolice = id_apolice;
	}
	
	/**
	 * Get que recebe um cod_cli
	 * @return cod_cli
	 */
	public int getCod_cli() {
		return cod_cli;
	}
	
	/**
	 * Set que recebe um cod_cli
	 * @return cod_cli
	 */
	public void setCod_cli(int cod_cli) {
		this.cod_cli = cod_cli;
	}
	
	/**
	 * Get que recebe um data_inicio_vigencia
	 * @return data_inicio_vigencia
	 */
	public String getData_inicio_vigencia() {
		return data_inicio_vigencia;
	}
	
	/**
	 * Set que recebe um data_inicio_vigencia
	 * @return data_inicio_vigencia
	 */
	public void setData_inicio_vigencia(String data_inicio_vigencia) {
		this.data_inicio_vigencia = data_inicio_vigencia;
	}
	
	/**
	 * Get que recebe um num_proposta
	 * @return num_proposta
	 */
	public String getNum_proposta() {
		return num_proposta;
	}
	
	/**
	 * Set que recebe um num_proposta
	 * @return num_proposta
	 */
	public void setNum_proposta(String num_proposta) {
		this.num_proposta = num_proposta;
	}
	
	/**
	 * Get que recebe um num_apolice
	 * @return num_apolice
	 */
	public String getNum_apolice() {
		return num_apolice;
	}
	
	/**
	 * Set que recebe um num_apolice
	 * @return num_apolice
	 */
	public void setNum_apolice(String num_apolice) {
		this.num_apolice = num_apolice;
	}
	
	/**
	 * Get que recebe um renova_apolice
	 * @return renova_apolice
	 */
	public String getRenova_apolice() {
		return renova_apolice;
	}
	
	/**
	 * Set que recebe um renova_apolice
	 * @return renova_apolice
	 */
	public void setRenova_apolice(String renova_apolice) {
		this.renova_apolice = renova_apolice;
	}
	
	/**
	 * Get que recebe um classe_bonus
	 * @return classe_bonus
	 */
	public String getClasse_bonus() {
		return classe_bonus;
	}
	
	/**
	 * Set que recebe um classe_bonus
	 * @return classe_bonus
	 */
	public void setClasse_bonus(String classe_bonus) {
		this.classe_bonus = classe_bonus;
	}
	
	/**
	 * Get que recebe um data_fim_vigencia
	 * @return data_fim_vigencia
	 */
	public String getData_fim_vigencia() {
		return data_fim_vigencia;
	}
	
	/**
	 * Set que recebe um data_fim_vigencia
	 * @return data_fim_vigencia
	 */
	public void setData_fim_vigencia(String data_fim_vigencia) {
		this.data_fim_vigencia = data_fim_vigencia;
	}
	
	/**
	 * Get que recebe um data_emissao_apolice
	 * @return data_emissao_apolice
	 */
	public String getData_emissao_apolice() {
		return data_emissao_apolice;
	}
	
	/**
	 * Set que recebe um data_emissao_apolice
	 * @return data_emissao_apolice
	 */
	public void setData_emissao_apolice(String data_emissao_apolice) {
		this.data_emissao_apolice = data_emissao_apolice;
	}
}
