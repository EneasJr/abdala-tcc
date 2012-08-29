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
import tcc.model.Material;

/**
 *
 * @author Eneas-NtBook
 */
public class MaterialDAO {
    
    private static Logger log = Logger.getLogger(MaterialDAO.class.getName());
    private Session session;

    public MaterialDAO(Session session) {
        this.session = session;
    }
        
        public void adiciona(Material material) {
        Transaction trx = session.beginTransaction();
        trx.begin();
        try {
            session.save(material);
            trx.commit();
            log.log(Level.FINE, "Material inserido com sucesso");
        } catch (HibernateException e) {
            trx.rollback();
            log.log(Level.SEVERE, "Material não inserido", e);
            }
        }
        public Material buscaTipo(String nome) {
        Criteria ct = session.createCriteria(Material.class);
        return (Material) ct.add(Restrictions.eq("Nome", nome)).uniqueResult();
         }
    }
   
    
    

