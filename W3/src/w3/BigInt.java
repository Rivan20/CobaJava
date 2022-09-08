/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3;

import java.util.Scanner;
import java.math.*;

/**
 *
 * @author rivan
 */
public class BigInt {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //TODO Auto-generated method sub
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());
        
        BigInteger tambah = a.add(b);
        BigInteger kali = a.multiply(b);
        System.out.print(tambah+"\n"+kali+"\n");
    }
}
