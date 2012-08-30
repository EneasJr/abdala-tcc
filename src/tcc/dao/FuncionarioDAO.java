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
import org.hibernate.criterion.Restrictions;
import tcc.model.Funcionario;

public class FuncionarioDAO {

    private static final Logger log = Logger.getLogger(FuncionarioDAO.class.getName());
    private Session session;

    public FuncionarioDAO(Session session) {
        this.session = session;
    }

    public void adiciona(Funcionario funcionario) {
        Transaction trx = session.beginTransaction();
        trx.begin();
        try {
            session.save(funcionario);
            trx.commit();
            log.log(Level.FINE, "Funcionário inserido com sucesso");
        } catch (HibernateException e) {
            trx.rollback();
            log.log(Level.SEVERE, "Funcionário não inserido", e);
        }
    }

    public Funcionario buscaPorCpf(String cpf) {
        Criteria ct = session.createCriteria(Funcionario.class);
        return (Funcionario) ct.add(Restrictions.eq("cpf", cpf)).uniqueResult();
    }
   /** public List<Funcionario> listaFuncionario(){
        Criteria ct = session.createCriteria(Funcionario.class);
        return ct.list();
        
    }
    **/ 
}
