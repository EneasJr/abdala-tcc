/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc;

import tcc.model.Usuario;
import tcc.ui.Login;

/**
 *
 * @author alex
 */
public class TCC {
    
    private static Usuario usuario;
    
    public static void main(String[] args) {
        new Login().setVisible(true);
    }

    public static void setUsuario(Usuario usuario) {
        if(TCC.usuario == null) {
            TCC.usuario = usuario;
        }
    }
    
    public static Usuario getUsuario() {
        return TCC.usuario;
    }
    
}
