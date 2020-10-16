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
public class nomor5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a [][]= {{89,86,98,87,81},{78,76,87,98,90},{76,83,75,97,98},{87,90,91,85,80},{90,86,94,89,100}};
        int b [][]= {{75,78,80,98,96},{90,91,87,83,90},{89,90,87,96,85},{85,98,93,90,82},{87,85,76,78,90}};
        int nilaiAwal [][]= new int [5][5];
        
        System.out.println("Input nilai awal: ");
        int awal = scanner.nextInt();
        
        if (awal == 89) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
        } 
        else if (awal == 75) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
        }
            }
}
        
            
        
        
            
    
    

            

        