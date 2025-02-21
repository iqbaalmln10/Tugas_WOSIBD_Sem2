/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_1;

import java.util.Scanner;

public class No_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Tinggi = ");      
        int n = input.nextInt();
         
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
    
}
