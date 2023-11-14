package com.project.sprint4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sprint4.dao.EmpresaRepository;
import com.project.sprint4.entities.Empresa;
@Service
/**
 * A classe <b>EmpresaService</b> gerencia como os dados seram manipulados.
 * @author Matheus
 * @since Nov 2023
 */
public class EmpresaService {
	/**
     * Repositório utilizado para acessar dados da entidade Empresa.
     */
    @Autowired
    private EmpresaRepository empresaRepository;

    /**
     * Cria uma nova empresa no banco de dados.
     *
     * @param empresa O objeto Empresa a ser criado.
     * @return O objeto Empresa criado e salvo no banco de dados.
     */
    public Empresa createEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    /**
     * Cria uma lista de empresas no banco de dados.
     *
     * @param empresas A lista de objetos Empresa a serem criados.
     * @return A lista de objetos Empresa criados e salvos no banco de dados.
     */
    public List<Empresa> createEmpresas(List<Empresa> empresas) {
        return empresaRepository.saveAll(empresas);
    }

    /**
     * Obtém uma empresa do banco de dados com base no ID fornecido.
     *
     * @param id_emp O ID da empresa a ser recuperada.
     * @return O objeto Empresa associado ao ID fornecido, ou null se não encontrado.
     */
    public Empresa getEmpresaById(int id_emp) {
        return empresaRepository.findById(id_emp).orElse(null);
    }

    /**
     * Obtém todas as empresas armazenadas no banco de dados.
     *
     * @return Uma lista de todos os objetos Empresa armazenados no banco de dados.
     */
    public List<Empresa> getEmpresas() {
        return empresaRepository.findAll();
    }

    /**
     * Atualiza uma empresa existente no banco de dados.
     *
     * @param empresa O objeto Empresa com os dados atualizados.
     * @return O objeto Empresa atualizado e salvo no banco de dados, ou um novo objeto
     * Empresa se o ID não for encontrado.
     */
    public Empresa updateEmpresa(Empresa empresa) {
        Empresa oldUser = null;
        Optional<Empresa> optionalUser = empresaRepository.findById(empresa.getId_emp());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_emp(empresa.getId_emp());
            oldUser.setNome_emp(empresa.getNome_emp());
            oldUser.setRota_veic(empresa.getRota_veic());
            oldUser.setNome_motorista(empresa.getNome_motorista());
            oldUser.setContato_motorista(empresa.getContato_motorista());
            oldUser.setCnh_motorista(empresa.getCnh_motorista());
            empresaRepository.save(oldUser);
        } else {
            return new Empresa();
        }
        return oldUser;
    }

    /**
     * Exclui uma empresa do banco de dados com base no ID fornecido.
     *
     * @param id_emp O ID da empresa a ser excluída.
     * @return Uma mensagem indicando o sucesso da exclusão.
     */
    public String deleteEmpresaById(int id_emp) {
        empresaRepository.deleteById(id_emp);
        return "Usuário deletado";
    }
}
