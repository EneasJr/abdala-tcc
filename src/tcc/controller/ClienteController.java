/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.controller;

import java.util.List;
import java.util.logging.Logger;
import tcc.dao.ClienteDAO;
import tcc.model.Cliente;

/**
 *
 * @author alberson
 */
public class ClienteController {

    private ClienteDAO dao;

    public ClienteController(ClienteDAO dao) {
        this.dao = dao;
    }
    
    private static final Logger log = Logger.getLogger(ClienteController.class.getName());

    public void inserirCliente(Cliente cliente) {
        dao.adiciona(cliente);
    }
    
    public List<Cliente> listarClientes() {
        return dao.lista();
    }
}
