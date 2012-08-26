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
@Table(name="end_cliente")
public class EnderecoCliente implements Serializable{
    private static final long serialVersionUID = -5748854911616247276L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_end;
    private String endereco1;
    private String endereco2;
    private String cep;
    private String cidade;
    private String uf;

    public long getId_end() {
        return id_end;
    }

    public void setId_end(long id_end) {
        this.id_end = id_end;
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
