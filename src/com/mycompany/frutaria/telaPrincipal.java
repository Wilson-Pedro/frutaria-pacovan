/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.frutaria;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author victor
 */
public class telaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form telaPrincipal
     */
    public telaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuFutas = new javax.swing.JMenu();
        ItemComprar = new javax.swing.JMenuItem();
        Cadastraritem = new javax.swing.JMenu();
        ClienteCadas = new javax.swing.JMenuItem();
        LoginFuncionario = new javax.swing.JMenuItem();
        MenuOutro = new javax.swing.JMenu();
        SairTela = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frutaria pacovan");
        setMinimumSize(new java.awt.Dimension(800, 385));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\victo\\OneDrive\\Documentos\\NetBeansProjects\\Frutaria\\src\\main\\java\\imagens\\logo1.png")); // NOI18N

        MenuFutas.setText("Comprar");
        MenuFutas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuFutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFutasActionPerformed(evt);
            }
        });

        ItemComprar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ItemComprar.setText("Frutas");
        ItemComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemComprarActionPerformed(evt);
            }
        });
        MenuFutas.add(ItemComprar);

        jMenuBar1.add(MenuFutas);

        Cadastraritem.setText("Cadastrar");
        Cadastraritem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        ClienteCadas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClienteCadas.setText("Cliente");
        ClienteCadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteCadasActionPerformed(evt);
            }
        });
        Cadastraritem.add(ClienteCadas);

        LoginFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginFuncionario.setText("Login");
        LoginFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginFuncionarioActionPerformed(evt);
            }
        });
        Cadastraritem.add(LoginFuncionario);

        jMenuBar1.add(Cadastraritem);

        MenuOutro.setText("Outros");
        MenuOutro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        SairTela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SairTela.setText("Sair");
        SairTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairTelaActionPerformed(evt);
            }
        });
        MenuOutro.add(SairTela);

        jMenuBar1.add(MenuOutro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginFuncionarioActionPerformed
      CadastrarFuncionario Cadfunc = new CadastrarFuncionario();
      this.dispose();
      Cadfunc.setVisible(true);
    }//GEN-LAST:event_LoginFuncionarioActionPerformed

    private void MenuFutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFutasActionPerformed
      
    }//GEN-LAST:event_MenuFutasActionPerformed

    private void ItemComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemComprarActionPerformed
       ComprarFrutas cf = new ComprarFrutas();
       this.dispose();
       cf.setVisible(true);
    }//GEN-LAST:event_ItemComprarActionPerformed

    private void SairTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairTelaActionPerformed
       this.dispose();
    }//GEN-LAST:event_SairTelaActionPerformed

    private void ClienteCadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteCadasActionPerformed
      TelaCadastroCliente tcc = new TelaCadastroCliente();
      this.dispose();
      tcc.setVisible(true);
    }//GEN-LAST:event_ClienteCadasActionPerformed

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
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastraritem;
    private javax.swing.JMenuItem ClienteCadas;
    private javax.swing.JMenuItem ItemComprar;
    private javax.swing.JMenuItem LoginFuncionario;
    private javax.swing.JMenu MenuFutas;
    private javax.swing.JMenu MenuOutro;
    private javax.swing.JMenuItem SairTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
