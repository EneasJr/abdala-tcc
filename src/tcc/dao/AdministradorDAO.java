/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.dao;

import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import tcc.model.Administrador;

/**
 *
 * @author alberson
 */
public class AdministradorDAO {
    private Session session;
    private static final Logger log = Logger.getLogger(AdministradorDAO.class.getName());
    
    public AdministradorDAO(Session session) {
        this.session = session;
    }
    
    public boolean isAdmin(long login_id){
        Criteria ct = session.createCriteria(Administrador.class);
        return ct.add(Restrictions.eq("id_login", login_id)).uniqueResult() != null;
    }
    
}
