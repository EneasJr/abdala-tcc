/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.dao;

import org.hibernate.Session;
import tcc.infra.CriadorDeSessao;
import tcc.model.Cliente;

/**
 *
 * @author alberson
 */
public class ClienteDAO {

    public void adiciona(Cliente cliente) {
        Session session = new CriadorDeSessao().getSession();
        session.save(cliente);
    }
    
}
