/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.ui;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import tcc.TCC;
import tcc.controller.UsuarioController;
import tcc.model.Usuario;

/**
 *
 * @author alberson
 */
public class CadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private UsuarioController controller;
    public CadastroUsuario() {
        initComponents();
        this.controller = new UsuarioController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cUOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cULogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cUSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        cUCancela = new javax.swing.JButton();
        cUConfSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marcenaria Primu's");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);

        cUOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cUOk.setText("OK");
        cUOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUOkActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Login");

        cULogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cULoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Senha");

        cUSenha.setToolTipText("");
        cUSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cUSenhaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Confirmar");

        cUCancela.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cUCancela.setText("Cancela");
        cUCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUCancelaActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel3))
                        .add(9, 9, 9))
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(40, 40, 40)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(cULogin)
                    .add(layout.createSequentialGroup()
                        .add(cUCancela)
                        .add(38, 38, 38)
                        .add(cUOk))
                    .add(cUSenha)
                    .add(cUConfSenha))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(37, 37, 37)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cULogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .add(7, 7, 7)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cUSenha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(cUConfSenha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cUOk)
                    .add(cUCancela))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cULoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cULoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cULoginActionPerformed

    private void cUSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cUSenhaKeyPressed
        //if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          //  validateLogin();
        //}
    }//GEN-LAST:event_cUSenhaKeyPressed

    private void cUOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUOkActionPerformed
        //validateLogin();
    }//GEN-LAST:event_cUOkActionPerformed

    private void cUCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUCancelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cUCancelaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cUCancela;
    private javax.swing.JPasswordField cUConfSenha;
    private javax.swing.JTextField cULogin;
    private javax.swing.JButton cUOk;
    private javax.swing.JPasswordField cUSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private void validateCadastroLogin() {
        char[] ps = this.cUSenha.getPassword();
        String lg = this.cULogin.getText();
        lg = lg.trim();
        if(lg.length() == 0) {
            JOptionPane.showMessageDialog(this, "Digite seu login", "", JOptionPane.ERROR_MESSAGE);
        }
        else if(ps.length == 0) {
            JOptionPane.showMessageDialog(this, "Digite sua senha", "", JOptionPane.ERROR_MESSAGE);
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < this.cUSenha.getPassword().length; i++){
                sb.append(this.cUSenha.getPassword()[i]);
            }
            String sSenha = sb.toString();
            Usuario usuario = controller.autenticaUsuario(this.cULogin.getText(), sSenha);
            if(usuario != null) {
                TCC.setUsuario(usuario);
                this.setVisible(false);
                new Principal().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Usuário ou senha não encontrados", "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
