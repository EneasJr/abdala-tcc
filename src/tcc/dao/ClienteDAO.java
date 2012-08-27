/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.dao;

import java.awt.Component;
import java.awt.TrayIcon.MessageType;
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

    public void adiciona(Cliente cliente, Component c) {
        Session session = new CriadorDeSessao().getSession();
        Transaction trx = session.beginTransaction();
        trx.begin();
        try {
            session.save(cliente);
            trx.commit();
            JOptionPane.showMessageDialog(c, "Cliente inserido com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
        }
        catch (HibernateException e) {
            trx.rollback();
            JOptionPane.showMessageDialog(c, "Não", null, JOptionPane.ERROR);
        } finally {
            session.close();
        }
    }
    
}
