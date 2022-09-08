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

public class Berhitung {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        char operator;
        double A, B, total_hasil;


        while (true) {
            System.out.print("Masukkan data (Menggunakan Space): ");
            A = in.nextDouble();
            operator = in.next().charAt(0); // mengembalikan karakter pertama dalam string
            B = in.nextDouble();

            if (A>=1 && B <=1000) {
	            switch (operator) {
		            case '+' -> {
		                total_hasil = A + B;
		                System.out.println(total_hasil);
		                }

		            case '-' -> {
		                total_hasil = A - B;
		                System.out.println(total_hasil);
		                }
		            case '*' -> {
		                total_hasil = A * B;
		                System.out.println(total_hasil);
		                }
		            case '/' -> {
		                if (A%B == 0) {
		                	total_hasil = A / B;
		                	System.out.println(total_hasil);
		                }
		                else{
		                	System.out.println("Penyebut tidak habis membagi pembilang");
		                }
		                }
		            case '%' -> {
		                total_hasil = A % B;
		                System.out.println(total_hasil);
		                }
	            }
            }
        }
	}
}
