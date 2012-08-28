/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.controller;

import java.util.logging.Logger;
import org.hibernate.Session;
import tcc.TCC;
import tcc.dao.AdministradorDAO;

/**
 *
 * @author alberson
 */
public class AdministradorController {
    private Session session;
    private AdministradorDAO dao;
    private static final Logger log = Logger.getLogger(AdministradorController.class.getName());
    
    public AdministradorController(Session session) {
        this.session = session;
        this.dao = new AdministradorDAO(session);
    }
    
    public boolean isAdmin(){
        return dao.isAdmin(TCC.getUsuarioLogado().getId());
    }
    
}
