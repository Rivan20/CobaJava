/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3;


import java.io.*;
import java.util.Scanner;
/**
 *
 * @author rivan
 */
public class BukaTutupJalan {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String plat4 = input.nextLine();
        String[] split = plat4.split(" ");
        String plat = split[0] + split[1] + split[2] + split[3];
        
        long sum = Long.parseLong(plat);
        sum -= 999999;
        
        if(sum % 5 == 0) {
            System.out.println("jalan");
        } else {
            System.out.println("berhenti");
        }
    }
}
