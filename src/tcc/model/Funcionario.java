/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name="funcionario")
public class Funcionario implements Serializable{
    private static final long serialVersionUID = 576557191827691038L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_funcionario;
    private String nome;
    @OneToOne(optional=false, cascade= CascadeType.ALL, fetch= FetchType.EAGER)
    @JoinColumn(name="id_funcao")
    private long id_funcao;
    @Temporal(TemporalType.DATE)
    private Date data_admissao;
    @Temporal(TemporalType.DATE)
    private Date data_demissao;
    @OneToOne(optional=false, cascade= CascadeType.ALL,fetch= FetchType.EAGER)
    @JoinColumn(name="id_login")
    private long id_login;

    public long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId_funcao() {
        return id_funcao;
    }

    public void setId_funcao(long id_funcao) {
        this.id_funcao = id_funcao;
    }

    public Date getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(Date data_admissao) {
        this.data_admissao = data_admissao;
    }

    public Date getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(Date data_demissao) {
        this.data_demissao = data_demissao;
    }

    public long getId_login() {
        return id_login;
    }

    public void setId_login(long id_login) {
        this.id_login = id_login;
    }
    
    
    
}
