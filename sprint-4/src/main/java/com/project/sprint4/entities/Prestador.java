package com.project.sprint4.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "TB_PRESTADOR")
/**
 * A classe <b>Prestador</b> recebe dados seram direcionados ao banco de dados.
 * @author Matheus
 * @since Nov 2023
 */
public class Prestador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * Atributos necessário para gerar uma apolice
	 */
	private int id_prestador;
	private String nome;
	private String rg;
	private String cpf;
	private String cnh;
	private String celular;
	private String especializacao;
	private String funcao;
	private String localizacao_atual;
	
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
	 * Contrutor padrão(vazio)
	 */
	public Prestador() {
		
	}
	
	/**
	 * Contrutor parametrizado com os atributos abaixo:
	 * @param id_prestador - identificador
	 * @param nome - nome do prestador do servico
	 * @param rg - re do prestador do servico
	 * @param cpf - cpf do prestador do servico
	 * @param cnh - cnh do prestador do servico
	 * @param celular - celular do prestador do servico
	 * @param especializacao - especializacao do prestador do servico
	 * @param funcao - funcao do prestador do servico
	 * @param localizacao_atual - localizacao atual do prestador do servico
	 */
	public Prestador(int id_prestador, String nome, String rg, String cpf, String cnh, String celular,
			String especializacao, String funcao, String localizacao_atual) {
		this.id_prestador = id_prestador;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.cnh = cnh;
		this.celular = celular;
		this.especializacao = especializacao;
		this.funcao = funcao;
		this.localizacao_atual = localizacao_atual;
	}

	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public int getId_prestador() {
		return id_prestador;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setId_prestador(int id_prestador) {
		this.id_prestador = id_prestador;
	}

	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public String getCnh() {
		return cnh;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setCnh(String cnh) {
		this.cnh = cnh;
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
	public String getEspecializacao() {
		return especializacao;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public String getFuncao() {
		return funcao;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	/**
	 * Get que recebe um id_apolice
	 * @return id_apolice
	 */
	public String getLocalizacao_atual() {
		return localizacao_atual;
	}

	/**
	 * Set que recebe um id_apolice
	 * @return id_apolice
	 */
	public void setLocalizacao_atual(String localizacao_atual) {
		this.localizacao_atual = localizacao_atual;
	}
}
