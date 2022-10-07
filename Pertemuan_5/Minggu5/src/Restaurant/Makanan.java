/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

/**
 *
 * @author rivan
 */
public class Makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    //Make a Constructor
    public Makanan(String _namaMakanan, double _hargaMakanan, int _stok) {
        this.nama_makanan = _namaMakanan;
        this.harga_makanan = _hargaMakanan;
        this.stok = _stok;
    }
    
    //Encapsulation
    public String getNamaMakanan() {
        return nama_makanan;
    }
    
    public int getStok() {
        return stok;
    }
    
    public void TampilMakanan() {
        System.out.println(nama_makanan + "[" + stok + "]" + "Rp" + harga_makanan);
    }
    
    //Stok Decrease
    public void kurangStok(int jumlah) {
        stok -= jumlah;
    }
}
