package com.project.sprint4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sprint4.dao.ApoliceEmpresaRepository;
import com.project.sprint4.entities.ApoliceEmpresa;

@Service		
/**
 * A classe <b>ApoliceEmpresaService</b> gerencia como os dados seram manipulados.
 * @author Matheus
 * @since Nov 2023
 */
public class ApoliceEmpresaService {
	
	/**
     * Repositório utilizado para acessar dados da entidade ApoliceEmpresa.
     * Recebe uma apólice da classe ApoliceEmpresaRepository.
     *
     * @see ApoliceEmpresaRepository
     */
    @Autowired
    private ApoliceEmpresaRepository apoliceEmpresaRepository;

    /**
     * Cria uma nova apólice de empresa no banco de dados.
     *
     * @param apoliceEmpresa O objeto ApoliceEmpresa a ser criado.
     * @return O objeto ApoliceEmpresa criado e salvo no banco de dados.
     */
    public ApoliceEmpresa createApoliceEmpresa(ApoliceEmpresa apoliceEmpresa) {
        return apoliceEmpresaRepository.save(apoliceEmpresa);
    }

    /**
     * Cria uma lista de apólices de empresa no banco de dados.
     *
     * @param apolicesEmpresa A lista de objetos ApoliceEmpresa a serem criados.
     * @return A lista de objetos ApoliceEmpresa criados e salvos no banco de dados.
     */
    public List<ApoliceEmpresa> createApoliceEmpresas(List<ApoliceEmpresa> apolicesEmpresa) {
        return apoliceEmpresaRepository.saveAll(apolicesEmpresa);
    }

    /**
     * Obtém uma apólice de empresa do banco de dados com base no ID fornecido.
     *
     * @param id_apolice_emp O ID da apólice de empresa a ser recuperada.
     * @return O objeto ApoliceEmpresa associado ao ID fornecido, ou null se não encontrado.
     */
    public ApoliceEmpresa getApoliceEmpresaById(int id_apolice_emp) {
        return apoliceEmpresaRepository.findById(id_apolice_emp).orElse(null);
    }

    /**
     * Obtém todas as apólices de empresa armazenadas no banco de dados.
     *
     * @return Uma lista de todos os objetos ApoliceEmpresa armazenados no banco de dados.
     */
    public List<ApoliceEmpresa> getApoliceEmpresas() {
        return apoliceEmpresaRepository.findAll();
    }

    /**
     * Atualiza os dados de uma apólice de empresa existente no banco de dados.
     *
     * @param apoliceEmpresa O objeto ApoliceEmpresa com os dados atualizados.
     * @return O objeto ApoliceEmpresa atualizado e salvo no banco de dados, ou um novo objeto
     * ApoliceEmpresa se o ID não for encontrado.
     */
    public ApoliceEmpresa updateApoliceEmpresa(ApoliceEmpresa apoliceEmpresa) {
        ApoliceEmpresa oldUser = null;
        Optional<ApoliceEmpresa> optionalUser = apoliceEmpresaRepository.findById(apoliceEmpresa.getId_apolice_empresa());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_apolice_empresa(apoliceEmpresa.getId_apolice_empresa());
            oldUser.setCod_emp(apoliceEmpresa.getCod_emp());
            oldUser.setData_inicio_vigencia(apoliceEmpresa.getData_inicio_vigencia());
            oldUser.setData_fim_vigencia(apoliceEmpresa.getData_fim_vigencia());
            oldUser.setData_emissao_apolice(apoliceEmpresa.getData_emissao_apolice());
            oldUser.setNum_proposta(apoliceEmpresa.getNum_proposta());
            oldUser.setNum_apolice(apoliceEmpresa.getNum_apolice());
            oldUser.setRenova_apolice(apoliceEmpresa.getRenova_apolice());
            oldUser.setClasse_bonus(apoliceEmpresa.getClasse_bonus());
            apoliceEmpresaRepository.save(oldUser);
        } else {
            return new ApoliceEmpresa();
        }
        return oldUser;
    }

    /**
     * Exclui uma apólice de empresa do banco de dados com base no ID fornecido.
     *
     * @param id_apolice_emp O ID da apólice de empresa a ser excluída.
     * @return Uma mensagem indicando o sucesso da exclusão.
     */
    public String deleteApoliceEmpresaById(int id_apolice_emp) {
        apoliceEmpresaRepository.deleteById(id_apolice_emp);
        return "Usuário deletado";
    }
}
