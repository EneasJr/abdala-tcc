/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1031985783270339708L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_cliente;
    private String nome;
    private String tipo;
    private String documento;
    @Temporal(TemporalType.DATE)
    private Date data_alt;
    private String telefone;
    private String celular;
    private String email;
    @OneToOne(optional=false, cascade= CascadeType.ALL, fetch= FetchType.EAGER)
    @JoinColumn(name="id_end")
    private EnderecoCliente end_cliente;

    public EnderecoCliente getEnd_cliente() {
        return end_cliente;
    }

    public void setEnd_cliente(EnderecoCliente end_cliente) {
        this.end_cliente = end_cliente;
    }
    

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getData_alt() {
        return data_alt;
    }

    public void setData_alt(Date data_alt) {
        this.data_alt = data_alt;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
