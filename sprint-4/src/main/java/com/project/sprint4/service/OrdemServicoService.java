package com.project.sprint4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sprint4.dao.OrdemServicoRepository;
import com.project.sprint4.entities.OrdemServico;

@Service
public class OrdemServicoService {
	/**
     * Repositório utilizado para acessar dados da entidade OrdemServico.
     */
    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    /**
     * Cria uma nova ordem de serviço no banco de dados.
     *
     * @param ordemServico O objeto OrdemServico a ser criado.
     * @return O objeto OrdemServico criado e salvo no banco de dados.
     */
    public OrdemServico createOrdemServico(OrdemServico ordemServico) {
        return ordemServicoRepository.save(ordemServico);
    }

    /**
     * Cria uma lista de ordens de serviço no banco de dados.
     *
     * @param ordemServico A lista de objetos OrdemServico a serem criados.
     * @return A lista de objetos OrdemServico criados e salvos no banco de dados.
     */
    public List<OrdemServico> createOrdemServicos(List<OrdemServico> ordemServico) {
        return ordemServicoRepository.saveAll(ordemServico);
    }

    /**
     * Obtém uma ordem de serviço do banco de dados com base no ID fornecido.
     *
     * @param id_ordem_serv O ID da ordem de serviço a ser recuperada.
     * @return O objeto OrdemServico associado ao ID fornecido, ou null se não encontrado.
     */
    public OrdemServico getOrdemServicoById(int id_ordem_serv) {
        return ordemServicoRepository.findById(id_ordem_serv).orElse(null);
    }

    /**
     * Obtém todas as ordens de serviço armazenadas no banco de dados.
     *
     * @return Uma lista de todos os objetos OrdemServico armazenados no banco de dados.
     */
    public List<OrdemServico> getOrdemServicos() {
        return ordemServicoRepository.findAll();
    }

    /**
     * Atualiza uma ordem de serviço existente no banco de dados.
     *
     * @param ordemServico O objeto OrdemServico com os dados atualizados.
     * @return O objeto OrdemServico atualizado e salvo no banco de dados, ou um novo objeto
     *         OrdemServico se o ID não for encontrado.
     */
    public OrdemServico updateOrdemServico(OrdemServico ordemServico) {
        OrdemServico oldUser = null;
        Optional<OrdemServico> optionaluser = ordemServicoRepository.findById(ordemServico.getId_ordem_serv());
        if (optionaluser.isPresent()) {
            oldUser = optionaluser.get();
            oldUser.setId_ordem_serv(ordemServico.getId_ordem_serv());
            oldUser.setData_hora(ordemServico.getData_hora());
            oldUser.setLocal_serv(ordemServico.getLocal_serv());
            oldUser.setRota_guincho(ordemServico.getRota_guincho());
            ordemServicoRepository.save(oldUser);
        } else {
            return new OrdemServico();
        }
        return oldUser;
    }

    /**
     * Exclui uma ordem de serviço do banco de dados com base no ID fornecido.
     *
     * @param id_ordem_serv O ID da ordem de serviço a ser excluída.
     * @return Uma mensagem indicando o sucesso da exclusão.
     */
    public String deleteOrdemServicoById(int id_ordem_serv) {
        ordemServicoRepository.deleteById(id_ordem_serv);
        return "Ordem de Serviço deletada";
    }
}
