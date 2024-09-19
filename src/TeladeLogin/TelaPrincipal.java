/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TeladeLogin;

/**
 *
 * @author renan.losantos
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JLabel();
        emailJava = new javax.swing.JTextField();
        senhaJava = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JLabel();
        entrarJava = new javax.swing.JButton();
        voltarJava = new javax.swing.JButton();
        bemvindoJava = new javax.swing.JLabel();
        cadastroJava = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 350));
        jPanel1.setLayout(null);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEmail.setText("E-mail:");
        jPanel1.add(txtEmail);
        txtEmail.setBounds(150, 110, 48, 22);

        emailJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJavaActionPerformed(evt);
            }
        });
        jPanel1.add(emailJava);
        emailJava.setBounds(150, 150, 258, 18);

        jPanel1.add(senhaJava);
        senhaJava.setBounds(150, 200, 258, 18);

        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSenha.setText("Senha:");
        jPanel1.add(txtSenha);
        txtSenha.setBounds(150, 180, 37, 16);

        entrarJava.setBackground(new java.awt.Color(0, 204, 204));
        entrarJava.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        entrarJava.setText("Entrar");
        entrarJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarJavaActionPerformed(evt);
            }
        });
        jPanel1.add(entrarJava);
        entrarJava.setBounds(220, 280, 120, 34);

        voltarJava.setBackground(new java.awt.Color(255, 102, 102));
        voltarJava.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        voltarJava.setText("Voltar");
        jPanel1.add(voltarJava);
        voltarJava.setBounds(230, 330, 93, 34);

        bemvindoJava.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bemvindoJava.setText("Bem vindo usuario faça login com sua conta ou cadastra-se!");
        jPanel1.add(bemvindoJava);
        bemvindoJava.setBounds(100, 380, 340, 16);

        cadastroJava.setBackground(new java.awt.Color(255, 255, 51));
        cadastroJava.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cadastroJava.setText("Cadastrar");
        jPanel1.add(cadastroJava);
        cadastroJava.setBounds(220, 240, 120, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-logo-java-coffee-cup-144.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 0, 120, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJavaActionPerformed

    private void entrarJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarJavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarJavaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemvindoJava;
    private javax.swing.JButton cadastroJava;
    private javax.swing.JTextField emailJava;
    private javax.swing.JButton entrarJava;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField senhaJava;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JButton voltarJava;
    // End of variables declaration//GEN-END:variables
}
