/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.controller;

import org.hibernate.Session;
import tcc.dao.UsuarioDAO;
import tcc.infra.CriadorDeSessao;
import tcc.model.Usuario;

/**
 *
 * @author alberson
 */
public class UsuarioController {
    private Session session;
    private UsuarioDAO dao;
    
    public UsuarioController(){
        this.session = new CriadorDeSessao().getSession();
        dao = new UsuarioDAO(this.session);
    }
    
    public Usuario autenticaUsuario(String login, String senha){
        return dao.autenticaUsuario(login, senha);
    }
    
}
