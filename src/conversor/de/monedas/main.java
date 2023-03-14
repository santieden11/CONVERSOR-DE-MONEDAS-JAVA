/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor.de.monedas;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 *
 * @author santiago
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //var r=(float) 0.000766414;
        double i= 5 * 0.00076629482;
        double e= 5 * 0.00076629482;
        
       
        
     //   System.out.println(r);
      //  System.out.println(i);
      //  System.out.println(e);
        
        
        System.out.println(convertir(i));
        System.out.println(convertir1(e));
        
        
        
    }
    
    
    public static String convertir(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,##0.0000");
    return num.format(val);
}
    public static String convertir1(double val){
    Locale.setDefault(Locale.US);
    DecimalFormat num = new DecimalFormat("#,###.00000000000");
    return num.format(val);
}

}
