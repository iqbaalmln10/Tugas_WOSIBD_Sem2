/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_1;

import java.util.Scanner;

public class No_1 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
         
            
        if (batasAwal > batasAkhir) {
            int cnth = batasAwal;
            batasAwal = batasAkhir;
            batasAkhir = cnth;
            System.out.println("Nominal Yang anda masukan terbalik Berikut contoh benarnya");
        }      
        if (batasAwal % 2 != 0) {
            batasAwal++;
            System.out.println("Nominal Yang Anda Masukan Adalah bilangan Ganjil sistem akan otomatis menambahkan 1");
        } 
         if (batasAkhir % 2 != 0) {
            batasAkhir--;
            System.out.println("Nominal batas akhir yang Anda Masukan Adalah bilangan Ganjil sistem akan otomatis mengurangi 1");
        }
        
        System.out.println("Bilangan Genap Dari " + batasAwal + "-" + batasAkhir);
       
        for (int i = batasAwal; i <= batasAkhir; i += 2) {
            System.out.print(i + " ");
        }
        
        input.close();
    }
}
