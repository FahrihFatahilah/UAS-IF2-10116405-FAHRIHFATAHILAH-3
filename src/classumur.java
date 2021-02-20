/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fahri
 */
public class classumur {
    private int umuranda;

    public int getUmuranda() {
        return umuranda;
    }

    public void setUmuranda(int umuranda) {
        this.umuranda = umuranda;
    }
    public int umuranda(){
       return umuranda; 
    }
    public String Dewasa (int umur){
       String dewasa = ""; 
       if(0 <= umur && umur <= 17){
           dewasa = "false";
                   
       }
       else if(17 >= umur && umur >=29){
           dewasa = "true";
       }
       return dewasa;
    }
    
}
