package com.project.sprint4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sprint4.dao.PrestadorRepository;
import com.project.sprint4.entities.Prestador;
@Service
/**
 * A classe <b>PrestadorService</b> gerencia como os dados seram manipulados.
 * @author Matheus
 * @since Nov 2023
 */
public class PrestadorService {
	@Autowired
	/**
	 * Recebe um prestador da Class PrestadorRepository
	 * @see PrestadorRepository
	 */
	private PrestadorRepository prestadorRepository;
	
	/**
	 * Metodo que cria um prestador
	 * @param prestador
	 * @return prestadorRepository.save(prestador)
	 */
	public Prestador createPrestador(Prestador prestador) {
		return prestadorRepository.save(prestador);
	}
	
	/**
	 * Metodo que cria varios prestadores
	 * @param prestador
	 * @return prestadorRepository.saveAll(prestador)
	 */
	public List<Prestador> createPrestadores(List<Prestador> prestador) {
		return prestadorRepository.saveAll(prestador);
	}

	/**
	 * Metodo que pega um prestador pelo seu id
	 * @param id_prestador
	 * @return prestadorRepository.findById(id_prestador).orElse(null)
	 */
	public Prestador getPrestadorById(int id_prestador) {
		return prestadorRepository.findById(id_prestador).orElse(null);
	}
	
	/**
	 * Metodo que pega varias prestadores e eles exibe atraves de uma lista
	 * @return prestadorRepository.findAll()
	 */
	public List<Prestador> getPrestadores() {
		return prestadorRepository.findAll();
	}
	
	/**
	 * Metodo que atualiza dados de um prestador
	 * @param prestador
	 * @return oldUser
	 */
	public Prestador updatePrestador(Prestador prestador) {
		Prestador oldUser = null;
		Optional<Prestador> optionaluser=prestadorRepository.findById(prestador.getId_prestador());
		if(optionaluser.isPresent()) {
			oldUser = optionaluser.get();
			oldUser.setNome(prestador.getNome());
			oldUser.setRg(prestador.getRg());
			oldUser.setCpf(prestador.getCpf());
			oldUser.setCnh(prestador.getCnh());
			oldUser.setCelular(prestador.getCelular());
			oldUser.setEspecializacao(prestador.getFuncao());
			oldUser.setFuncao(prestador.getRg());
			oldUser.setLocalizacao_atual(prestador.getLocalizacao_atual());
			prestadorRepository.save(oldUser);
		}else {
			return new Prestador();
		}
		return oldUser;
	}
	
	/**
	 * Metodo que exclui um prestador por id
	 * @param id_prestador
	 * @return "Usuário deletado"
	 */
	public String deletePrestadorById(int id_prestador) {
		prestadorRepository.deleteById(id_prestador);
		return "Usuário deletado";
	}
}
