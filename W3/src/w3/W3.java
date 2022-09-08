/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package w3;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author rivan
 */
public class W3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s = " ";
       do{
           Scanner input = new Scanner(System.in);
           System.out.print("masukan string : ");
           s = input.nextLine();
           if(s.length() < 1);
                System.out.println("Tolong Masukan Teks !!!");
        }while(s.length() < 1);
               
        String[] words = s.split(" |\\ !|\\,|\\.|\\'|\\@");
        
        int n = words.length;
        
        System.out.println(n);
        for(String w : words){
            System.out.println(w);
        }
    }
    
}
