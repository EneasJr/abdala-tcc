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
@Table(name="administrador")
public class Administrador  implements Serializable{
    private static final long serialVersionUID = -1642119737159986716L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_adm;
    @OneToOne(optional=false, cascade= CascadeType.ALL, fetch= FetchType.EAGER)
    @JoinColumn(name="id_login")
    private Login login;

    public long getId_adm() {
        return id_adm;
    }

    public void setId_adm(long id_adm) {
        this.id_adm = id_adm;
    }
        public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    
    
    
}
