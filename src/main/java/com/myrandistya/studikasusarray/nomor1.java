/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrandistya.studikasusarray;

/**
 *
 * @author LENOVO
 */
public class nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int[]bilanganGanjil = new int [15] ;
    int kuadrat ;
    
    for (int i = 0; i < bilanganGanjil.length; i++) {
        bilanganGanjil[i] = i+1 ; 
    }
    for (int i = 0; i < bilanganGanjil.length; i++) {
        if (bilanganGanjil[i] % 2 != 0) {
        kuadrat = bilanganGanjil[i] * bilanganGanjil[i] ;
            System.out.println(bilanganGanjil[i] + " kuadrat: " + kuadrat);
    
        }
    }
    }
    
}
