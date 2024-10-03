/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TeladeCadastro;

import TeladeLogin.TelaLogin;
import classes.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author Caique.sbrito1
 */
public class cadastroJava extends javax.swing.JFrame {

    private Boolean usuarioCadastrado;
    
    /**
     * Creates new form cadastroJava
     */
    public cadastroJava() {
        initComponents();
        jButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Usuario usuario = new Usuario();
                System.out.println(Email.getText());
                
                usuario.setEmail(Email.getText());
                
                String validasenha = null;
                String Psenha = Senha.getText();
                String Csenha = ConfirmarSenha.getText();
                
                usuario.setSenha(validasenha);
                usuario.setCpf(CPF.getText());
                usuario.setData_nasc(DataDeNascimento.getText());
                String tipo = "";
               if (jRadioButton1.isSelected() || jRadioButton2.isSelected()) {
                    if (jRadioButton1.isSelected()) {
                        tipo = "T";
                    }
                    if (jRadioButton2.isSelected()) {
                        tipo = "F";
                    }
                }
                usuario.setTipo(tipo);
                usuario.setEstatus("A");
        
                if("".equals(usuario.getEmail())){
                    JOptionPane.showMessageDialog(null, "Campo e-mail precisa ser informado!!!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    Email.grabFocus();
                }
                else if("".equals(Senha.getText())){
                    JOptionPane.showMessageDialog(null, "Campo senha precisa ser informado!!!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    Senha.grabFocus();
                }
                else if("".equals(usuario.getSenha())){
                    JOptionPane.showMessageDialog(null, "Campo confirmar senha precisa ser informado!!!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    ConfirmarSenha.grabFocus();
                }
                else if("".equals(usuario.getCpf())){
                    JOptionPane.showMessageDialog(null, "Campo cpf precisa ser informado!!!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    CPF.grabFocus();
                }
                else if("".equals(usuario.getData_nasc())){
                    JOptionPane.showMessageDialog(null, "Campo data de nascimento precisa ser informado!!!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    DataDeNascimento.grabFocus();
                }
                else if("".equals(usuario.getTipo())){
                    JOptionPane.showMessageDialog(null, "Campo tipo precisa ser informado!!!", "Atenção", JOptionPane.ERROR_MESSAGE);
                   
                }
                else{
                    if(usuario.getEmail() == null || Psenha == null || usuario.getCpf() == null || 
                            usuario.getData_nasc() == null || usuario.getEstatus() == null) {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar!!!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    }
                     else {
                    usuarioCadastrado = usuario.CadastrarUsuario(usuario.getEmail(), Psenha, usuario.getCpf(), usuario.getData_nasc(),usuario.getEstatus() ,usuario.getTipo());
                    if(usuarioCadastrado == true){
                        TelaLogin telaLogin = new TelaLogin();
                        telaLogin.abrirTela();
                        dispose();
                        JOptionPane.showMessageDialog(null, "Usuario cadastrado!!!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    }
                     else{
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar!!!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    }
                    }
                }
                }
            });
        jButton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               TelaLogin telaLogin = new TelaLogin();
               telaLogin.abrirTela();
                dispose();
            }
            });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
<<<<<<< HEAD
        NomeComplet = new javax.swing.JFormattedTextField();
=======
        CPF = new javax.swing.JFormattedTextField();
>>>>>>> e35393e59456b878c123ad2d3103f45f8e00b455
        Email = new javax.swing.JFormattedTextField();
        DataDeNascimento = new javax.swing.JFormattedTextField();
        Senha = new javax.swing.JFormattedTextField();
        ConfirmarSenha = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 300));
        jPanel1.setLayout(null);
<<<<<<< HEAD
        jPanel1.add(NomeComplet);
        NomeComplet.setBounds(40, 53, 126, 22);
=======
        jPanel1.add(CPF);
        CPF.setBounds(270, 60, 140, 22);
>>>>>>> e35393e59456b878c123ad2d3103f45f8e00b455

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Email);
<<<<<<< HEAD
        Email.setBounds(40, 101, 126, 22);

        try {
            DataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##  ##  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataDeNascimentoActionPerformed(evt);
            }
        });
=======
        Email.setBounds(40, 60, 140, 22);
>>>>>>> e35393e59456b878c123ad2d3103f45f8e00b455
        jPanel1.add(DataDeNascimento);
        DataDeNascimento.setBounds(270, 130, 140, 22);
        jPanel1.add(Senha);
        Senha.setBounds(40, 130, 140, 22);
        jPanel1.add(ConfirmarSenha);
        ConfirmarSenha.setBounds(40, 190, 140, 20);

        jLabel1.setText("Você é um técnico?");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 170, 121, 16);

        jRadioButton1.setText("Sim");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(270, 200, 60, 21);

        jRadioButton2.setText("Não");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(330, 200, 100, 21);

        jButton1.setBackground(new java.awt.Color(255, 175, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(102, 283, 80, 30);

        jButton2.setBackground(new java.awt.Color(83, 137, 175));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cadastrar");
        jPanel1.add(jButton2);
        jButton2.setBounds(260, 280, 89, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo java  48x48.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(387, 292, 43, 40);

        jLabel4.setText("E-mail");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 40, 150, 16);

        jLabel5.setText("CPF");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 40, 170, 16);

        jLabel6.setText("Data de nascimento");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(270, 110, 130, 16);

        jLabel7.setText("Senha");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 110, 160, 16);

        jLabel8.setText("Confirmar senha");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 170, 110, 16);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###  ###  ###  ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(280, 50, 160, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void DataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataDeNascimentoActionPerformed
    public void abrirTela(){
       new cadastroJava().setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(cadastroJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ConfirmarSenha;
    private javax.swing.JFormattedTextField DataDeNascimento;
    private javax.swing.JFormattedTextField Email;
    private javax.swing.JFormattedTextField Senha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
