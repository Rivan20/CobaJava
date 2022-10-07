/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

/**
 *
 * @author rivan
 */

public class Restaurant {
    private Makanan[] menuMakanan;
    private static byte id=0;
    
    public Restaurant(){
        menuMakanan = new Makanan[10];
    }
    
    public void tampilMenuMakanan() {
        for(int i=0;i<=id;i++) {
            if(!isOutOfStock(i)) {
                //diubah 
                this.menuMakanan[i].TampilMakanan();
            }    
        }
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.menuMakanan[id] = new Makanan(nama, harga, stok);
    }
    
    public boolean isOutOfStock(int id) {
        return menuMakanan[id].getStok() == 0;
    }

    public static void nextId() {
        id++;
    }
    
    public void Pemesanan(String namaMakanan, int jumlah) {
        for(int i=0;i<=id;i++) {
            if(namaMakanan.equals(menuMakanan[i].getNamaMakanan())) {
                if(menuMakanan[i].getStok() >= jumlah) {
                    System.out.println(jumlah + " " + menuMakanan[i].getNamaMakanan() + " Terjual");
                    menuMakanan[i].kurangStok(jumlah);
                }
                else System.out.println("Stok" + menuMakanan[i].getNamaMakanan() + " tidak cukup!");
            }
        }
    }
}
