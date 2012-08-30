/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.dao;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import tcc.ui.CadastroUsuario;

/**
 *
 * @author Eneas-NtBook
 */
public class CadastroUsuarioDAO {
    
    private static Logger log = Logger.getLogger(CadastroUsuarioDAO.class.getName());
    private Session session;

    public CadastroUsuarioDAO(Session session) {
        this.session = session;
    }
        
        public void adiciona(CadastroUsuario usuario) {
        Transaction trx = session.beginTransaction();
        trx.begin();
        try {
            session.save(usuario);
            trx.commit();
            log.log(Level.FINE, "Cadastro de usuário incluso com sucesso");
        } catch (HibernateException e) {
            trx.rollback();
            log.log(Level.SEVERE, "Cadastro não inserido", e);
            }
        }

    public CadastroUsuario buscaPorLogin(String login) {
        Criteria ct = session.createCriteria(CadastroUsuario.class);
        return (CadastroUsuario) ct.add(Restrictions.eq("Login", login)).uniqueResult();
    }
    
}
