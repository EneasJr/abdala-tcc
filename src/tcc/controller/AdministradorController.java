/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.controller;

import java.util.logging.Logger;
import org.hibernate.Session;
import tcc.TCC;
import tcc.dao.AdministradorDAO;
import tcc.infra.CriadorDeSessao;

/**
 *
 * @author alberson
 */
public class AdministradorController {
    private Session session;
    private AdministradorDAO dao;
    private static final Logger log = Logger.getLogger(AdministradorController.class.getName());
    
    public AdministradorController() {
        this.session = new CriadorDeSessao().getSession();
        this.dao = new AdministradorDAO(session);
    }
    
    public boolean isAdmin(){
        return dao.isAdmin(TCC.getUsuarioLogado().getId_login());
    }
    
}
