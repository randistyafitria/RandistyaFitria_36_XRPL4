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
public class nomor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a [][]= {{3,2,4},{4,5,7}};
        int b [][]= {{5,4,9},{6,8,4}};
        int pengurangan [][]= new int [2][3];
        
        System.out.println("Matriks A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println("");
            
        }
        System.out.println("Matriks B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]+" ");
                
            }
            System.out.println("");
            
        }
        System.out.println("Hasil pengurangan: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
               pengurangan[i][j]= a[i][j]-b[i][j];
                System.out.print(pengurangan[i][j]+"  ");
                
            }
            System.out.println("");
    }
    }
}
    
    


