package com.project.sprint4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sprint4.dao.OrdemServicoEmpresaRepository;
import com.project.sprint4.entities.OrdemServicoEmpresa;
@Service
/**
 * A classe <b>OrdemServicoEmpresaService</b> gerencia como os dados seram manipulados.
 * @author Matheus
 * @since Nov 2023
 */
public class OrdemServicoEmpresaService {
	/**
     * Repositório utilizado para acessar dados da entidade OrdemServicoEmpresa.
     */
    @Autowired
    private OrdemServicoEmpresaRepository ordemServicoEmpresaRepository;

    /**
     * Cria uma nova ordem de serviço de empresa no banco de dados.
     *
     * @param ordemServicoEmpresa O objeto OrdemServicoEmpresa a ser criado.
     * @return O objeto OrdemServicoEmpresa criado e salvo no banco de dados.
     */
    public OrdemServicoEmpresa createOrdemServicoEmpresa(OrdemServicoEmpresa ordemServicoEmpresa) {
        return ordemServicoEmpresaRepository.save(ordemServicoEmpresa);
    }

    /**
     * Cria uma lista de ordens de serviço de empresas no banco de dados.
     *
     * @param ordensServicoEmpresas A lista de objetos OrdemServicoEmpresa a serem criados.
     * @return A lista de objetos OrdemServicoEmpresa criados e salvos no banco de dados.
     */
    public List<OrdemServicoEmpresa> createOrdemServicoEmpresas(List<OrdemServicoEmpresa> ordensServicoEmpresas) {
        return ordemServicoEmpresaRepository.saveAll(ordensServicoEmpresas);
    }

    /**
     * Obtém uma ordem de serviço de empresa do banco de dados com base no ID fornecido.
     *
     * @param id_ordem_serv_emp O ID da ordem de serviço de empresa a ser recuperada.
     * @return O objeto OrdemServicoEmpresa associado ao ID fornecido, ou null se não encontrado.
     */
    public OrdemServicoEmpresa getOrdemServicoEmpresaById(int id_ordem_serv_emp) {
        return ordemServicoEmpresaRepository.findById(id_ordem_serv_emp).orElse(null);
    }

    /**
     * Obtém todas as ordens de serviço de empresas armazenadas no banco de dados.
     *
     * @return Uma lista de todos os objetos OrdemServicoEmpresa armazenados no banco de dados.
     */
    public List<OrdemServicoEmpresa> getOrdemServicoEmpresas() {
        return ordemServicoEmpresaRepository.findAll();
    }

    /**
     * Atualiza uma ordem de serviço de empresa existente no banco de dados.
     *
     * @param ordemServicoEmpresa O objeto OrdemServicoEmpresa com os dados atualizados.
     * @return O objeto OrdemServicoEmpresa atualizado e salvo no banco de dados, ou um novo objeto
     * OrdemServicoEmpresa se o ID não for encontrado.
     */
    public OrdemServicoEmpresa updateOrdemServicoEmpresa(OrdemServicoEmpresa ordemServicoEmpresa) {
        OrdemServicoEmpresa oldUser = null;
        Optional<OrdemServicoEmpresa> optionalUser = ordemServicoEmpresaRepository.findById(ordemServicoEmpresa.getId_ordem_serv_emp());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_ordem_serv_emp(ordemServicoEmpresa.getId_ordem_serv_emp());
            oldUser.setData_hora(ordemServicoEmpresa.getData_hora());
            oldUser.setLocal_serv(ordemServicoEmpresa.getLocal_serv());
            oldUser.setRota_guincho(ordemServicoEmpresa.getRota_guincho());
            ordemServicoEmpresaRepository.save(oldUser);
        } else {
            return new OrdemServicoEmpresa();
        }
        return oldUser;
    }

    /**
     * Exclui uma ordem de serviço de empresa do banco de dados com base no ID fornecido.
     *
     * @param id_ordem_serv_emp O ID da ordem de serviço de empresa a ser excluída.
     * @return Uma mensagem indicando o sucesso da exclusão.
     */
    public String deleteOrdemServicoEmpresaById(int id_ordem_serv_emp) {
        ordemServicoEmpresaRepository.deleteById(id_ordem_serv_emp);
        return "Usuário deletado";
    }
}
