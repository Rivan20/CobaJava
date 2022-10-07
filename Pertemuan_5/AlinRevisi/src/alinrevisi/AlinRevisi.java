/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alinrevisi;

import java.util.Scanner;
/**
 *
 * @author rivan
 */
public class AlinRevisi {
public static void mainAlinRevisi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan dimensi matriks" + "\n");
        int baris = scan.nextInt();
        double [][] Matrix = new double [baris][baris];
        masukanMatriks(scan,Matrix,baris);
        System.out.print("\nDeterminan matriks sebesar \t");
        System.out.print(determinant(Matrix,baris));
        System.out.print("\n ");//determinant sudah terdefinisi di bagian lain
    }
    
     public static void masukanMatriks(Scanner scan, double Matrix[][], int baris) {
        // Menerima pasangan x, y
        System.out.print("Masukkan matriks" + "\n");
        for (int i=0;i<baris;i++) {
            for(int j=0;j<baris;j++) {
                Matrix[i][j] = scan.nextDouble();
            }
        }
        for (int i=0;i<baris;i++) {
            System.out.print("[");
            for(int j=0;j<baris;j++) {
                System.out.print(Matrix[i][j]);
                System.out.print("\t");
            }
            System.out.println("]");
        }
        
     }
     
     
        public static double determinant(double thematriks[][],int sumOr)
    {
        //membuat variabel det untuk menampung nilai determinan
        double det=0;
        if(sumOr == 1){det = thematriks[0][0];}// jika matriks hanya memiliki satu element
        //jika matriks 2x2
        else if (sumOr == 2){det = thematriks[0][0]*thematriks[1][1] - thematriks[1][0]*thematriks[0][1];}
        //jika matriks 3x3 atau lebih
        else
        {det=0;
            for(int j1=0;j1<sumOr;j1++)
            {
                double[][] newmatriks = new double[sumOr-1][];
                for(int k=0;k<(sumOr-1);k++){newmatriks[k] = new double[sumOr-1];}
                for(int i=1;i<sumOr;i++){
                    int j2=0;
                    for(int j=0;j<sumOr;j++){
                        if(j == j1)
                            continue;
                        newmatriks[i-1][j2] = thematriks[i][j];
                        j2++;}}
                det += Math.pow(-1.0,1.0+j1+1.0)* thematriks[0][j1] * determinant(newmatriks,sumOr-1);}
        }
        return det;
    }
     
     
     
    public static void main(String[] args) {
        mainAlinRevisi();
    }
}
