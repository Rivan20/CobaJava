/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus_1;

/**
 *
 * @author rivan
 */

/**
 * Class Barang berfungsi untuk mendefinisikan 
 * struktur data yang diperlukan oleh objek Barang
 * 
 */ 

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public int getStok() {
       return stok;
    }
    
    public void setStok(int stok){
        this.stok += stok;
    }
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }    
}
