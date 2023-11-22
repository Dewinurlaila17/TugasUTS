/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author WINDOWS
 */
public class runBarang {
    
    public static void main(String[] args) {
       
       Scanner barang = new Scanner(System.in);
      
        System.out.print("Nama Barang = ");
        String getNama = barang.nextLine();
                
        System.out.print("Masukkan jumlah barang = ");
        int getBarang = barang.nextInt();
        
        System.out.print("Harga barang = ");
        int harga = barang.nextInt();
        
        System.out.println("Harga total = " + harga*getBarang);
        barang.close();
    }
}
