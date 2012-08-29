/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc;

import tcc.model.Usuario;
import tcc.ui.CadastroCliente;
import tcc.ui.Login;

/**
 *
 * @author alex
 */
public class TCC {
    
    private static Usuario usuario;
    
    private static String laf() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.indexOf("win") >= 0) {
            return "Windows";
        }
        if (os.indexOf("mac") >= 0) {
            return "Mac OS X";
        }
        return "Nimbus";
    }
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                if (laf().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
