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

@Entity
@Table(name="end_func")
public class EnderecoFuncionario implements Serializable{
    private static final long serialVersionUID = -7949418044367789505L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_end_func;
    private String endereco1;
    private String endereco2;
    private String cep;
    private String cidade;
    private String uf;

    public long getId_end_func() {
        return id_end_func;
    }

    public void setId_end_func(long id_end_func) {
        this.id_end_func = id_end_func;
    }

    public String getEndereco1() {
        return endereco1;
    }

    public void setEndereco1(String endereco1) {
        this.endereco1 = endereco1;
    }

    public String getEndereco2() {
        return endereco2;
    }

    public void setEndereco2(String endereco2) {
        this.endereco2 = endereco2;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
    
}
