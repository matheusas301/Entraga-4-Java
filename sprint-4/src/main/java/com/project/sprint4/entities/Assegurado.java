package com.project.sprint4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Entity
@Table(name = "TB_ASSEGURADO")
/**
 * A classe <b>Assegurado</b> recebe dados de uma assegurado que seram 
 * direcionados ao banco de dados.
 * @author Matheus
 * @since Nov 2023
 */
public class Assegurado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * Atributos necessário para gerar uma assegurado
	 */
	private int id_assegurado;
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String celular;
	private String email;
	private String cep;
	private String estado;
	private String data_nascimento;
	private String fone_pessoal;
	private String fone_residencial;
	private String cidade;
	private String bairro;
	private String endereco;
	
	/**
	 * Recebe a apolice da Class Apolice
	 * @see Apolice
	 */
	//private Apolice apolice;

	/**
	 * Construtor padrão(vazio)
	 */
	public Assegurado() {
		
	}
	
	/**
	 * Contrutor parametrizado com os atributos abaixo:
	 * @param id_assegurado - identificador
	 * @param nome - nome do assegurado
	 * @param cpf - cpf do assegurado
	 * @param rg - rg do assegurado
	 * @param sexo - sexo do assegurado
	 * @param celular - celular do assegurado
	 * @param email - email do assegurado
	 * @param cep - cep do assegurado
	 * @param estado - estado do assegurado
	 * @param data_nascimento - data de nascimento do assegurado
	 * @param fone_pessoal - telefone pessoal do assegurado
	 * @param fone_residencial - telefone residencial do assegurado
	 * @param cidade - cidade do assegurado
	 * @param bairro - bairro do assegurado
	 * @param endereco - endereco do assegurado
	 */
	public Assegurado(int id_assegurado, String nome, String cpf, String rg, String sexo, String celular, String email,
			String cep, String estado, String data_nascimento, String fone_pessoal, String fone_residencial,
			String cidade, String bairro, String endereco) {
		this.id_assegurado = id_assegurado;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.celular = celular;
		this.email = email;
		this.cep = cep;
		this.estado = estado;
		this.data_nascimento = data_nascimento;
		this.fone_pessoal = fone_pessoal;
		this.fone_residencial = fone_residencial;
		this.cidade = cidade;
		this.bairro = bairro;
		this.endereco = endereco;
	}

	/**
	 * Get que recebe um id_assegurado
	 * @return id_assegurado
	 */
	public int getId_assegurado() {
		return id_assegurado;
	}

	/**
	 * Set que recebe um id_assegurado
	 * @return id_assegurado
	 */
	public void setId_assegurado(int id_assegurado) {
		this.id_assegurado = id_assegurado;
	}

	/**
	 * Get que recebe um nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Set que recebe um nome
	 * @return nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Get que recebe um cpf
	 * @return cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * Set que recebe um cpf
	 * @return cpf
	 */

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Get que recebe um rg
	 * @return rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * Set que recebe um rg
	 * @return rg
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * Get que recebe um sexo
	 * @return sexo
	 */
	public String getSexo() {
		return sexo;
	}
	
	/**
	 * Set que recebe um sexo
	 * @return sexo
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get que recebe um cep
	 * @return cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Set que recebe um cep
	 * @return cep
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * Get que recebe um estado
	 * @return estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Set que recebe um estado
	 * @return estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Get que recebe um data_nascimento
	 * @return data_nascimento
	 */
	public String getData_nascimento() {
		return data_nascimento;
	}

	/**
	 * Set que recebe um data_nascimento
	 * @return data_nascimento
	 */
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public String getFone_pessoal() {
		return fone_pessoal;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setFone_pessoal(String fone_pessoal) {
		this.fone_pessoal = fone_pessoal;
	}

	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public String getFone_residencial() {
		return fone_residencial;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setFone_residencial(String fone_residencial) {
		this.fone_residencial = fone_residencial;
	}

	/**
	 * Get que recebe um cidade
	 * @return cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * Set que recebe um cidade
	 * @return cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * Get que recebe um bairro
	 * @return bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * Set que recebe um bairro
	 * @return bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * Get que recebe um endereco
	 * @return endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @return endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}