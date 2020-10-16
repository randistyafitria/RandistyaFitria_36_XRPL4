/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrandistya.studikasusarray;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in) ;
    int[]bilanganGanjil ;
    int kuadrat ;
        System.out.println("Maasukkan nilai awal: ");
        int awal = input.nextInt() ;
        System.out.println("Masukkan nilai akhir: ");
        int akhir = input.nextInt() ;
        
    bilanganGanjil = new int[awal + akhir + 1] ;
    
    for (int i = awal; i <= akhir; i++) {
        bilanganGanjil[i] = i ;
    }
    for (int i = awal; i >= akhir; i--) {
        bilanganGanjil[i] = i ;
    }
    
    if (awal == akhir && (awal % 2 == 0 || akhir % 2 == 0)) {
        System.out.println("Angka ganjil tidak ditemukan");
    }
    else if (awal<akhir) {
        for (int i = 0; i < bilanganGanjil.length; i++) {
            kuadrat = bilanganGanjil[i] * bilanganGanjil[i] ;
        if (bilanganGanjil[i] % 2 != 0) {
            System.out.println(bilanganGanjil[i] + " kuadrat : " + kuadrat);
        }
        }
    }
    else 
        for (int i = bilanganGanjil.length - 1; i > 0; i--) {
            kuadrat = bilanganGanjil[i] * bilanganGanjil[i] ;
        if (bilanganGanjil[i] % 2 != 0) {
            System.out.println(bilanganGanjil[i] + " kuadrat : " + kuadrat);
        }
        }
    }
}
    
    

