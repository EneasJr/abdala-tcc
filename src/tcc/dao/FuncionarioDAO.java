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



public class FuncionarioDAO {
    
    private static Logger log = Logger.getLogger(FuncionarioDAO.class.getName());
        
        public void adiciona(FuncionarioDAO funcionario, Component c){
            
        Session session = new CriadorDeSessao().getSession();
        Transaction trx = session.beginTransaction();
        trx.begin();
        try{
            session.save(funcionario);
            trx.commit();
            log.log(Level.FINE, "Funcionário inserido com sucesso");
            JOptionPane.showMessageDialog(c, "Funcionario inserido com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
        }
        catch (HibernateException e) {
            trx.rollback();
            log.log(Level.SEVERE, "Funcionário não inserido", e);
            JOptionPane.showMessageDialog(c, "Não", null, JOptionPane.ERROR);
        } finally {
            session.close();
        }
    }
    
    public void adiciona(FuncionarioDAO funcionario){
        Session session = new CriadorDeSessao().getSession();
        Transaction trx = session.beginTransaction();
        trx.begin();
        try {
            session.save(funcionario);
            trx.commit();
            log.log(Level.FINE, "Funcionário inserido com sucesso");
        }
        catch (HibernateException e) {
            trx.rollback();
            log.log(Level.SEVERE, "Funcionário não inserido", e);
        } finally {
            session.close();
        }
    }
    
}
