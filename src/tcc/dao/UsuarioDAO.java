/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import tcc.model.Usuario;

/**
 *
 * @author alberson
 */
public class UsuarioDAO {
    private Session session;
    public UsuarioDAO(Session session) {
        this.session = session;
    }

    public Usuario autenticaUsuario(String login, String senha) {
        Criteria ct = session.createCriteria(Usuario.class);
        return (Usuario) ct.add(Restrictions.eq("login", login))
                .add(Restrictions.eq("senha", senha)).uniqueResult();
    }
    
}
