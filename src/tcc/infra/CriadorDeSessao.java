/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.infra;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionFactory {
    
    org.hibernate.SessionFactory sessionFactory;
    
    public SessionFactory(){
        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.configure();
        this.sessionFactory =configuration.buildSessionFactory();
    }
    public Session getSession() {
        return this.sessionFactory.openSession();
    }
}
