package com.project.sprint4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sprint4.dao.CaminhaoCliRepository;
import com.project.sprint4.entities.CaminhaoCli;
@Service
/**
 * A classe <b>CaminhaoCliService</b> gerencia como os dados seram manipulados.
 * @author Matheus
 * @since Nov 2023
 */
public class CaminhaoCliService {

    /**
     * Repositório utilizado para acessar dados da entidade CaminhaoCli.
     * Recebe o caminhao do assegurado da Classe CaminhaoCliRepository.
     * @see CaminhaoCliRepository
     */
    @Autowired
    private CaminhaoCliRepository caminhaoCliRepository;

    /**
     * Método que cria um caminhão do assegurado.
     *
     * @param caminhaoCli O objeto CaminhaoCli a ser criado.
     * @return O objeto CaminhaoCli criado e salvo no banco de dados.
     */
    public CaminhaoCli createCaminhaoCli(CaminhaoCli caminhaoCli) {
        return caminhaoCliRepository.save(caminhaoCli);
    }

    /**
     * Método que cria vários caminhões para o assegurado.
     *
     * @param caminhoesCli A lista de objetos CaminhaoCli a serem criados.
     * @return A lista de objetos CaminhaoCli criados e salvos no banco de dados.
     */
    public List<CaminhaoCli> createCaminhaoClis(List<CaminhaoCli> caminhoesCli) {
        return caminhaoCliRepository.saveAll(caminhoesCli);
    }

    /**
     * Método que obtém um caminhão do assegurado do banco de dados com base no ID fornecido.
     *
     * @param id_caminhao_cli O ID do caminhão do assegurado a ser recuperado.
     * @return O objeto CaminhaoCli associado ao ID fornecido, ou null se não encontrado.
     */
    public CaminhaoCli getCaminhaoCliById(int id_caminhao_cli) {
        return caminhaoCliRepository.findById(id_caminhao_cli).orElse(null);
    }

    /**
     * Método que obtém vários caminhões do assegurado e os exibe através de uma lista.
     *
     * @return A lista de todos os objetos CaminhaoCli armazenados no banco de dados.
     */
    public List<CaminhaoCli> getCaminhaoClis() {
        return caminhaoCliRepository.findAll();
    }

    /**
     * Método que atualiza informações de um caminhão do assegurado.
     *
     * @param caminhaoCli O objeto CaminhaoCli com os dados atualizados.
     * @return O objeto CaminhaoCli atualizado e salvo no banco de dados, ou um novo objeto
     * CaminhaoCli se o ID não for encontrado.
     */
    public CaminhaoCli updateCaminhaoCli(CaminhaoCli caminhaoCli) {
        CaminhaoCli oldUser = null;
        Optional<CaminhaoCli> optionalUser = caminhaoCliRepository.findById(caminhaoCli.getId_caminhao_cli());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_caminhao_cli(caminhaoCli.getId_caminhao_cli());
            oldUser.setComprimento(caminhaoCli.getComprimento());
            oldUser.setAltura(caminhaoCli.getAltura());
            oldUser.setPeso(caminhaoCli.getPeso());
            oldUser.setQntd_eixos(caminhaoCli.getQntd_eixos());
            oldUser.setCarga_perigosa(caminhaoCli.getCarga_perigosa());
            oldUser.setCarga_viva(caminhaoCli.getCarga_viva());
            caminhaoCliRepository.save(oldUser);
        } else {
            return new CaminhaoCli();
        }
        return oldUser;
    }

    /**
     * Método que exclui um caminhão de um assegurado por ID.
     *
     * @param id_caminhao_cli O ID do caminhão do assegurado a ser excluído.
     * @return Uma mensagem indicando o sucesso da exclusão.
     */
    public String deleteCaminhaoCliById(int id_caminhao_cli) {
        caminhaoCliRepository.deleteById(id_caminhao_cli);
        return "Usuário deletado";
    }
}
