/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tcc.model.OS;

public class OsDAO {

    private static Logger log = Logger.getLogger(MaterialDAO.class.getName());
    private final Session session;

    public OsDAO(Session session) {
        this.session = session;
    }

    public void adiciona(OS os) {
        Transaction trx = session.beginTransaction();
        trx.begin();
        try {
            session.save(os);
            trx.commit();
            log.log(Level.FINE, "Ordem de Serviço inserido com sucesso");
        } catch (HibernateException e) {
            trx.rollback();
            log.log(Level.SEVERE, "Ordem de Serviço não inserido", e);
        }
    }
    
    public List<OS> lista() {
        Criteria ct = session.createCriteria(OS.class);
        return ct.list();
    }
}
