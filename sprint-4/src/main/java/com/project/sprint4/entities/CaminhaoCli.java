package com.project.sprint4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "TB_CAMINHAO_CLI")
/**
 * A classe <b>CaminhaoCli</b> recebe dados que seram direcionados ao banco de dados.
 * @author Matheus
 * @since Nov 2023
 */
public class CaminhaoCli {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * Atributos necessário para um caminhao do assegurado
	 */
	private int id_caminhao_cli;
	private double comprimento;
	private double altura;
	private String peso;
	private int qntd_eixos;
	private Long carga_perigosa;
	private Long carga_viva;
	
	/**
	 * Recebe a apolice da Class Apolice
	 * @see OrdemServico
	 */
	//private Apolice apolice;
	/**
	 * Recebe o assegurado da Class Assegurado
	 * @see OrdemServico
	 */
	//private Assegurado assegurado;

	/**
	 * Construtor padrão(vazio)
	 */
	public CaminhaoCli() {
		
	}
	
	
	/**
	 * Contrutor parametrizado com os atributos abaixo:
	 * @param id_caminhao_cli - identificador
	 * @param comprimento - comprimento do caminhao do assegurado
	 * @param altura - altura do caminhao do assegurado
	 * @param peso - peso do caminhão do assegurado
	 * @param qntd_eixos - quantidade de eixos do caminhao do assegurado
	 * @param carga_perigosa - Se possui uma carga perigosa no caminhao do assegurado
	 * @param carga_viva - Se possui uma carga viva no caminhao do assegurado
	 */
	public CaminhaoCli(int id_caminhao_cli, double comprimento, double altura, String peso, int qntd_eixos,
			Long carga_perigosa, Long carga_viva) {
		this.id_caminhao_cli = id_caminhao_cli;
		this.comprimento = comprimento;
		this.altura = altura;
		this.peso = peso;
		this.qntd_eixos = qntd_eixos;
		this.carga_perigosa = carga_perigosa;
		this.carga_viva = carga_viva;
	}

	/**
	 * Get que recebe um id_caminhao_cli
	 * @return id_caminhao_cli
	 */
	public int getId_caminhao_cli() {
		return id_caminhao_cli;
	}

	/**
	 * Set que recebe um id_caminhao_cli
	 * @return id_caminhao_cli
	 */
	public void setId_caminhao_cli(int id_caminhao_cli) {
		this.id_caminhao_cli = id_caminhao_cli;
	}

	/**
	 * Get que recebe um comprimento
	 * @return comprimento
	 */
	public double getComprimento() {
		return comprimento;
	}

	/**
	 * Set que recebe um comprimento
	 * @return comprimento
	 */
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	/**
	 * Get que recebe um altura
	 * @return altura
	 */
	public double getAltura() {
		return altura;
	}
	
	/**
	 * Set que recebe um altura
	 * @return altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Get que recebe um peso
	 * @return peso
	 */
	public String getPeso() {
		return peso;
	}

	/**
	 * Set que recebe um peso
	 * @return peso
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}

	/**
	 * Get que recebe um qntd_eixos
	 * @return qntd_eixos
	 */
	public int getQntd_eixos() {
		return qntd_eixos;
	}

	/**
	 * Set que recebe um qntd_eixos
	 * @return qntd_eixos
	 */
	public void setQntd_eixos(int qntd_eixos) {
		this.qntd_eixos = qntd_eixos;
	}

	/**
	 * Get que recebe um carga_perigosa
	 * @return carga_perigosa
	 */
	public Long getCarga_perigosa() {
		return carga_perigosa;
	}

	/**
	 * Set que recebe um carga_perigosa
	 * @return carga_perigosa
	 */
	public void setCarga_perigosa(Long carga_perigosa) {
		this.carga_perigosa = carga_perigosa;
	}

	/**
	 * Get que recebe um carga_viva
	 * @return carga_viva
	 */
	public Long getCarga_viva() {
		return carga_viva;
	}

	/**
	 * Set que recebe um carga_viva
	 * @return carga_viva
	 */
	public void setCarga_viva(Long carga_viva) {
		this.carga_viva = carga_viva;
	}
	
}
