package com.mycompany.frutaria;

import model.bean.CompraFruta;

import model.dao.ClienteDAO;
import model.dao.CompraDAO;
import model.dao.FrutaDAO;
import javax.swing.JOptionPane;
import model.bean.Fruta;

/**
 *
 * @author victor
 */
public class ComprarFrutas extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	FrutaDAO frutaDAO = new FrutaDAO();
	ClienteDAO clienteDAO = new ClienteDAO();
	
	ModelFrutas model = new ModelFrutas();

	public ComprarFrutas() {
		initComponents();
		TblComprarFrutas.setModel(model);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		TblComprarFrutas = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		TxtCpf = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		TxtQuantComprar = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		TxtNome = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		BtnFinalizar = new javax.swing.JButton();
		TxtCampoVazio = new javax.swing.JLabel();
		jToolBar1 = new javax.swing.JToolBar();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("COMPRAR FRUTAS");
		setResizable(false);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		TblComprarFrutas.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null },
				{ null, null, null }, { null, null, null }, { null, null, null } },
				new String[] { "Title 1", "Title 2", "Title 3" }));
		jScrollPane1.setViewportView(TblComprarFrutas);

		jLabel2.setForeground(new java.awt.Color(0, 0, 0));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("CPF:");

		TxtCpf.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TxtCpfActionPerformed(evt);
			}
		});

		jLabel3.setForeground(new java.awt.Color(0, 0, 0));
		jLabel3.setText("QUANTIDADE:");

		TxtQuantComprar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TxtQuantComprarActionPerformed(evt);
			}
		});

		jButton1.setBackground(new java.awt.Color(0, 204, 0));
		jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("MANDAR P/ CARRINHO");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel5.setForeground(new java.awt.Color(0, 0, 0));
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setText("NOME:");

		jButton3.setBackground(new java.awt.Color(0, 0, 255));
		jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("COMPRAR FIADO");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 0, 0));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("BOAS COMPRAS!!!");

		BtnFinalizar.setBackground(new java.awt.Color(0, 153, 0));
		BtnFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		BtnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
		BtnFinalizar.setText("FINALIZAR");
		BtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BtnFinalizarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(52, 52, 52).addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 115,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(TxtCpf).addComponent(TxtQuantComprar,
																javax.swing.GroupLayout.PREFERRED_SIZE, 248,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(21, 21, 21)
												.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup().addComponent(jButton3)
														.addGap(54, 54, 54).addComponent(jButton1)))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(74, 74, 74).addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE, 261,
										javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(TxtCampoVazio, javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup().addComponent(BtnFinalizar)
														.addGap(142, 142, 142)))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(59, 59, 59)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(9, 9, 9)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel2).addComponent(TxtCpf,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(22, 22, 22)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel3).addComponent(TxtQuantComprar,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(42, 42, 42)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jButton3).addComponent(jButton1))
								.addGap(18, 18, 18).addComponent(BtnFinalizar))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(3, 3, 3).addComponent(TxtCampoVazio, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(36, Short.MAX_VALUE)));

		jToolBar1.setRollover(true);

		jButton2.setBackground(new java.awt.Color(204, 204, 204));
		jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
		jButton2.setText("VOLTAR ");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jToolBar1.add(jButton2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void TxtCpfActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TxtCpfActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_TxtCpfActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		String nome = TxtNome.getText();
		String cpf = TxtCpf.getText();
		Integer quantidade = Integer.parseInt(TxtQuantComprar.getText());
		Fruta fruta = frutaDAO.buscarFrutaPorNome(nome);
		
		if (!clienteDAO.existeClienteComCpf(cpf)) {
			
			JOptionPane.showMessageDialog(null, "Você precisa se cadastrar antes de fazer a compra!");
			limparCampos();
			TxtCpf.setText("");
			
		} else if(quantidade > fruta.getEstoque()) {
			JOptionPane.showMessageDialog(null, "Você não pode comprar um quantidade superior ao estoque");
		
		} else if(clienteDAO.existeClienteComCpf(cpf)) {
			Double valor = fruta.getValor();
			fruta.atualizarEstoque(quantidade);

			frutaDAO.update(fruta);

			CompraDAO compraDao = new CompraDAO();
			CompraFruta compra = new CompraFruta();

			Double subTotal = valor * quantidade;

			compra.setCpf(cpf);

			if (compraDao.existeCompraNaoFinalizadoComCpf(cpf)) {
				compra = compraDao.buscarCompraNaoFinalizada(cpf);
				compra.atualizarQuantidade(quantidade);
				compra.atualizarValorTotal(subTotal);
				compraDao.update(compra);

			} else {
				compra.setCompraFinalizada(false);
				compra.setQuantidadeComprada(quantidade);
				compra.setValorTotal(subTotal);
				compraDao.create(compra);
			}

			limparCampos();
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void limparCampos() {
		TxtNome.setText("");
		TxtQuantComprar.setText("");
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		telaPrincipal tp = new telaPrincipal();
		this.dispose();
		tp.setVisible(true);
	}// GEN-LAST:event_jButton2ActionPerformed

	private void TxtQuantComprarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TxtQuantComprarActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_TxtQuantComprarActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		TelaFinalMeme tfm = new TelaFinalMeme();
		this.dispose();
		tfm.setVisible(true);
	}// GEN-LAST:event_jButton3ActionPerformed

	private void BtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnFinalizarActionPerformed
		TelaComprasCarrinho tcc = new TelaComprasCarrinho();
		this.dispose();
		tcc.setVisible(true);
	}// GEN-LAST:event_BtnFinalizarActionPerformed

	private void TxtCampoVazioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TxtCampoVazioActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_TxtCampoVazioActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
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
			java.util.logging.Logger.getLogger(ComprarFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ComprarFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ComprarFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ComprarFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ComprarFrutas().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton BtnFinalizar;
	private javax.swing.JTable TblComprarFrutas;
	private javax.swing.JLabel TxtCampoVazio;
	private javax.swing.JTextField TxtCpf;
	private javax.swing.JTextField TxtNome;
	private javax.swing.JTextField TxtQuantComprar;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JToolBar jToolBar1;
	// End of variables declaration//GEN-END:variables
}