/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.dao;

import java.awt.Component;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import tcc.model.Cliente;

/**
 *
 * @author alberson
 */
public class ClienteDAO {
    
    private static final Logger log = Logger.getLogger(ClienteDAO.class.getName());
    private Session session;
    
    public ClienteDAO(Session session) {
        this.session = session;
    }

    public void adiciona(Cliente cliente){
        Transaction trx = session.beginTransaction();
        trx.begin();
        try {
            session.save(cliente);
            trx.commit();
            log.log(Level.FINE, "Cliente inserido com sucesso");
        }
        catch (HibernateException e) {
            trx.rollback();
            log.log(Level.SEVERE, "Cliente não inserido", e);
        } 
    }

    public Cliente buscaPorCPF(String CPF) {
        Criteria ct = session.createCriteria(Cliente.class);
        return (Cliente) ct.add(Restrictions.eq("documento", CPF)).uniqueResult();
    }

    public List<Cliente> lista() {
        Criteria ct = session.createCriteria(Cliente.class);
        return ct.list();
    }
    
}
