/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor.de.monedas;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 *
 * @author santiago
 */
public class conversormonedasmetodos {

    private double txtconvertido;

    private String MONEDA;

    Conversordetemperatura c = new Conversordetemperatura();

    public void conversortxtentrada() {
        //convesorPENaTODOS();

    }

    public static String convertir(double val) {
        Locale.setDefault(Locale.US);
        DecimalFormat num = new DecimalFormat("#,##0.0000");
        return num.format(val);
    }

    public String conversorPENaTODOS(String entrada, int cbsalida) {

        txtconvertido = Double.parseDouble(entrada);

        switch (cbsalida) {
            case 1 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1))) + " soles";
            case 2 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.26404034536477173712143215483326) * 10000.0) / 10000.0) + " dolares";
            case 3 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.24841017488076311605723370429253) * 10000.0) / 10000.0) + " euros";
            case 4 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.21938003202948467630476274049536) * 10000.0) / 10000.0) + " libras";
            case 5 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 35.842293906810035842293906810036) * 10000.0) / 10000.0) + " yeanes";
            case 6 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 342.50317072310296912573668150733) * 10000.0) / 10000.0) + " won";

        }

       
        return MONEDA;

    }

    public String conversorUSDaTODOS(String entrada, int cbsalida) {

        txtconvertido = Double.parseDouble(entrada);

        switch (cbsalida) {
            case 1 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 3.7873) * 10000.0) / 10000.0) + " soles";
            case 2 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1) * 10000.0) / 10000.0) + " dolares";
            case 3 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.947927) * 10000.0) / 10000.0) + " auros";
            case 4 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.83068241806667804701579418015591) * 10000.0) / 10000.0) + " esterlinas";
            case 5 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 135.92268000000000000000000000005) * 10000.0) / 10000.0) + "yeanes";
            case 6 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1295.7643058631430066777602231949) * 10000.0) / 10000.0) + " wons";

        }

        
        return MONEDA;

    }

    public String conversorEURaTODOS(String entrada, int cbsalida) {

        txtconvertido = Double.parseDouble(entrada);

        switch (cbsalida) {
            case 1 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 4.0216279936194458904431319280585) * 10000.0) / 10000.0) + " soles";
            case 2 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1.0550815894593128886656805170744) * 10000.0) / 10000.0) + " dolares";
            case 3 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1) * 10000.0) / 10000.0) + " auros";
            case 4 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.88300860103357922768182515758613) * 10000.0) / 10000.0) + " esterlinas";
            case 5 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 144.4228057359308140816048354604) * 10000.0) / 10000.0) + "yeanes";
            case 6 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1376.8549092601671165907243983399) * 10000.0) / 10000.0) + " wons";

        }

       
        return MONEDA;

    }

    public String conversorGBPaTODOS(String entrada, int cbsalida) {

        txtconvertido = Double.parseDouble(entrada);

        switch (cbsalida) {
            case 1 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 4.5538715490362937642425178865828) * 10000.0) / 10000.0) + " soles";
            case 2 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1.2032662373228231075777652619372) * 10000.0) / 10000.0) + " dolares";
            case 3 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1.1325405013754534508129675842106) * 10000.0) / 10000.0) + " auros";
            case 4 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1) * 10000.0) / 10000.0) + " esterlinas";
            case 5 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 163.59870024104632493515765515946) * 10000.0) / 10000.0) + "yeanes";
            case 6 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1559.3374686963003159217711578704) * 10000.0) / 10000.0) + " wons";

        }

       
        return MONEDA;

    }

    public String conversorJPYaTODOS(String entrada, int cbsalida) {

        txtconvertido = Double.parseDouble(entrada);

        switch (cbsalida) {
            case 1 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.02790230265426792505307576010895) * 10000.0) / 10000.0) + " soles";
            case 2 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.00736174387344632235986883728176) * 10000.0) / 10000.0) + " dolares";
            case 3 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.0069241753636040277374156055541) * 10000.0) / 10000.0) + " auros";
            case 4 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.00611978774617764177161490672587) * 10000.0) / 10000.0) + " esterlinas";
            case 5 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1) * 10000.0) / 10000.0) + "yeanes";
            case 6 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 9.5606782306894138147402521475912) * 10000.0) / 10000.0) + " wons";

        }

        
        return MONEDA;
    }

    public String conversorKRWaTODOS(String entrada, int cbsalida) {

        txtconvertido = Double.parseDouble(entrada);

        switch (cbsalida) {
            case 1 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.00292289214682891485086132808795) * 10000.0) / 10000.0) + " soles";
            case 2 ->
                MONEDA = String.valueOf(convertir(txtconvertido * 0.000766414)) + " dolares";
            case 3 ->
                MONEDA = String.valueOf(convertir(txtconvertido * 0.00072515404)) + " auros";
            case 4 ->
                MONEDA = String.valueOf(convertir(txtconvertido * 0.00064127529)) + " esterlinas";
            case 5 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 0.10479543) * 10000.0) / 10000.0) + "yeanes";
            case 6 ->
                MONEDA = String.valueOf(Math.round((txtconvertido * 1) * 10000.0) / 10000.0) + " wons";

        }

  
        return MONEDA;

    }

}
