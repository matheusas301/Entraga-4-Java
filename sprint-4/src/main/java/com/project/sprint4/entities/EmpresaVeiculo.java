package com.project.sprint4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "TB_EMPRESA_VEICULO")
/**
 * A classe <b>EmpresaVeiculo</b> recebe dados seram direcionados ao banco de dados.
 * @author Matheus
 * @since Nov 2023
 */
public class EmpresaVeiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * Atributos necessário para gerar uma apolice
	 */
	private int id_emp_veiculo;
	private int peso_max;
	private double comprimento;
	private double altura;
	private int qntd_eixos;
	private Long carga_perigosa;
	private Long carga_viva;
	private String marca_veic;
	private String modelo_veic;
	
	/**
	 * Recebe a apolice da empresa da Class ApoliceEmpresa
	 * @see OrdemServico
	 */
	//private ApoliceEmpresa apolice_emp;

	/**
	 * Construtor padrão(vazio)
	 */
	public EmpresaVeiculo() {
		
	}
	
	
	/**
	 * Contrutor parametrizado com os atributos abaixo:
	 * @param id_emp_veiculo - identificador
	 * @param peso_max - peso maximo que o caminhao da empresa suporta
	 * @param comprimento - comprimento do caminahao da empresa
	 * @param altura - altura do caminahao da empresa
	 * @param qntd_eixos - quantidade de eixos do caminahao da empresa
	 * @param carga_perigosa - se o caminhao da empresa esta carregando uma carga perigosa
	 * @param carga_viva - se o caminhao da empresa esta carregando uma carga viva
	 * @param marca_veic - marca do veiculo da empresa
	 * @param modelo_veic - modelo do veiculo da empresa
	 */
	public EmpresaVeiculo(int id_emp_veiculo, int peso_max, double comprimento, double altura, int qntd_eixos,
			Long carga_perigosa, Long carga_viva, String marca_veic, String modelo_veic) {
		this.id_emp_veiculo = id_emp_veiculo;
		this.peso_max = peso_max;
		this.comprimento = comprimento;
		this.altura = altura;
		this.qntd_eixos = qntd_eixos;
		this.carga_perigosa = carga_perigosa;
		this.carga_viva = carga_viva;
		this.marca_veic = marca_veic;
		this.modelo_veic = modelo_veic;
	}

	/**
	 * Get que recebe um id_emp_veiculo
	 * @return id_emp_veiculo
	 */
	public int getId_emp_veiculo() {
		return id_emp_veiculo;
	}

	/**
	 * Set que recebe um id_emp_veiculo
	 * @return id_emp_veiculo
	 */
	public void setId_emp_veiculo(int id_empresa_veiculo) {
		this.id_emp_veiculo = id_empresa_veiculo;
	}

	/**
	 * Get que recebe um peso_max
	 * @return peso_max
	 */
	public int getPeso_max() {
		return peso_max;
	}

	/**
	 * Set que recebe um peso_max
	 * @return peso_max
	 */
	public void setPeso_max(int peso_max) {
		this.peso_max = peso_max;
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
	 * Get que recebe uma altura
	 * @return altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Set que recebe uma altura
	 * @return altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
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
	 * Get que recebe uma marca_veic
	 * @return marca_veic
	 */
	public String getMarca_veic() {
		return marca_veic;
	}

	/**
	 * Set que recebe uma marca_veic
	 * @return marca_veic
	 */
	public void setMarca_veic(String marca_veic) {
		this.marca_veic = marca_veic;
	}

	/**
	 * Get que recebe um modelo_veic
	 * @return modelo_veic
	 */
	public String getModelo_veic() {
		return modelo_veic;
	}

	/**
	 * Set que recebe um modelo_veic
	 * @return modelo_veic
	 */
	public void setModelo_veic(String modelo_veic) {
		this.modelo_veic = modelo_veic;
	}
}
