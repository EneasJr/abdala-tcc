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
import tcc.model.Material;
import tcc.model.OS;

/**
 *
 * @author Eneas-NtBook
 */
public class OsDAO {
    
    private final static Logger log = Logger.getLogger(MaterialDAO.class.getName());
    private final Session session;

    public OsDAO(Session session) {
        this.session = session;
    }
    
    public void adiciona(OS os){
        Transaction trx = session.beginTransaction();
        trx.begin();
        try {
            session.save(os);
            trx.commit();
            log.log(Level.FINE, "Ordem de Serviço inserido com sucesso");
        }
        catch (HibernateException e) {
            trx.rollback();
            log.log(Level.SEVERE, "Ordem de Serviço não inserido", e);
        } 
    }    
    
}
