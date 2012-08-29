/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.controller;

import java.util.List;
import org.hibernate.Session;
import tcc.dao.MaterialDAO;
import tcc.infra.CriadorDeSessao;
import tcc.model.Funcionario;
import tcc.model.Material;

/**
 *
 * @author Eneas-NtBook
 */
public class MaterialController {
    
    private MaterialDAO dao;
    private final Session session;
    
    public MaterialController(){
        this.session = new CriadorDeSessao().getSession();
        this.dao = new MaterialDAO(this.session);
    }
    
    public void adiciona(Material material){
        dao.adiciona(material);
    }
    
    public Material buscaTipo(String nome) {
        return dao.buscaTipo(nome);
    }
    
}
