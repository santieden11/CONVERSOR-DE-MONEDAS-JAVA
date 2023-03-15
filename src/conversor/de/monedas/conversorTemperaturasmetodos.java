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
public class conversorTemperaturasmetodos {

    private double txtconvertido;

    private String TEMPERATURA;

    Conversordetemperatura c = new Conversordetemperatura();

    public void conversortxtentrada() {
        //convesorPENaTODOS();

    }

    public static String convertir(double val) {
        Locale.setDefault(Locale.US);
        DecimalFormat num = new DecimalFormat("#,##0.0000");
        return num.format(val);
    }

    public String conversorCENTIGRADOSsaTODOS(String entrada, int cbsalida) {

        txtconvertido = Double.parseDouble(entrada);

        switch (cbsalida) {
            case 1 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 1))) + " °C";
            case 2 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 33.8) * 10000.0) / 10000.0) + " °F";
            case 3 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 274.15) * 10000.0) / 10000.0) + " K";
            case 4 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 493.47) * 10000.0) / 10000.0) + " °R";
            case 5 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 0.8) * 10000.0) / 10000.0) + " °Re";

        }

       
        return TEMPERATURA;

    }

    public String conversorFAHRENHEITaTODOS(String entrada, int cbsalida) {

        txtconvertido = Double.parseDouble(entrada);

        switch (cbsalida) {
            case 1 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * -17.22222222))) + " °C";
            case 2 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 1) * 10000.0) / 10000.0) + " °F";
            case 3 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 255.927778) * 10000.0) / 10000.0) + " K";
            case 4 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 460.67) * 10000.0) / 10000.0) + " °R";
            case 5 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * -13.7777778) * 10000.0) / 10000.0) + " °Re";

        }

        
        return TEMPERATURA;

    }

    public String conversorKELVINaTODOS(String entrada, int cbsalida) {

        txtconvertido = Double.parseDouble(entrada);

        switch (cbsalida) {
        case 1 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * -272.15))) + " °C";
            case 2 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * -457.87) * 10000.0) / 10000.0) + " °F";
            case 3 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 1) * 10000.0) / 10000.0) + " K";
            case 4 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 1.8) * 10000.0) / 10000.0) + " °R";
            case 5 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * -217.72) * 10000.0) / 10000.0) + " °Re";
        }

       
        return TEMPERATURA;

    }

    public String conversorRANKINEaTODOS(String entrada, int cbsalida) {

        txtconvertido = Double.parseDouble(entrada);

        switch (cbsalida) {
         case 1 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * -272.594444))) + " °C";
            case 2 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * -45867) * 10000.0) / 10000.0) + " °F";
            case 3 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 0.555555556) * 10000.0) / 10000.0) + " K";
            case 4 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 1) * 10000.0) / 10000.0) + " °R";
            case 5 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * -218.075556) * 10000.0) / 10000.0) + " °Re";
        }

       
        return TEMPERATURA;

    }

    public String conversorREAUMURaTODOS(String entrada, int cbsalida) {

        txtconvertido = Double.parseDouble(entrada);

        switch (cbsalida) {
        case 1 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 1.25))) + " °C";
            case 2 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 34.25) * 10000.0) / 10000.0) + " °F";
            case 3 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 274.4) * 10000.0) / 10000.0) + " K";
            case 4 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 493.92) * 10000.0) / 10000.0) + " °R";
            case 5 ->
                TEMPERATURA = String.valueOf(Math.round((txtconvertido * 1) * 10000.0) / 10000.0) + " °Re";
        }

        
        return TEMPERATURA;
    }

   

}
