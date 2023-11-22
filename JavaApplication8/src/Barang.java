/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS
 */
public class Barang{
    private String nama;
    private int harga;
    
    public String setNama(){
        return nama;
    }
    public void setBarang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    public String getNama(){
        return this.nama;
    }
    public int getBarang(){
        return this.harga;
    }
    
    void barang(){
        System.out.println("Jenis Pembelian");
    }
}
