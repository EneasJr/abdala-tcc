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
import tcc.model.Funcionario;
import tcc.model.Material;

/**
 *
 * @author Eneas-NtBook
 */
public class MaterialDAO {
    
    private static Logger log = Logger.getLogger(MaterialDAO.class.getName());
        
        public void adiciona(Material material, Component c){
            
        Session session = new CriadorDeSessao().getSession();
        Transaction trx = session.beginTransaction();
        trx.begin();
        try{
            session.save(material);
            trx.commit();
            log.log(Level.FINE, "Material inserido com sucesso");
            JOptionPane.showMessageDialog(c, "Material inserido com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
        }
        catch (HibernateException e) {
            trx.rollback();
            log.log(Level.SEVERE, "Material não inserido", e);
            JOptionPane.showMessageDialog(c, "Não", null, JOptionPane.ERROR);
        } finally {
            session.close();
        }
    }
    
    public void adiciona(Material material){
        Session session = new CriadorDeSessao().getSession();
        Transaction trx = session.beginTransaction();
        trx.begin();
        try {
            session.save(material);
            trx.commit();
            log.log(Level.FINE, "Material inserido com sucesso");
        }
        catch (HibernateException e) {
            trx.rollback();
            log.log(Level.SEVERE, "Material não inserido", e);
        } finally {
            session.close();
        }
    }  
    
}
