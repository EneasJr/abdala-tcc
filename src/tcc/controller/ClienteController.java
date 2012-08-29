/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.controller;

import java.util.List;
import org.hibernate.Session;
import tcc.dao.ClienteDAO;
import tcc.infra.CriadorDeSessao;
import tcc.model.Cliente;

/**
 *
 * @author alberson
 */
public class ClienteController {
    private Session session;
    private ClienteDAO dao;
    public ClienteController(){
        this.session = new CriadorDeSessao().getSession();
        this.dao = new ClienteDAO(this.session);
    }
    
    public void adiciona(Cliente cliente){
        dao.adiciona(cliente);
    }
    
    public List<Cliente> todosClientes() {
        return dao.lista();
    }
    
}
