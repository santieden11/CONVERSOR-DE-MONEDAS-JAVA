/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor.de.monedas;

import RSMaterialComponent.RSTextFieldMaterialIcon;
import rojerusan.RSComboBox;

/**
 *
 * @author santiago
 */
public class conversorsuperior {

    // Convertidor c = new Convertidor();
    private final RSTextFieldMaterialIcon txtentrada = Convertidor.txtmonedaentrada;
    private final RSTextFieldMaterialIcon txtsalida = Convertidor.txtmonedasalida;

    private double txtconvertido;
    private final RSComboBox cbentrada = Convertidor.cbmonedaentrada;
    private final RSComboBox cbsalida = Convertidor.cbmonedasalida;
    //private double cbsalida;
    private double MONEDA ;
     private double USD;
    private double EUR;
    private double PENaGBP;
    private double PENaJPY;
    private double PENaKRW;

    public void conversorPENaTODOS() {

        txtconvertido = Double.parseDouble(txtentrada.getText());

        if (cbentrada.getSelectedIndex() == 1) {

            //de sol peruano a sol peruano
            if (cbsalida.getSelectedIndex() == 1) {
                MONEDA = Math.round((txtconvertido * 1));
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //sol peruano a dolares
            if (cbentrada.getSelectedIndex() == 2) {
                MONEDA = Math.round((txtconvertido * 0.26404034536477173712143215483326) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //sol peruano a auros
            
            if (cbentrada.getSelectedIndex() == 3) {
                MONEDA = Math.round((txtconvertido * 0.24841017488076311605723370429253) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //sol peruano a libras esterlinas
            if (cbentrada.getSelectedIndex() == 4) {
                MONEDA = Math.round((txtconvertido * 0.21938003202948467630476274049536) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //sol peruano a yean japoneses
            if (cbentrada.getSelectedIndex() == 5) {
                MONEDA = Math.round((txtconvertido * 35.842293906810035842293906810036) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //sol peruano a won coreanos
            if (cbentrada.getSelectedIndex() == 6) {
                MONEDA = Math.round((txtconvertido * 342.50317072310296912573668150733 ) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }

        }

    }
    public void conversorUSDaTODOS() {

        txtconvertido = Double.parseDouble(txtentrada.getText());

        if (cbentrada.getSelectedIndex() == 2) {

            //de dolar a sol peruano
            if (cbsalida.getSelectedIndex() == 1) {
                MONEDA = Math.round((txtconvertido * 3.7873));
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //dolar a dolar
            if (cbentrada.getSelectedIndex() == 2) {
                MONEDA = Math.round((txtconvertido * 1) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
                  //dolar a auro
            if (cbentrada.getSelectedIndex() == 3) {
                MONEDA = Math.round((txtconvertido * 0.94043439040666640083721231171563) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //dolar a libras esterlinas
            if (cbentrada.getSelectedIndex() == 4) {
                MONEDA = Math.round((txtconvertido * 0.83068241806667804701579418015591) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //dolar a yean japones
            if (cbentrada.getSelectedIndex() == 5) {
                MONEDA = Math.round((txtconvertido * 135.92268000000000000000000000005) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            
           // dolar a won sur-coreano
            if (cbentrada.getSelectedIndex() == 6) {
                MONEDA = Math.round((txtconvertido * 1295.7643058631430066777602231949 ) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }

        }

    }
    public void conversorEURaTODOS() {

        txtconvertido = Double.parseDouble(txtentrada.getText());

        if (cbentrada.getSelectedIndex() == 3) {

            //de euro a sol peruano
            if (cbsalida.getSelectedIndex() == 1) {
                MONEDA = Math.round((txtconvertido * 4.0216279936194458904431319280585));
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //euro a dolar
            if (cbentrada.getSelectedIndex() == 2) {
                MONEDA = Math.round((txtconvertido * 1.0624549479260018827976623186265e-8) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
                  //euro a auro
            if (cbentrada.getSelectedIndex() == 3) {
                MONEDA = Math.round((txtconvertido * 1) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //euro a libras esterlinas
            if (cbentrada.getSelectedIndex() == 4) {
                MONEDA = Math.round((txtconvertido * 0.88300860103357922768182515758613) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //euro a yean japones
            if (cbentrada.getSelectedIndex() == 5) {
                MONEDA = Math.round((txtconvertido * 144.4228057359308140816048354604) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            
           // euro a won sur-coreano
            if (cbentrada.getSelectedIndex() == 6) {
                MONEDA = Math.round((txtconvertido * 1376.8549092601671165907243983399 ) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }

        }

    }
    public void conversorGBPaTODOS() {

        txtconvertido = Double.parseDouble(txtentrada.getText());

        if (cbentrada.getSelectedIndex() == 4) {

            //de libras esterlinas a sol peruano
            if (cbsalida.getSelectedIndex() == 1) {
                MONEDA = Math.round((txtconvertido * 4.5538715490362937642425178865828));
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //libras esterlinas a dolar
            if (cbentrada.getSelectedIndex() == 2) {
                MONEDA = Math.round((txtconvertido * 1.2032662373228231075777652619372) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
                  //libras esterlinas a auro
            if (cbentrada.getSelectedIndex() == 3) {
                MONEDA = Math.round((txtconvertido *1.1325405013754534508129675842106) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //libras esterlinas a libras esterlinas
            if (cbentrada.getSelectedIndex() == 4) {
                MONEDA = Math.round((txtconvertido * 1) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //libras esterlinas a yean japones
            if (cbentrada.getSelectedIndex() == 5) {
                MONEDA = Math.round((txtconvertido * 163.59870024104632493515765515946) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            
           // libras esterlinas a won sur-coreano
            if (cbentrada.getSelectedIndex() == 6) {
                MONEDA = Math.round((txtconvertido * 1559.3374686963003159217711578704 ) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }

        }

    }
    public void conversorJPYaTODOS() {

        txtconvertido = Double.parseDouble(txtentrada.getText());

        if (cbentrada.getSelectedIndex() == 4) {

            //de yen japones a sol peruano
            if (cbsalida.getSelectedIndex() == 1) {
                MONEDA = Math.round((txtconvertido * 0.02790230265426792505307576010895));
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //lyen japones a dolar
            if (cbentrada.getSelectedIndex() == 2) {
                MONEDA = Math.round((txtconvertido * 0.00736174387344632235986883728176) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
                  //yen japones a auro
            if (cbentrada.getSelectedIndex() == 3) {
                MONEDA = Math.round((txtconvertido *0.0069241753636040277374156055541) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //yen japones a libras esterlinas
            if (cbentrada.getSelectedIndex() == 4) {
                MONEDA = Math.round((txtconvertido * 0.00611978774617764177161490672587) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            //yen japones a yean japones
            if (cbentrada.getSelectedIndex() == 5) {
                MONEDA = Math.round((txtconvertido * 1) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }
            
           // yen japones a won sur-coreano
            if (cbentrada.getSelectedIndex() == 6) {
                MONEDA = Math.round((txtconvertido * 9.5606782306894138147402521475912 ) * 10000.0) / 10000.0;
                txtsalida.setText(String.valueOf(MONEDA));
            }

        }

    }

}
