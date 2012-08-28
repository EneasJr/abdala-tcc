/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.dao;

import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import tcc.model.Login;

/**
 *
 * @author alberson
 */
public class LoginDAO {
    
    private static final Logger log = Logger.getLogger(LoginDAO.class.getName());
    private Session session;
    
    public LoginDAO(Session session){
        this.session = session;
    }
    
    public Login autenticaUsuario(Login login){
        Criteria ct = session.createCriteria(Login.class);
        Login lg = (Login) ct.add(Restrictions.eq("login", login.getLogin()))
                .add(Restrictions.eq("senha", login.getSenha())).uniqueResult();
        return lg;
        
    }
}
