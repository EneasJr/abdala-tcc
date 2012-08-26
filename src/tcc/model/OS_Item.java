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
@Table(name="os_item")
public class OS_Item implements Serializable {
    private static final long serialVersionUID = 8510295404946876750L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_os_item;
    
    @OneToOne(cascade= CascadeType.ALL, optional=false, fetch= FetchType.EAGER)
    @JoinColumn(name = "id_os")
    private OS os;
    
    @OneToOne(cascade= CascadeType.ALL, optional=false, fetch= FetchType.EAGER)
    @JoinColumn(name = "id_material")
    private Material material;
    
    private String descricao;
    private long quantidade;

    public long getId_os_item() {
        return id_os_item;
    }

    public void setId_os_item(long id_os_item) {
        this.id_os_item = id_os_item;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }
    
}
