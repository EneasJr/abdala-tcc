/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.dao;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import tcc.infra.CriadorDeSessao;
import tcc.model.Cliente;

/**
 *
 * @author alberson
 */
public class ClienteDAO {
    
    private static final Logger log = Logger.getLogger(ClienteDAO.class.getName());

    public void adiciona(Cliente cliente, Component c) {
        Session session = new CriadorDeSessao().getSession();
        Transaction trx = session.beginTransaction();
        trx.begin();
        try {
            session.save(cliente);
            trx.commit();
        log.log(Level.FINE, "Cliente inserido com sucesso");
            JOptionPane.showMessageDialog(c, "Cliente inserido com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
        }
        catch (HibernateException e) {
            trx.rollback();
            log.log(Level.SEVERE, "Cliente não inserido", e);
            JOptionPane.showMessageDialog(c, "Não", null, JOptionPane.ERROR);
        } finally {
            session.close();
        }
    }
    
    public void adiciona(Cliente cliente){
        Session session = new CriadorDeSessao().getSession();
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
        } finally {
            session.close();
        }
    }
    
}
