/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.ui;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import tcc.controller.ClienteController;
import tcc.model.Cliente;
import tcc.model.EnderecoCliente;

/**
 *
 * @author Affero
 */
public class CadastroCliente extends javax.swing.JFrame {
    
    private Border border;
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        this.border = this.eCEP.getBorder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        JPanelCadastro = new javax.swing.JPanel();
        btnBusca = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        eCodigo = new javax.swing.JTextField();
        lblDataAlteracao = new javax.swing.JLabel();
        rdPF = new javax.swing.JRadioButton();
        rdPJ = new javax.swing.JRadioButton();
        lblCNPJ = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        eNome = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        eEndereco = new javax.swing.JTextField();
        eEndereco2 = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        eCidade = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        eDateAlt = new javax.swing.JFormattedTextField();
        eCNPJ = new javax.swing.JFormattedTextField();
        eCEP = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        eTel = new javax.swing.JFormattedTextField();
        cbUF = new javax.swing.JComboBox();
        lblEmail = new javax.swing.JLabel();
        eEmail = new javax.swing.JTextField();
        lblCel = new javax.swing.JLabel();
        eCel = new javax.swing.JFormattedTextField();
        btnInserir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        JMenuBarra = new javax.swing.JMenuBar();
        JMAjuda = new javax.swing.JMenu();
        aSobre = new javax.swing.JMenuItem();
        aServicosSup = new javax.swing.JMenuItem();
        aAtalhos = new javax.swing.JMenuItem();

        setTitle("Cadastro de Clientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Menu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        JPanelCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnBusca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBusca.setText("Busca");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigo.setText("Código");

        eCodigo.setName("eCodigo"); // NOI18N

        lblDataAlteracao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDataAlteracao.setText("Data. Ult. Alteração");

        buttonGroup2.add(rdPF);
        rdPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdPF.setText("PF");
        rdPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPFActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdPJ);
        rdPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdPJ.setSelected(true);
        rdPJ.setText("PJ");

        lblCNPJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCNPJ.setText("C.N.P.J/CPF");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setText("Nome/Razão Social");

        eNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eNomeActionPerformed(evt);
            }
        });
        eNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eNomeFocusLost(evt);
            }
        });
        eNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eNomeKeyPressed(evt);
            }
        });

        lblEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEndereco.setText("Endereço");

        eEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eEnderecoFocusLost(evt);
            }
        });
        eEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eEnderecoKeyPressed(evt);
            }
        });

        eEndereco2.setName("eEndereco"); // NOI18N

        lblCep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCep.setText("Cep");

        lblCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCidade.setText("Cidade");

        eCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eCidadeFocusLost(evt);
            }
        });
        eCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eCidadeKeyPressed(evt);
            }
        });

        lblUF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUF.setText("UF");

        try {
            eDateAlt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            eCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        eCNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eCNPJFocusLost(evt);
            }
        });
        eCNPJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eCNPJKeyPressed(evt);
            }
        });

        try {
            eCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        eCEP.setPreferredSize(new java.awt.Dimension(14, 28));
        eCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eCEPFocusLost(evt);
            }
        });
        eCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eCEPKeyPressed(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTelefone.setText("Telefone");

        try {
            eTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        eTel.setPreferredSize(new java.awt.Dimension(14, 28));
        eTel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eTelFocusLost(evt);
            }
        });
        eTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eTelKeyPressed(evt);
            }
        });

        cbUF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AL", "AP", "AM", "BA", "CE", "DF ", "ES", "GO", "MA", "MT", "MS", "MG", "PR", "PB", "PA", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "SP", "TO" }));
        cbUF.setName(""); // NOI18N
        cbUF.setPreferredSize(new java.awt.Dimension(14, 28));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setText("E-mail");

        eEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eEmailFocusLost(evt);
            }
        });
        eEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eEmailKeyPressed(evt);
            }
        });

        lblCel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCel.setText("Celular");

        try {
            eCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        eCel.setPreferredSize(new java.awt.Dimension(14, 28));
        eCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eCelActionPerformed(evt);
            }
        });
        eCel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eCelFocusLost(evt);
            }
        });
        eCel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eCelKeyPressed(evt);
            }
        });

        btnInserir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAtualizar.setText("Atualizar");

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSair.setText("Sair");

        javax.swing.GroupLayout JPanelCadastroLayout = new javax.swing.GroupLayout(JPanelCadastro);
        JPanelCadastro.setLayout(JPanelCadastroLayout);
        JPanelCadastroLayout.setHorizontalGroup(
            JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCadastroLayout.createSequentialGroup()
                .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelCadastroLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(eCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdPJ)
                            .addComponent(rdPF)
                            .addGroup(JPanelCadastroLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(eCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblDataAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(eDateAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelCadastroLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPanelCadastroLayout.createSequentialGroup()
                                .addComponent(lblEndereco)
                                .addGap(8, 8, 8)
                                .addComponent(eEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCep)
                                .addGap(10, 10, 10)
                                .addComponent(eCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelCadastroLayout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(eNome, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPanelCadastroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(534, 534, 534)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addGroup(JPanelCadastroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelCadastroLayout.createSequentialGroup()
                        .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelCadastroLayout.createSequentialGroup()
                                .addComponent(eTel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(eEmail)))
                    .addGroup(JPanelCadastroLayout.createSequentialGroup()
                        .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelCadastroLayout.createSequentialGroup()
                                .addComponent(eEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(JPanelCadastroLayout.createSequentialGroup()
                                .addComponent(eCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelCadastroLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelCadastroLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(eCel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(308, 308, 308))
        );
        JPanelCadastroLayout.setVerticalGroup(
            JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCadastroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelCadastroLayout.createSequentialGroup()
                        .addComponent(rdPJ)
                        .addGap(3, 3, 3)
                        .addComponent(rdPF))
                    .addGroup(JPanelCadastroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(eCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBusca)
                            .addComponent(lblCNPJ)
                            .addComponent(eCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eDateAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(eNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEndereco)
                        .addComponent(eEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCep)
                    .addComponent(eCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(eEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCidade)
                    .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUF)))
                .addGap(16, 16, 16)
                .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefone)
                        .addComponent(eTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCel)
                        .addComponent(eCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(eEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(JPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInserir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair)))
        );

        getContentPane().add(JPanelCadastro);
        JPanelCadastro.setBounds(20, 20, 950, 450);

        JMAjuda.setText("Ajuda");

        aSobre.setText("Sobre?");
        JMAjuda.add(aSobre);

        aServicosSup.setText("Serviços e Suporte");
        JMAjuda.add(aServicosSup);

        aAtalhos.setText("Atalhos do Teclado");
        JMAjuda.add(aAtalhos);

        JMenuBarra.add(JMAjuda);

        setJMenuBar(JMenuBarra);

        getAccessibleContext().setAccessibleDescription("");

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1016)/2, (screenSize.height-638)/2, 1016, 638);
    }// </editor-fold>//GEN-END:initComponents

    private void rdPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdPFActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        ClienteController controller = new ClienteController();

        if (verificaPanel(JPanelCadastro)) {
            Cliente cliente = new Cliente();
            EnderecoCliente endereco = new EnderecoCliente();
            cliente.setNome(this.eNome.getText());
            cliente.setCelular(this.eCel.getText());
            cliente.setEmail(this.eEmail.getText());
            cliente.setTelefone(this.eTel.getText());
            cliente.setData_alt(new Date());
            
            if(this.rdPF.isSelected()){
                cliente.setTipo((String) this.cbUF.getSelectedItem());
            } else {
                cliente.setTipo((String) this.cbUF.getSelectedItem());
            }
            
            cliente.setDocumento(this.eCNPJ.getText());
            
            endereco.setCep(this.eCEP.getText());
            endereco.setEndereco1(this.eEndereco.getText());
            endereco.setEndereco2(this.eEndereco2.getText());
            endereco.setCidade(this.eCidade.getText());
            
            endereco.setUf((String) this.cbUF.getSelectedItem());
            
            cliente.setEnd_cliente(endereco);
            
            controller.adiciona(cliente);
            cliente.setId_cliente(controller.buscaPorCPF(cliente.getDocumento()).getId_cliente());
            
            this.eCodigo.setText(String.valueOf(cliente.getId_cliente()));
            this.eDateAlt.setText(String.valueOf(cliente.getData_alt()));
        }

    }//GEN-LAST:event_btnInserirActionPerformed

    private void eCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eCelActionPerformed

    private void eNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eNomeActionPerformed

    private void eCNPJKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eCNPJKeyPressed
        verificaJTextField(eCNPJ);
    }//GEN-LAST:event_eCNPJKeyPressed

    private void eNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eNomeKeyPressed
        verificaJTextField(eNome);
    }//GEN-LAST:event_eNomeKeyPressed

    private void eEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eEnderecoKeyPressed
        verificaJTextField(eEndereco);
    }//GEN-LAST:event_eEnderecoKeyPressed

    private void eCNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eCNPJFocusLost
        verificaJTextField(eCNPJ);
    }//GEN-LAST:event_eCNPJFocusLost

    private void eNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eNomeFocusLost
        verificaJTextField(eNome);
    }//GEN-LAST:event_eNomeFocusLost

    private void eEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eEnderecoFocusLost
        verificaJTextField(eEndereco);
    }//GEN-LAST:event_eEnderecoFocusLost

    private void eCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eCEPFocusLost
        verificaJTextField(eCEP);
    }//GEN-LAST:event_eCEPFocusLost

    private void eCEPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eCEPKeyPressed
         verificaJTextField(eCEP);
    }//GEN-LAST:event_eCEPKeyPressed

    private void eCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eCidadeFocusLost
        verificaJTextField(eCidade);
    }//GEN-LAST:event_eCidadeFocusLost

    private void eCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eCidadeKeyPressed
        verificaJTextField(eCidade);
    }//GEN-LAST:event_eCidadeKeyPressed

    private void eTelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eTelFocusLost
        verificaJTextField(eTel);
    }//GEN-LAST:event_eTelFocusLost

    private void eTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eTelKeyPressed
        verificaJTextField(eTel);
    }//GEN-LAST:event_eTelKeyPressed

    private void eCelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eCelFocusLost
        verificaJTextField(eCel);
    }//GEN-LAST:event_eCelFocusLost

    private void eCelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eCelKeyPressed
        verificaJTextField(eCel);
    }//GEN-LAST:event_eCelKeyPressed

    private void eEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eEmailFocusLost
        verificaJTextField(eEmail);
    }//GEN-LAST:event_eEmailFocusLost

    private void eEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eEmailKeyPressed
        verificaJTextField(eEmail);
    }//GEN-LAST:event_eEmailKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMAjuda;
    private javax.swing.JMenuBar JMenuBarra;
    private javax.swing.JPanel JPanelCadastro;
    private javax.swing.JMenuItem aAtalhos;
    private javax.swing.JMenuItem aServicosSup;
    private javax.swing.JMenuItem aSobre;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbUF;
    private javax.swing.JFormattedTextField eCEP;
    private javax.swing.JFormattedTextField eCNPJ;
    private javax.swing.JFormattedTextField eCel;
    private javax.swing.JTextField eCidade;
    private javax.swing.JTextField eCodigo;
    private javax.swing.JFormattedTextField eDateAlt;
    private javax.swing.JTextField eEmail;
    private javax.swing.JTextField eEndereco;
    private javax.swing.JTextField eEndereco2;
    private javax.swing.JTextField eNome;
    private javax.swing.JFormattedTextField eTel;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataAlteracao;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JRadioButton rdPF;
    private javax.swing.JRadioButton rdPJ;
    // End of variables declaration//GEN-END:variables

    private boolean verificaPanel(JPanel jp) {
        boolean rt = true;
        for (Component c : jp.getComponents()) {
            if (c instanceof JTextField) {
                JTextField jtf = (JTextField) c;
                if(!verificaJTextField(jtf)){
                    rt = false;
                }
            }
            if (c instanceof JFormattedTextField) {
                JFormattedTextField jftf = (JFormattedTextField) c;
                if(!verificaJTextField(jftf)){
                    rt = false;
                }
            }
        }
        return rt;
    }

    private boolean verificaJTextField(JTextField jt) {
        if(jt.equals(this.eEndereco2)) {
            return true;
        }
        
        if(jt.equals(this.eCodigo)) {
            return true;
        }
        
        if(jt.equals(this.eDateAlt)) {
            return true;
        }
        
        if (jt.getText() == null) {
            jt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            return false;
        }
        String txt = jt.getText();
        txt = txt.trim();
        txt = txt.replace("/", "");
        txt = txt.replace(".", "");
        txt = txt.replace("-", "");
        txt = txt.trim();
        if (txt.equals("")) {
            jt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            return false;
        }
        jt.setBorder(border);
        return true;
    }
}
