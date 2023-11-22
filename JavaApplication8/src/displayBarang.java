/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS
 */
public class displayBarang extends Barang {
    private String kategori;
    
    @Override
    void barang(){
        System.out.println("Harga barang");
    }
    
    public displayBarang(String nama, int harga, String kategori) {
        this.kategori = kategori;
    }

}
