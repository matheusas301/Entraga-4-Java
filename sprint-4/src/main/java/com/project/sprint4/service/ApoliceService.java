package com.project.sprint4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sprint4.dao.ApoliceRepository;
import com.project.sprint4.entities.Apolice;

@Service
/**
 * A classe <b>ApoliceService</b> gerencia como os dados seram manipulados.
 * @author Matheus
 * @since Nov 2023
 */
public class ApoliceService {

	/**
     * Repositório utilizado para acessar dados da entidade Apolice.
     * Recebe uma apólice da classe ApoliceRepository.
     *
     * @see ApoliceRepository
     */
    @Autowired
    private ApoliceRepository apoliceRepository;

    /**
     * Cria uma nova apólice no banco de dados.
     *
     * @param apolice O objeto Apolice a ser criado.
     * @return O objeto Apolice criado e salvo no banco de dados.
     */
    public Apolice createApolice(Apolice apolice) {
        return apoliceRepository.save(apolice);
    }

    /**
     * Cria uma lista de apólices no banco de dados.
     *
     * @param apolices A lista de objetos Apolice a serem criados.
     * @return A lista de objetos Apolice criados e salvos no banco de dados.
     */
    public List<Apolice> createApolices(List<Apolice> apolices) {
        return apoliceRepository.saveAll(apolices);
    }

    /**
     * Obtém uma apólice do banco de dados com base no ID fornecido.
     *
     * @param id_apolice O ID da apólice a ser recuperada.
     * @return O objeto Apolice associado ao ID fornecido, ou null se não encontrado.
     */
    public Apolice getApoliceById(int id_apolice) {
        return apoliceRepository.findById(id_apolice).orElse(null);
    }

    /**
     * Obtém todas as apólices armazenadas no banco de dados.
     *
     * @return Uma lista de todos os objetos Apolice armazenados no banco de dados.
     */
    public List<Apolice> getApolices() {
        return apoliceRepository.findAll();
    }

    /**
     * Atualiza os dados de uma apólice existente no banco de dados.
     *
     * @param apolice O objeto Apolice com os dados atualizados.
     * @return O objeto Apolice atualizado e salvo no banco de dados, ou um novo objeto
     * Apolice se o ID não for encontrado.
     */
    public Apolice updateApolice(Apolice apolice) {
        Apolice oldUser = null;
        Optional<Apolice> optionalUser = apoliceRepository.findById(apolice.getId_apolice());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_apolice(apolice.getId_apolice());
            oldUser.setCod_cli(apolice.getCod_cli());
            oldUser.setData_inicio_vigencia(apolice.getData_inicio_vigencia());
            oldUser.setNum_proposta(apolice.getNum_proposta());
            oldUser.setNum_apolice(apolice.getNum_apolice());
            oldUser.setRenova_apolice(apolice.getRenova_apolice());
            oldUser.setClasse_bonus(apolice.getClasse_bonus());
            oldUser.setData_fim_vigencia(apolice.getData_fim_vigencia());
            oldUser.setData_emissao_apolice(apolice.getData_emissao_apolice());
            apoliceRepository.save(oldUser);
        } else {
            return new Apolice();
        }
        return oldUser;
    }

    /**
     * Exclui uma apólice do banco de dados com base no ID fornecido.
     *
     * @param id_apolice O ID da apólice a ser excluída.
     * @return Uma mensagem indicando o sucesso da exclusão.
     */
    public String deleteApoliceById(int id_apolice) {
        apoliceRepository.deleteById(id_apolice);
        return "Usuário deletado";
    }
}
