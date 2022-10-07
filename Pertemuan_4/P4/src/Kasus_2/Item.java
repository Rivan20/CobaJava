/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus_2;

/**
 *
 * @author rivan
 */
public class Item {
    private String name;
    private Item(){
        name = "Ipin";
    }
    public Item(String name) {
        this(); //Memanggil Private Item dengan syarat memanggil first statment
        System.out.println(this.name);
    }
}
