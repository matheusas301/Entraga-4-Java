package com.project.sprint4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sprint4.dao.AsseguradoRepository;
import com.project.sprint4.entities.Assegurado;

@Service
/**
 * A classe <b>AsseguradoService</b> gerencia como os dados seram manipulados.
 * @author Matheus
 * @since Nov 2023
 */
public class AsseguradoService {

	/**
     * Repositório utilizado para acessar dados da entidade Assegurado.
     */
    @Autowired
    private AsseguradoRepository asseguradoRepository;

    /**
     * Cria um novo usuário assegurado no banco de dados.
     *
     * @param assegurado O objeto Assegurado a ser criado.
     * @return O objeto Assegurado criado e salvo no banco de dados.
     */
    public Assegurado createAssegurado(Assegurado assegurado) {
        return asseguradoRepository.save(assegurado);
    }

    /**
     * Cria uma lista de usuários assegurados no banco de dados.
     *
     * @param assegurado A lista de objetos Assegurado a serem criados.
     * @return A lista de objetos Assegurado criados e salvos no banco de dados.
     */
    public List<Assegurado> createAssegurados(List<Assegurado> assegurado) {
        return asseguradoRepository.saveAll(assegurado);
    }

    /**
     * Obtém um usuário assegurado do banco de dados com base no ID fornecido.
     *
     * @param id_assegurado O ID do usuário assegurado a ser recuperado.
     * @return O objeto Assegurado associado ao ID fornecido, ou null se não encontrado.
     */
    public Assegurado getAsseguradoById(int id_assegurado) {
        return asseguradoRepository.findById(id_assegurado).orElse(null);
    }

    /**
     * Obtém todos os usuários assegurados armazenados no banco de dados.
     *
     * @return Uma lista de todos os objetos Assegurado armazenados no banco de dados.
     */
    public List<Assegurado> getAssegurados() {
        return asseguradoRepository.findAll();
    }

    /**
     * Atualiza um usuário assegurado existente no banco de dados.
     *
     * @param assegurado O objeto Assegurado com os dados atualizados.
     * @return O objeto Assegurado atualizado e salvo no banco de dados, ou um novo objeto
     * Assegurado se o ID não for encontrado.
     */
    public Assegurado updateAssegurado(Assegurado assegurado) {
        Assegurado oldUser = null;
        Optional<Assegurado> optionalUser = asseguradoRepository.findById(assegurado.getId_assegurado());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_assegurado(assegurado.getId_assegurado());
            oldUser.setNome(assegurado.getNome());
            oldUser.setCpf(assegurado.getCpf());
            oldUser.setRg(assegurado.getRg());
            oldUser.setSexo(assegurado.getSexo());
            oldUser.setCelular(assegurado.getCelular());
            oldUser.setEmail(assegurado.getEmail());
            oldUser.setCep(assegurado.getCep());
            oldUser.setEstado(assegurado.getEstado());
            oldUser.setData_nascimento(assegurado.getData_nascimento());
            oldUser.setFone_pessoal(assegurado.getFone_pessoal());
            oldUser.setFone_residencial(assegurado.getFone_residencial());
            oldUser.setCidade(assegurado.getCidade());
            oldUser.setBairro(assegurado.getBairro());
            oldUser.setEndereco(assegurado.getEndereco());
            asseguradoRepository.save(oldUser);
        } else {
            return new Assegurado();
        }
        return oldUser;
    }

    /**
     * Exclui um usuário assegurado do banco de dados com base no ID fornecido.
     *
     * @param id_assegurado O ID do usuário assegurado a ser excluído.
     * @return Uma mensagem indicando o sucesso da exclusão.
     */
    public String deleteAsseguradoById(int id_assegurado) {
        asseguradoRepository.deleteById(id_assegurado);
        return "Usuário deletado";
    }
}
