package janelas;

import static classe.Gerenciador.limparDados;
import conexoes.MySQL;
import javax.swing.JOptionPane;
import static classe.Gerenciador.usuarioLogado;

public class MenuAgiota extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    
    public MenuAgiota() {
        initComponents();
        this.lblOla.setText("Olá, Sr(a) " + usuarioLogado.getNome());
        buscarDividaTotal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblOla = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotalDividas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalDevedores = new javax.swing.JLabel();
        btnAtualConsulta = new javax.swing.JButton();
        btnAtualDados = new javax.swing.JButton();
        btnAtualNovo = new javax.swing.JButton();
        btnAtualDados1 = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblOla.setForeground(new java.awt.Color(220, 174, 50));
        lblOla.setText("Olá, Agiota");
        jPanel2.add(lblOla, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, 30));

        jPanel3.setBackground(new java.awt.Color(220, 174, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Total de clientes devendo:");

        lblTotalDividas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTotalDividas.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Total de dívidas:");

        lblTotalDevedores.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalDevedores, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalDividas, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTotalDividas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTotalDevedores, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        btnAtualConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/consulat2.png"))); // NOI18N
        btnAtualConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtualConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 230, 80));

        btnAtualDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dados2.png"))); // NOI18N
        btnAtualDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualDadosActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtualDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 130, 40));

        btnAtualNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cadastrardivida.png"))); // NOI18N
        btnAtualNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtualNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 250, 80));

        btnAtualDados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logoff2.png"))); // NOI18N
        btnAtualDados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualDados1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtualDados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 120, 40));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/menuagiota.png"))); // NOI18N
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoMouseEntered(evt);
            }
        });
        jPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 1080, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void buscarDividaTotal(){
        this.conectar.conectaBanco();
        try{
            String query = "SELECT "
                    + "SUM(valorAtual),"
                    + "COUNT(1) "
                    + "FROM divida "
                    + "WHERE agiotaId = " + usuarioLogado.getId();
            
            this.conectar.executarSQL (query);
            
            while (this.conectar.getResultSet().next()) {
                this.lblTotalDividas.setText("R$ " + this.conectar.getResultSet().getDouble(1));
                this.lblTotalDevedores.setText("" + this.conectar.getResultSet().getInt(2));
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar dívidas! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar dívidas!");
            
        } finally {
            this.conectar.fechaBanco();
        }
    }
    
    private void btnAtualConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualConsultaActionPerformed
        new ConsultaAgiota().setVisible(true);
        MenuAgiota.this.dispose();
    }//GEN-LAST:event_btnAtualConsultaActionPerformed

    private void btnAtualDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualDadosActionPerformed
        new InformacoesPessoais().setVisible(true);
        MenuAgiota.this.dispose();
    }//GEN-LAST:event_btnAtualDadosActionPerformed

    private void btnAtualNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualNovoActionPerformed
        new Emprestimo().setVisible(true);
        MenuAgiota.this.dispose();
    }//GEN-LAST:event_btnAtualNovoActionPerformed

    private void btnAtualDados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualDados1ActionPerformed
        new Login().setVisible(true);
        limparDados();
        MenuAgiota.this.dispose();
    }//GEN-LAST:event_btnAtualDados1ActionPerformed

    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogoMouseClicked

    private void lblLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogoMouseEntered

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
            java.util.logging.Logger.getLogger(MenuAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAgiota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAgiota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualConsulta;
    private javax.swing.JButton btnAtualDados;
    private javax.swing.JButton btnAtualDados1;
    private javax.swing.JButton btnAtualNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblOla;
    private javax.swing.JLabel lblTotalDevedores;
    private javax.swing.JLabel lblTotalDividas;
    // End of variables declaration//GEN-END:variables
}
