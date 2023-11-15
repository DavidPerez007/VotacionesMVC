/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.meta.mvc.view;

/**
 *
 * @author david
 */
public class VotacionesVista extends javax.swing.JFrame {

    /**
     * Creates new form VotacionesVista
     */
    public VotacionesVista() {
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

        producto1Label = new javax.swing.JLabel();
        producto2Label = new javax.swing.JLabel();
        producto3Label = new javax.swing.JLabel();
        producto1ContadorLabel = new javax.swing.JLabel();
        producto2ContadorLabel = new javax.swing.JLabel();
        producto3ContadorLabel = new javax.swing.JLabel();
        votarBtnProducto1 = new javax.swing.JButton();
        votarBtnProducto2 = new javax.swing.JButton();
        votarBtnProducto3 = new javax.swing.JButton();
        verGraficasBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        producto1Label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        producto1Label.setText("Producto1");

        producto2Label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        producto2Label.setText("Producto2");

        producto3Label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        producto3Label.setText("Producto3");

        producto1ContadorLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        producto1ContadorLabel.setText("0");

        producto2ContadorLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        producto2ContadorLabel.setText("0");

        producto3ContadorLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        producto3ContadorLabel.setText("0");

        votarBtnProducto1.setText("Votar");
        votarBtnProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votarBtnProducto1ActionPerformed(evt);
            }
        });

        votarBtnProducto2.setText("Votar");
        votarBtnProducto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votarBtnProducto2ActionPerformed(evt);
            }
        });

        votarBtnProducto3.setText("Votar");

        verGraficasBtn.setText("Ver graficas");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido al super sistema de votaciones del futuro!");

        jLabel2.setText("(Ya todos saben que va a ganar la horchata)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(verGraficasBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(votarBtnProducto1)
                        .addGap(59, 59, 59)
                        .addComponent(votarBtnProducto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(votarBtnProducto3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(producto1ContadorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(producto1Label))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(producto2Label)
                            .addComponent(producto2ContadorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(producto3Label)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(producto3ContadorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(votarBtnProducto1)
                            .addComponent(votarBtnProducto2)
                            .addComponent(votarBtnProducto3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(verGraficasBtn)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(producto2Label)
                            .addComponent(producto3Label)
                            .addComponent(producto1Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(producto1ContadorLabel)
                            .addComponent(producto2ContadorLabel)
                            .addComponent(producto3ContadorLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void votarBtnProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votarBtnProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_votarBtnProducto1ActionPerformed

    private void votarBtnProducto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votarBtnProducto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_votarBtnProducto2ActionPerformed

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
            java.util.logging.Logger.getLogger(VotacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VotacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VotacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VotacionesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VotacionesVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel producto1ContadorLabel;
    public javax.swing.JLabel producto1Label;
    public javax.swing.JLabel producto2ContadorLabel;
    public javax.swing.JLabel producto2Label;
    public javax.swing.JLabel producto3ContadorLabel;
    public javax.swing.JLabel producto3Label;
    public javax.swing.JButton verGraficasBtn;
    public javax.swing.JButton votarBtnProducto1;
    public javax.swing.JButton votarBtnProducto2;
    public javax.swing.JButton votarBtnProducto3;
    // End of variables declaration//GEN-END:variables
}
