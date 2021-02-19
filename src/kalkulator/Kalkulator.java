/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * TANGGAL  : 19-02-2021
 *
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator2 klt = new Kalkulator2();
        
        System.out.println("value 1 = 7.0 ");
        
        klt.setValue1(7.0);
        
        System.out.println("value 2 = 5.0");
        
        klt.setValue2(5.0);
        
        System.out.println("");
        System.out.println("");
        System.out.println("Result multiple is = " + klt.multiplication(7.0, 5.0));

    }
    
}
   
