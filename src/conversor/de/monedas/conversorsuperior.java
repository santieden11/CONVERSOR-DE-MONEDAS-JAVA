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
public class conversorsuperior  {
    
     Convertidor c = new Convertidor();
    
    private RSTextFieldMaterialIcon txtentrada=Convertidor.txtmonedaentrada;
    private RSTextFieldMaterialIcon txtsalida=Convertidor.txtmonedasalida;
    
    private double txtconvertido;
    private RSComboBox cbentrada= c.cbmonedaentrada;
    private RSComboBox cbsalida= c.cbmonedasalida;
    //private double cbsalida;
    private double PENaUSD;
    private double PENaEUR;
    private double PENaGBP;
    private double PENaJPY;
    private double PENaKRW;
    
    public  void conversorPENaUSD( ){
        
       
    if(txtentrada.getText().equals("")||txtsalida.getText().equals("")){
         
         }else{
        txtconvertido = Double.parseDouble(txtentrada.getText());
      
        if(cbentrada.getSelectedIndex()==1){
            if(cbsalida.getSelectedIndex()==2){
                //DecimalFormat df = new DecimalFormat("#.0000");
                 PENaUSD= Math.round((txtconvertido*0.26404034536477173712143215483326)*1000.0/1000.0);
                 //double sdr= Math.round(sd*10000.0)/10000.0;
               txtsalida.setText(String.valueOf(PENaUSD));
                
               //  double ds= ms*3.7873;
               // this.txtmoedaentrada.setText(String.valueOf(ds));
            }
           
            }
            
            
        }
     

      
        
}
    
    
    
    
    
    
    
    
    
       
    
    
    
    
}
