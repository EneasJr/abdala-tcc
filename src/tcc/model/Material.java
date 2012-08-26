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

@Entity
@Table(name="material")
public class Material implements Serializable{
    private static final long serialVersionUID = -3448371241430210380L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_material;
    
    @OneToOne(cascade= CascadeType.ALL, optional=false, fetch= FetchType.EAGER)
    @JoinColumn(name = "id_tipo_material")
    private TipoMaterial tipo_material;
    
    private String nome;

    public long getId_material() {
        return id_material;
    }

    public void setId_material(long id_material) {
        this.id_material = id_material;
    }

    public TipoMaterial getTipo_material() {
        return tipo_material;
    }

    public void setTipo_material(TipoMaterial tipo_material) {
        this.tipo_material = tipo_material;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
