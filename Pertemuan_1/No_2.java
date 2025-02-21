/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_1;

/**
 *
 * @author LENOVO
 */
public class No_2 {
    public static void main(String[] args) {
        System.out.println("          Do__While");
        System.out.println("Bilangan Kelipatan 2 (1-100)" );
        System.out.println("=============================" );
        
        int bil = 1;
        
        do{
            System.out.print("  " + bil);
            bil *= 2;
        }while (bil <= 100);
    }
}
