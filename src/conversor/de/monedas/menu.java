/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conversor.de.monedas;

import javax.swing.JOptionPane;

/**
 *
 * @author santiago
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
          this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar1 = new rojeru_san.rsdate.RSCalendar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonIconUno1 = new RSMaterialComponent.RSButtonIconUno();
        rSButtonIconUno2 = new RSMaterialComponent.RSButtonIconUno();
        rSButtonIconUno3 = new RSMaterialComponent.RSButtonIconUno();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONVERTIDOR ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 180, 30));

        rSButtonIconUno1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        rSButtonIconUno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconUno1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconUno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 60, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        rSButtonIconUno2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STRIKETHROUGH_S);
        rSButtonIconUno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconUno2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconUno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 120, 120));

        rSButtonIconUno3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MONETIZATION_ON);
        rSButtonIconUno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconUno3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconUno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 323));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconUno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconUno1ActionPerformed
        // TODO add your handling code here:

        int resp = JOptionPane.showConfirmDialog(null, "DESEAS CERRAR EL CONVERSOR DE MONEDAS",
            "AVISO", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE);
        switch (resp) {
            case 0 -> System.exit(0);
            case 1 -> {
            }

        }

    }//GEN-LAST:event_rSButtonIconUno1ActionPerformed

    private void rSButtonIconUno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconUno3ActionPerformed
        // TODO add your handling code here:
        Conversordemonedas c= new Conversordemonedas();
        c.setVisible(true);
        
    }//GEN-LAST:event_rSButtonIconUno3ActionPerformed

    private void rSButtonIconUno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconUno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonIconUno2ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno1;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno2;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno3;
    private rojeru_san.rsdate.RSCalendar rSCalendar1;
    // End of variables declaration//GEN-END:variables
}
