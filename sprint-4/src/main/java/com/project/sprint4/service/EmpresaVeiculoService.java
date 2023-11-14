package com.project.sprint4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sprint4.dao.EmpresaVeiculoRepository;
import com.project.sprint4.entities.EmpresaVeiculo;
@Service
/**
 * A classe <b>EmpresaVeiculoService</b> gerencia como os dados seram manipulados.
 * @author Matheus
 * @since Nov 2023
 */
public class EmpresaVeiculoService {
	/**
     * Repositório utilizado para acessar dados da entidade EmpresaVeiculo.
     */
    @Autowired
    private EmpresaVeiculoRepository empresaVeiculoRepository;

    /**
     * Cria um novo veículo de empresa no banco de dados.
     *
     * @param empresaVeiculo O objeto EmpresaVeiculo a ser criado.
     * @return O objeto EmpresaVeiculo criado e salvo no banco de dados.
     */
    public EmpresaVeiculo createEmpresaVeiculo(EmpresaVeiculo empresaVeiculo) {
        return empresaVeiculoRepository.save(empresaVeiculo);
    }

    /**
     * Cria uma lista de veículos de empresas no banco de dados.
     *
     * @param empresaVeiculos A lista de objetos EmpresaVeiculo a serem criados.
     * @return A lista de objetos EmpresaVeiculo criados e salvos no banco de dados.
     */
    public List<EmpresaVeiculo> createEmpresaVeiculos(List<EmpresaVeiculo> empresaVeiculos) {
        return empresaVeiculoRepository.saveAll(empresaVeiculos);
    }

    /**
     * Obtém um veículo de empresa do banco de dados com base no ID fornecido.
     *
     * @param id_emp_veiculo O ID do veículo de empresa a ser recuperado.
     * @return O objeto EmpresaVeiculo associado ao ID fornecido, ou null se não encontrado.
     */
    public EmpresaVeiculo getEmpresaVeiculoById(int id_emp_veiculo) {
        return empresaVeiculoRepository.findById(id_emp_veiculo).orElse(null);
    }

    /**
     * Obtém todos os veículos de empresas armazenados no banco de dados.
     *
     * @return Uma lista de todos os objetos EmpresaVeiculo armazenados no banco de dados.
     */
    public List<EmpresaVeiculo> getEmpresaVeiculos() {
        return empresaVeiculoRepository.findAll();
    }

    /**
     * Atualiza um veículo de empresa existente no banco de dados.
     *
     * @param empresaVeiculo O objeto EmpresaVeiculo com os dados atualizados.
     * @return O objeto EmpresaVeiculo atualizado e salvo no banco de dados, ou um novo objeto
     * EmpresaVeiculo se o ID não for encontrado.
     */
    public EmpresaVeiculo updateEmpresaVeiculo(EmpresaVeiculo empresaVeiculo) {
        EmpresaVeiculo oldUser = null;
        Optional<EmpresaVeiculo> optionalUser = empresaVeiculoRepository.findById(empresaVeiculo.getId_emp_veiculo());
        if (optionalUser.isPresent()) {
            oldUser = optionalUser.get();
            oldUser.setId_emp_veiculo(empresaVeiculo.getId_emp_veiculo());
            oldUser.setPeso_max(empresaVeiculo.getPeso_max());
            oldUser.setComprimento(empresaVeiculo.getComprimento());
            oldUser.setAltura(empresaVeiculo.getAltura());
            oldUser.setQntd_eixos(empresaVeiculo.getQntd_eixos());
            oldUser.setCarga_perigosa(empresaVeiculo.getCarga_perigosa());
            oldUser.setCarga_viva(empresaVeiculo.getCarga_viva());
            oldUser.setMarca_veic(empresaVeiculo.getMarca_veic());
            oldUser.setModelo_veic(empresaVeiculo.getModelo_veic());
            empresaVeiculoRepository.save(oldUser);
        } else {
            return new EmpresaVeiculo();
        }
        return oldUser;
    }

    /**
     * Exclui um veículo de empresa do banco de dados com base no ID fornecido.
     *
     * @param id_emp_veiculo O ID do veículo de empresa a ser excluído.
     * @return Uma mensagem indicando o sucesso da exclusão.
     */
    public String deleteEmpresaVeiculoById(int id_emp_veiculo) {
        empresaVeiculoRepository.deleteById(id_emp_veiculo);
        return "Usuário deletado";
    }
}
