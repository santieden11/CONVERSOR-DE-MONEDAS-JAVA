/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conversor.de.monedas;

import RSMaterialComponent.RSTextFieldMaterialIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import static conversor.de.monedas.Convertidor.getCbmonedaentrada;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import rojerusan.RSComboBox;

/**
 *
 * @author santiago
 */
public class Convertidor extends javax.swing.JFrame {

    /**
     * Creates new form Convertidor
     */
    public Convertidor() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public boolean esDecimal(String cad) {
        try {
            Double.valueOf(cad);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private void cbprimero() {

        conversorsuperior cs = new conversorsuperior();

        if (esDecimal(txtmonedaentrada.getText())) {

            if (txtmonedaentrada.getText().equals("") || txtmonedasalida.getText().equals("")) {
                txtmonedaentrada.setText("0");
                txtmonedasalida.setText("0");
            } else {

                if (getCbmonedaentrada() == 1) {

                    this.txtmonedasalida.setText(cs.conversorPENaTODOS(this.getTxtmonedaentrada(), this.getCbmonedasalida()));

                }
                if (getCbmonedaentrada() == 2) {
                    // cs.conversorUSDaTODOS();

                    this.txtmonedasalida.setText(cs.conversorUSDaTODOS(this.getTxtmonedaentrada(), this.getCbmonedasalida()));
                }
                if (getCbmonedaentrada() == 3) {
                    // cs.conversorEURaTODOS();
                    this.txtmonedasalida.setText(cs.conversorEURaTODOS(this.getTxtmonedaentrada(), this.getCbmonedasalida()));
                }
                if (getCbmonedaentrada() == 4) {
                    // cs.conversorGBPaTODOS();
                    this.txtmonedasalida.setText(cs.conversorGBPaTODOS(this.getTxtmonedaentrada(), this.getCbmonedasalida()));
                }
                if (getCbmonedaentrada() == 5) {
                    //cs.conversorJPYaTODOS();
                    this.txtmonedasalida.setText(cs.conversorJPYaTODOS(this.getTxtmonedaentrada(), this.getCbmonedasalida()));
                }
                if (getCbmonedaentrada() == 6) {
                    //cs.conversorKRWaTODOS();
                    this.txtmonedasalida.setText(cs.conversorKRWaTODOS(this.getTxtmonedaentrada(), this.getCbmonedasalida()));
                }

            }

        } else {

            JOptionPane.showMessageDialog(rootPane, "!el valor ingresado no es valido");

        }

    }

    private void cbsegundo() {

        conversorsuperior cs = new conversorsuperior();

        if (esDecimal(txtmonedasalida.getText())) {

            if (txtmonedaentrada.getText().equals("") || txtmonedasalida.getText().equals("")) {
                txtmonedaentrada.setText("0");
                txtmonedasalida.setText("0");
            } else {

                if (getCbmonedasalida() == 1) {

                    this.txtmonedaentrada.setText(cs.conversorPENaTODOS(this.getTxtmonedasalida(), this.getCbmonedaentrada()));

                }
                if (getCbmonedasalida() == 2) {
                    // cs.conversorUSDaTODOS();

                    this.txtmonedaentrada.setText(cs.conversorUSDaTODOS(this.getTxtmonedasalida(), this.getCbmonedaentrada()));
                }
                if (getCbmonedasalida() == 3) {
                    // cs.conversorEURaTODOS();
                    this.txtmonedaentrada.setText(cs.conversorEURaTODOS(this.getTxtmonedasalida(), this.getCbmonedaentrada()));
                }
                if (getCbmonedasalida() == 4) {
                    // cs.conversorGBPaTODOS();
                    this.txtmonedaentrada.setText(cs.conversorGBPaTODOS(this.getTxtmonedasalida(), this.getCbmonedaentrada()));
                }
                if (getCbmonedasalida() == 5) {
                    //cs.conversorJPYaTODOS();
                    this.txtmonedaentrada.setText(cs.conversorJPYaTODOS(this.getTxtmonedasalida(), this.getCbmonedaentrada()));
                }
                if (getCbmonedasalida() == 6) {
                    //cs.conversorKRWaTODOS();
                    this.txtmonedaentrada.setText(cs.conversorKRWaTODOS(this.getTxtmonedasalida(), this.getCbmonedaentrada()));
                }

            }

        } else {

            JOptionPane.showMessageDialog(rootPane, "!el valor ingresado no es valido");

        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonIconUno1 = new RSMaterialComponent.RSButtonIconUno();
        cbmonedaentrada = new rojerusan.RSComboBox();
        txtmonedaentrada = new RSMaterialComponent.RSTextFieldMaterialIcon();
        cbmonedasalida = new rojerusan.RSComboBox();
        txtmonedasalida = new RSMaterialComponent.RSTextFieldMaterialIcon();
        rSTextMaterial1 = new rojeru_san.rsfield.RSTextMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONVERTIDOR DE MONEDAS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 30));

        rSButtonIconUno1.setBackground(new java.awt.Color(255, 204, 51));
        rSButtonIconUno1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        rSButtonIconUno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconUno1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconUno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        cbmonedaentrada.setBackground(new java.awt.Color(255, 204, 51));
        cbmonedaentrada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ELIJA MONEDA", "Sol Peruano PEN", "Dolar USD", "Euro EUR", "Libra Esterlina GBP", "Yen Japones  JPY", "Won Sul-Coreano KRW" }));
        cbmonedaentrada.setColorArrow(new java.awt.Color(255, 204, 51));
        cbmonedaentrada.setColorBorde(new java.awt.Color(255, 255, 0));
        cbmonedaentrada.setColorFondo(new java.awt.Color(255, 204, 51));
        cbmonedaentrada.setColorSeleccion(new java.awt.Color(255, 204, 51));
        cbmonedaentrada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmonedaentradaItemStateChanged(evt);
            }
        });
        cbmonedaentrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbmonedaentradaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbmonedaentradaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbmonedaentradaMouseReleased(evt);
            }
        });
        jPanel1.add(cbmonedaentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 40));

        txtmonedaentrada.setForeground(new java.awt.Color(255, 204, 51));
        txtmonedaentrada.setText("0");
        txtmonedaentrada.setColorIcon(new java.awt.Color(255, 204, 51));
        txtmonedaentrada.setColorMaterial(new java.awt.Color(255, 204, 51));
        txtmonedaentrada.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MONETIZATION_ON);
        txtmonedaentrada.setPhColor(new java.awt.Color(0, 0, 0));
        txtmonedaentrada.setPlaceholder("Escribir aqui");
        txtmonedaentrada.setSelectionColor(new java.awt.Color(255, 204, 51));
        txtmonedaentrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtmonedaentradaMouseReleased(evt);
            }
        });
        txtmonedaentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmonedaentradaActionPerformed(evt);
            }
        });
        txtmonedaentrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmonedaentradaKeyReleased(evt);
            }
        });
        jPanel1.add(txtmonedaentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 150, -1));

        cbmonedasalida.setBackground(new java.awt.Color(255, 204, 51));
        cbmonedasalida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ELIJA MONEDA", "Sol Peruano PEN", "Dolar USD", "Euro EUR", "Libra Esterlina GBP", "Yen Japones  JPY", "Won Sul-Coreano KRW" }));
        cbmonedasalida.setColorArrow(new java.awt.Color(255, 204, 51));
        cbmonedasalida.setColorBorde(new java.awt.Color(255, 255, 0));
        cbmonedasalida.setColorFondo(new java.awt.Color(255, 204, 51));
        cbmonedasalida.setColorSeleccion(new java.awt.Color(255, 204, 51));
        cbmonedasalida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmonedasalidaItemStateChanged(evt);
            }
        });
        cbmonedasalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbmonedasalidaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbmonedasalidaMouseReleased(evt);
            }
        });
        jPanel1.add(cbmonedasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 40));

        txtmonedasalida.setForeground(new java.awt.Color(255, 204, 51));
        txtmonedasalida.setText("0");
        txtmonedasalida.setToolTipText("");
        txtmonedasalida.setColorIcon(new java.awt.Color(255, 204, 51));
        txtmonedasalida.setColorMaterial(new java.awt.Color(255, 204, 51));
        txtmonedasalida.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MONETIZATION_ON);
        txtmonedasalida.setPhColor(new java.awt.Color(0, 0, 0));
        txtmonedasalida.setPlaceholder("Escribir aqui");
        txtmonedasalida.setSelectionColor(new java.awt.Color(255, 204, 51));
        txtmonedasalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtmonedasalidaMouseReleased(evt);
            }
        });
        txtmonedasalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmonedasalidaKeyReleased(evt);
            }
        });
        jPanel1.add(txtmonedasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 150, -1));

        rSTextMaterial1.setText("rSTextMaterial1");
        rSTextMaterial1.setColorMaterial(new java.awt.Color(255, 204, 51));
        rSTextMaterial1.setSelectionColor(new java.awt.Color(255, 204, 51));
        jPanel1.add(rSTextMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmonedaentradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmonedaentradaKeyReleased

        // this.cbmonedaentrada.addActionListener((ActionEvent e) -> {
        cbprimero();


    }//GEN-LAST:event_txtmonedaentradaKeyReleased

    private void txtmonedaentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmonedaentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmonedaentradaActionPerformed

    private void txtmonedasalidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmonedasalidaKeyReleased

        cbsegundo();


    }//GEN-LAST:event_txtmonedasalidaKeyReleased

    private void cbmonedaentradaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbmonedaentradaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmonedaentradaMousePressed

    private void cbmonedasalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbmonedasalidaMouseClicked
        // TODO add your handling code here:

        // this.cbmonedasalida.addActionListener((ActionEvent e) -> 
        //  if(txtmonedasalida.requestFocus(rootPaneCheckingEnabled)){
        //  cbsegundo();
        // }
        //  });

    }//GEN-LAST:event_cbmonedasalidaMouseClicked

    private void cbmonedaentradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbmonedaentradaMouseClicked


    }//GEN-LAST:event_cbmonedaentradaMouseClicked

    private void rSButtonIconUno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconUno1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSButtonIconUno1ActionPerformed

    private void txtmonedaentradaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmonedaentradaMouseReleased
        // TODO add your handling code here:
        if (this.txtmonedasalida.getForeground() == Color.red) {
            this.txtmonedasalida.setForeground(Color.ORANGE);
        }
        this.txtmonedaentrada.setForeground(Color.red);
        this.txtmonedaentrada.setText("1");
        cbprimero();
    }//GEN-LAST:event_txtmonedaentradaMouseReleased

    private void txtmonedasalidaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmonedasalidaMouseReleased
        // TODO add your handling code here:
        if (this.txtmonedaentrada.getForeground() == Color.red) {
            this.txtmonedaentrada.setForeground(Color.ORANGE);
        }

        this.txtmonedasalida.setForeground(Color.red);
        this.txtmonedasalida.setText("1");
        cbsegundo();
    }//GEN-LAST:event_txtmonedasalidaMouseReleased

    private void cbmonedaentradaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbmonedaentradaMouseReleased
        // TODO add your handling code here:
        //  cbprimero(); 

    }//GEN-LAST:event_cbmonedaentradaMouseReleased

    private void cbmonedasalidaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbmonedasalidaMouseReleased
        // TODO add your handling code here:
        // if(  this.txtmonedaentrada.getForeground()==Color.red){
        //     this.txtmonedaentrada.setForeground(Color.ORANGE);
        //     }
        // cbsegundo();
    }//GEN-LAST:event_cbmonedasalidaMouseReleased


    private void cbmonedaentradaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmonedaentradaItemStateChanged
        // TODO add your handling code here:

        if (evt.getSource() == this.cbmonedaentrada) {

            if (this.txtmonedaentrada.getForeground() == Color.red) {
                cbprimero();
            }
             if (this.txtmonedasalida.getForeground() == Color.red) {
                cbsegundo();
            }
            

            //   cbprimero(); 
        }


    }//GEN-LAST:event_cbmonedaentradaItemStateChanged

    private void cbmonedasalidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmonedasalidaItemStateChanged
        // TODO add your handling code here:
        
          if (evt.getSource() == this.cbmonedasalida) {

            if (this.txtmonedaentrada.getForeground() == Color.red) {
                cbprimero();
            }
             if (this.txtmonedasalida.getForeground() == Color.red) {
                cbsegundo();
            }
            

            //   cbprimero(); 
        }
        
    }//GEN-LAST:event_cbmonedasalidaItemStateChanged

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
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Convertidor().setVisible(true);
        });
    }

    public String getTxtmonedaentrada() {
        return txtmonedaentrada.getText();
    }

    public void setTxtmonedaentrada(String txtmonedaentrada) {
        this.txtmonedaentrada.setText(txtmonedaentrada);
    }

    public String getTxtmonedasalida() {
        return txtmonedasalida.getText();
    }

    public void setTxtmonedasalida(String txtmonedasalida) {
        this.txtmonedasalida.setText(txtmonedasalida);
    }

    public int getCbmonedaentrada() {
        return cbmonedaentrada.getSelectedIndex();
    }

    public int getCbmonedasalida() {
        return cbmonedasalida.getSelectedIndex();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSComboBox cbmonedaentrada;
    private rojerusan.RSComboBox cbmonedasalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconUno rSButtonIconUno1;
    private rojeru_san.rsfield.RSTextMaterial rSTextMaterial1;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtmonedaentrada;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtmonedasalida;
    // End of variables declaration//GEN-END:variables

}
