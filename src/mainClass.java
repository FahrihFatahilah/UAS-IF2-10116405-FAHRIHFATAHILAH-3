
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fahri
 */
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner nilaiumur = new Scanner(System.in);
      classumur umur = new classumur();
      
      System.out.printf("Masukan Umur Anda :");umur.setUmuranda(nilaiumur.nextInt());
      System.out.printf("Status Dewasa : ",umur.Dewasa(0));
      
    }
    
}
    