/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.controller;

import org.hibernate.Session;
import tcc.dao.LoginDAO;
import tcc.infra.CriadorDeSessao;
import tcc.model.Login;

/**
 *
 * @author alberson
 */
public class LoginController {
    private Session session;
    private LoginDAO dao;

    public LoginController() {
        this.session = new CriadorDeSessao().getSession();
        this.dao = new LoginDAO(session);
    }
    
    public Login autenticaUsuario(String usuario, String senha){
        Login login = new Login();
        login.setLogin(usuario);
        login.setSenha(senha);
        return dao.autenticaUsuario(login);
    }
    
    
}
