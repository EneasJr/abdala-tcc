/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.infra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class CriadorDeSessao {

    SessionFactory sessionFactory;

    public CriadorDeSessao() {
        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.configure();
        this.sessionFactory = configuration.buildSessionFactory();
    }

    public Session getSession() {
        return this.sessionFactory.openSession();
    }
}
