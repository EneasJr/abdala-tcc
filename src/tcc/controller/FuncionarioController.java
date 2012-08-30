/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.controller;

import org.hibernate.Session;
import tcc.dao.FuncionarioDAO;
import tcc.infra.CriadorDeSessao;
import tcc.model.Funcionario;
import java.util.List;

/**
 *
 * @author Eneas-NtBook
 */
public class FuncionarioController {
    
    private FuncionarioDAO dao;
    private final Session session;
    
    public FuncionarioController(){
        this.session = new CriadorDeSessao().getSession();
        this.dao = new FuncionarioDAO(this.session);
    }
    
    public void adiciona(Funcionario funcionario){
        this.dao.adiciona(funcionario);
    }
    
    public Funcionario buscaPorCpf(String cpf) {
        return this.dao.buscaPorCpf(cpf);
    }
    /**public List<Funcionario> listaFuncionario(){
        return dao.listaFuncionario();
    }
    **/
  }
  
    
