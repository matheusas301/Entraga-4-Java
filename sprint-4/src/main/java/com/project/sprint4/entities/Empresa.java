package com.project.sprint4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "TB_EMPRESA")
/**
 * A classe <b>Empresa</b> recebe dados seram direcionados ao banco de dados.
 * @author Matheus
 * @since Nov 2023
 */
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * Atributos necessário para gerar uma apolice
	 */
	private int id_emp;
	private String nome_emp;
	private String rota_veic;
	private String nome_motorista;
	private String contato_motorista;
	private String cnh_motorista;
	
	/**
	 * Recebe a apolice da empresa da Class ApoliceEmpresa
	 * @see ApoliceEmpresa
	 */
	//private ApoliceEmpresa apolice_emp;
	
	/**
	 * Recebe os dados do veiculo da empresa da Class EmpresaVeiculo
	 * @see EmpresaVeiculo
	 */
	//private EmpresaVeiculo emp_veiculo;

	/**
	 * Construtor padrão(vazio)
	 */
	public Empresa() {
		
	}
	
	
	/**
	 * Contrutor parametrizado com os atributos abaixo:
	 * @param id_emp - identificador
	 * @param nome_emp - nome da empresa
	 * @param rota_veic - rota do veiculo da empresa
	 * @param nome_motorista - nome do motorista da empresa
	 * @param contato_motorista - contato do motorista da empresa
	 * @param cnh_motorista - cnh do motorisa da empresa
	 */
	public Empresa(int id_emp, String nome_emp, String rota_veic, String nome_motorista,
			String contato_motorista, String cnh_motorista) {
		this.id_emp = id_emp;
		this.nome_emp = nome_emp;
		this.rota_veic = rota_veic;
		this.nome_motorista = nome_motorista;
		this.contato_motorista = contato_motorista;
		this.cnh_motorista = cnh_motorista;
	}

	/**
	 * Get que recebe um id_emp
	 * @return id_emp
	 */
	public int getId_emp() {
		return id_emp;
	}

	/**
	 * Set que recebe um id_emp
	 * @return id_emp
	 */
	public void setId_emp(int id_emp) {
		this.id_emp = id_emp;
	}

	/**
	 * Get que recebe um nome_emp
	 * @return nome_emp
	 */
	public String getNome_emp() {
		return nome_emp;
	}

	/**
	 * Set que recebe um nome_emp
	 * @return nome_emp
	 */
	public void setNome_emp(String nome_emp) {
		this.nome_emp = nome_emp;
	}

	/**
	 * Get que recebe um rota_veic
	 * @return rota_veic
	 */
	public String getRota_veic() {
		return rota_veic;
	}

	/**
	 * Set que recebe um rota_veic
	 * @return rota_veic
	 */
	public void setRota_veic(String rota_veic) {
		this.rota_veic = rota_veic;
	}

	/**
	 * Get que recebe um nome_motorista
	 * @return nome_motorista
	 */
	public String getNome_motorista() {
		return nome_motorista;
	}

	/**
	 * Set que recebe um nome_motorista
	 * @return nome_motorista
	 */
	public void setNome_motorista(String nome_motorista) {
		this.nome_motorista = nome_motorista;
	}

	/**
	 * Get que recebe um contato_motorista
	 * @return contato_motorista
	 */
	public String getContato_motorista() {
		return contato_motorista;
	}

	/**
	 * Set que recebe um contato_motorista
	 * @return contato_motorista
	 */
	public void setContato_motorista(String contato_motorista) {
		this.contato_motorista = contato_motorista;
	}

	/**
	 * Get que recebe um cnh_motorista
	 * @return cnh_motorista
	 */
	public String getCnh_motorista() {
		return cnh_motorista;
	}

	/**
	 * Set que recebe um cnh_motorista
	 * @return cnh_motorista
	 */
	public void setCnh_motorista(String cnh_motorista) {
		this.cnh_motorista = cnh_motorista;
	}
}
