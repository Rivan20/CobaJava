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
 * Class Inventori berfungsi untuk mendefinisikan
 * pembuatan objek-objek barang dan menampilkan 
 * objek barang yang telah dibuat dan pengadaan barang
 * baru untuk menambah stok barang.Class inventori juga
 * adalah Main Classnya.
 */
public class Inventori {
    Barang[] barangs;
    
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[0].getStok() + ")");
    }
    
    void pengadaan() {
        initBarang();
        
        barangs[0].setStok(20);
        
        showBarang();        
    }
    
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
