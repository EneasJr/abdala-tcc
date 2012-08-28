/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc;

import tcc.ui.Login;

/**
 *
 * @author alex
 */
public class TCC {

    /**
     * @param args the command line arguments
     */
    
    private static tcc.model.Login login = null;
    private static boolean isAdmin;
    
    public static void setLogin(tcc.model.Login login) {
        if(TCC.login == null) {
            TCC.login = login;
        }
    }
    
    public static tcc.model.Login getUsuarioLogado() {
        return TCC.login;
    }
    
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
