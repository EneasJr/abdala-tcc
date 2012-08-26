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
@Table(name="tipo_servico")
public class TipoServico implements Serializable {
    private static final long serialVersionUID = 7505770424964923466L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_tipo_servico;
    private String tipo_servico;
    private String descricao;

    public long getId_tipo_servico() {
        return id_tipo_servico;
    }

    public void setId_tipo_servico(long id_tipo_servico) {
        this.id_tipo_servico = id_tipo_servico;
    }

    public String getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
