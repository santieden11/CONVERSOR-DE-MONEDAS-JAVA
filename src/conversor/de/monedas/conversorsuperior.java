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

}
