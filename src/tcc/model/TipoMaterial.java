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
@Table(name="tipo_material")
public class TipoMaterial implements Serializable {
    private static final long serialVersionUID = 4436042607331867011L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_tipo_material;
    private String nome;
    private String descricao;

    public long getId_tipo_material() {
        return id_tipo_material;
    }

    public void setId_tipo_material(long id_tipo_material) {
        this.id_tipo_material = id_tipo_material;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
