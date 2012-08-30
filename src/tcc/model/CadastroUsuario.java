/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class CadastroUsuario {
    private static final long serialVersionUID = 863843336693807996L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(updatable=false)
    private long id_usuario;
    private String login;
    private String senha;
    private String confirmarSenha;

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }
    
}
