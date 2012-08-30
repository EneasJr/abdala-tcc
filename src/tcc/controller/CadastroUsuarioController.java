/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.controller;

import org.hibernate.Session;
import tcc.dao.CadastroUsuarioDAO;
import tcc.infra.CriadorDeSessao;
import tcc.ui.CadastroUsuario;

/**
 *
 * @author Eneas-NtBook
 */
public class CadastroUsuarioController {
    
    private Session session;
    private CadastroUsuarioDAO dao;
    public CadastroUsuarioController(){
        this.session = new CriadorDeSessao().getSession();
        this.dao = new CadastroUsuarioDAO(this.session);
    }
    
    public void adiciona(CadastroUsuario usuario){
        this.dao.adiciona(usuario);
             
    }
    
    public CadastroUsuario buscaPorLogin(String login) {
        return this.dao.buscaPorLogin(login);
    }
    
}
