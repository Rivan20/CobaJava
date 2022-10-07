/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alincoba;


import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

/**
 *
 * @author rivan
 */
public class functions_procedures {

    public static void inputMatrixdata(Scanner scan,float[][] Matrix,int baris,int kolom) {
        System.out.println("Input matriks augmented: ");

        for(int i=0; i<baris; i++) {
            for(int j=0; j<kolom; j++) {
                Matrix[i][j] = scan.nextFloat();
            }
        }
    }


    public static void printMatrix(float[][] Matrix, int baris, int kolom) {

        for(int i=0; i<baris; i++) {
            for(int j=0; j<kolom; j++) {
                if (j == kolom-1) {
                    System.out.print(Matrix[i][j]);
                } 
                else {
                    System.out.print(Matrix[i][j]);
                    System.out.print(' ');
                }  
            }
            System.out.println();
        }
    }

    public static int firstfoundX(float[][] Matrix,int i,int kolom,int X) {
        int firstfound = 0;
        for(int j=0; j<kolom; j++) {
            if (Matrix[i][j] == X) {
                firstfound = j;
                break;
            }
        }
        return firstfound;
    }

    public static int firstfoundnotX(float[][] Matrix,int i,int kolom,int X) {
        int firstnotfound = kolom; 
        for(int j=0; j<kolom; j++) {
            if (Matrix[i][j] != X) {
                firstnotfound = j;
                break;
            }
        }
        return firstnotfound;
    }

//    public static void make0centered(float[][] Matrix, int baris, int kolom) {
//        for(int i=0; i<baris; i++) {
//            for(int j=0; j<baris; j++) {
//                if (firstfoundnotX(Matrix, i, kolom,0) < firstfoundnotX(Matrix, j, kolom,0)) {
//                    tukarbaris(Matrix, i, j, kolom);
//                }
//            }
//        }
//    }

//    public static void tukarbaris(float[][] Matrix, int idxbaris1, int idxbaris2, int kolom) {
//        float[] temp = new float[kolom];
//
//        //MENYIMPAN BARIS1 DI TEMP
//        for(int j=0; j<kolom; j++) {
//            temp[j] = Matrix[idxbaris1][j];
//        }
//
//        //MENUKAR BARIS1 MENJADI BARIS2
//        for(int j=0; j<kolom; j++) {
//            Matrix[idxbaris1][j] = Matrix[idxbaris2][j];
//        }
//
//        //MENUKAR BARIS2 MENJADI TEMP
//        for(int j=0; j<kolom; j++) {
//            Matrix[idxbaris2][j] = temp[j];
//        }
//    }

//    public static float[][] gauss(float[][] Matrix,int baris, int kolom) {
//
//        int looping = baris;
//        make0centered(Matrix, baris, kolom);
//
//        for(int l=looping; l>0; l--) {
//            //MEMBAGI ELEMEN PERTAMA SETELAH NOL BIAR JADI 1
//            float divider = Matrix[baris-l][baris-l];
//            boolean dividernol;
//            if (divider==0) {
//                dividernol = true;
//                int jdiv = baris-l+1;
//                while (jdiv<kolom && dividernol) {
//                    divider = Matrix[baris-l][jdiv];
//                    if (divider==0) dividernol = true;
//                    else {
//                        dividernol = false;
//                    }
//                    jdiv += 1;
//                }
//            }
//            else {
//                dividernol = false;
//            }
//
//            boolean nolsemua;
//            if (dividernol) nolsemua = true;
//            else nolsemua = false;
//
//            if (!dividernol && !nolsemua) {
//                for(int j=0; j<kolom; j++) {
//                    Matrix[baris-l][j] /= divider;
//                }
//            }
//        
//            //MAU BIKIN JADI NOL SEMUA KE BAWAH
//            int kol = firstfoundX(Matrix, baris-l, kolom, 1);
//            for(int i=baris-l+1; i<baris; i++) {
//                float multiplier = (-1)*Matrix[i][kol];
//                for(int j=0; j<kolom; j++) {
//                    Matrix[i][j] += multiplier*Matrix[baris-l][j];
//                    if (Matrix[i][j] == -0.0) {
//                        Matrix[i][j] = Float.parseFloat("0.0");
//                    }
//                }   
//            } 
//        }
//        return Matrix; 
//    }
//
//    public static float[][] gaussjordan(float[][] Matrix,int baris, int kolom) {
//        Matrix = gauss(Matrix,baris,kolom);
//
//        for(int i=0; i<baris; i++) {
//            boolean found1first = false;
//            for(int j=0; j<kolom; j++) {
//                if (Matrix[i][j] == 1 && !found1first) {
//                    found1first = true;
//                    for(int k=0; k<i; k++) {
//                        float multiplier = (-1)*Matrix[k][j];
//                        for(int l=0; l<kolom; l++) {
//                            Matrix[k][l] += multiplier*Matrix[i][l];
//                        }
//                    }
//                }
//            }
//        }
//        return Matrix;
//    }

//    public static void printsolusi (float[][] Matrix, int baris, int kolom) {
//        boolean unik=false,banyak=false,tidakada = false;
//
//        if (firstfoundnotX(Matrix, baris-1, kolom, 0)==kolom) banyak = true;
//        else banyak = false;
//
//        if (firstfoundnotX(Matrix, baris-1, kolom, 0)==kolom-1) tidakada = true;
//        else tidakada = false;
//
//        for(int i=0; i<baris-1; i++) {
//            if (firstfoundX(Matrix,i,kolom,1) == firstfoundX(Matrix,i+1,kolom,1)-1) unik = true;
//            else unik = false;
//        }
//
//        if (!unik && !tidakada) banyak = true;
//
//        if (banyak) System.out.println("Terdapat banyak solusi");
//        if (tidakada) System.out.println("Tidak ada solusi");
//        if (unik && !banyak && !tidakada) System.out.println("Terdapat solusi unik");
//
//        if (unik && !banyak && !tidakada) printsolusiunik(Matrix, baris, kolom);
//        if (banyak) printsolusibanyak(Matrix, baris, kolom);
//    }

    public static void printsolusiunik (float[][] Matrix, int baris, int kolom) {
        float[] ArrayTemp = new float[kolom-1]; 
        
        for(int i=baris-1; i>=0; i--) {
            ArrayTemp[i] = Matrix[i][kolom-1];
            int k=kolom-2;
            while(k>i) {
                ArrayTemp[i] -= Matrix[i][k]*ArrayTemp[k];
                k--;
            }
        }

        for(int j=0; j<kolom-1; j++) {
            int k = j+1;
            System.out.print("X"+k+" = ");
            System.out.println(ArrayTemp[j]);
        }
    }

    public static void printsolusibanyak (float[][] Matrix, int baris, int kolom) {
        float[] ArrayTemp = new float[kolom-1];

        for(int i=0; i<kolom-1; i++) ArrayTemp[i] = 99999;

        for(int i=baris-1; i>=0; i--) {
            ArrayTemp[firstfoundX(Matrix, i, kolom-1, 1)] = Matrix[i][kolom-1];
            int k=kolom-2;
            while(k>i) {
                if (ArrayTemp[k] != 99999) {
                    ArrayTemp[i] -= Matrix[i][k]*ArrayTemp[k];
                }
                k--;
            }
        }

        for(int j=0; j<kolom-1; j++) {
            int ascii = (96+j+1);
            char x = (char) ascii;
            int k = j+1;
            System.out.print("X"+k+" = ");
            if (!(ArrayTemp[j] == 99999)) {
                System.out.print(ArrayTemp[j]);
                
                int bar = 0;
                for(int i=0; i<baris; i++) {
                    if (firstfoundX(Matrix, i, kolom, 1) == j) {
                        bar = i;
                        break;
                    }
                }
    
                for(int l=j+1; l<kolom-1; l++) {
                    int ascii_1 = (96+l+1);
                    x = (char) ascii_1;
                    if (ArrayTemp[l] == 99999) {
                        if (Matrix[bar][l] > 0) {
                            System.out.print("-"+Matrix[bar][l]+x);
                        }
                        else if (Matrix[bar][l] < 0) {
                            System.out.print("+"+((-1)*Matrix[bar][l])+x);
                        }
                    }
                }
            }
            else {
                System.out.print(x);
            }
            System.out.print("\n");
        }
    }
    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                MASUK KE BAGIAN SPL INVERSE
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */
//    public static void mainsplinvers()
//    {
//        Scanner keyboard = new Scanner(System.in);
//        int sumSPL = 1;
//        int sumvar = 2;
//        
//        while(sumSPL != sumvar) {
//			try {
//				System.out.println("-------------------------------------------------------------------------");
//				System.out.print("Masukkan jumlah sistem persamaan linear Anda: ");
//                sumSPL = keyboard.nextInt();
//                System.out.println("-------------------------------------------------------------------------");
//                System.out.println("PERINGATAN: Jumlah variabel dan jumlah persamaan harus sama!");
//                System.out.println("Jika tidak sama, maka SPL Anda tidak dapat diselesaikan dengan metode invers!");
//                System.out.print("Masukkan jumlah variabel persamaan linear Anda: ");
//                sumvar = keyboard.nextInt();
//			} catch (InputMismatchException ex) {
//				keyboard.next();
//			}
//		}
//    
//        int i;
//        System.out.println("-------------------------------------------------------------------------");
//        System.out.println("Jika SPL adalah x + 2y + 3z = 4");
//        System.out.println("Maka masukan matriks konstanta variabel adalah 1 2 3 dan masukan hasil adalah 4");
//        System.out.println("-------------------------------------------------------------------------");
//        double [][]thematriks = new double[sumSPL][sumvar];
//        double [][]constants = new double[sumSPL][1];
//        //input Sistem Persamaan Linear
//        for (i=0; i<sumSPL; i++){
//            System.out.print("Masukkan matriks konstanta variabel baris ke-"+(i+1)+": ");
//            for(int j=0;j<sumvar;j++){
//                thematriks[i][j]= keyboard.nextDouble();
//            }
//            System.out.print("Masukkan hasil baris ke-"+(i+1)+": ");
//            constants[i][0] = keyboard.nextDouble();
//        }
//
//        System.out.println("-------------------------------------------------------------------------");
//        System.out.println("Matriks augmented dari inputan Anda adalah :");
//        //Menuliskan Sistem Persamaan Linear ke bentuk matriks
//        for(i=0; i<sumSPL; i++)
//        {
//            for(int j=0; j<sumvar; j++)
//            {System.out.print(" "+thematriks[i][j]);}
//            System.out.print("  ");
//            System.out.print("= "+ constants[i][0]);
//            System.out.println();
//        }
//
//        //melakukan pengecekan apakah matriks invertible atau tidak.
// 
//        if(determinant(thematriks, sumSPL) == 0)
//        {
//            System.out.println("-------------------------------------------------------------------------");
//            System.out.println("Matriks tidak invertible, karena determinannya adalah : "+determinant(thematriks, sumSPL));
//            System.out.println("Sistem Persamaan Linear Anda tidak memiliki solusi");
//            System.out.println("-------------------------------------------------------------------------");
//        }
//        else
//        {
//            System.out.println("-------------------------------------------------------------------------");
//            System.out.println("Matriks invertible, karena determinannya adalah : "+determinant(thematriks, sumSPL));
//            double d[][] = invert(thematriks); 
//            System.out.println("-------------------------------------------------------------------------");
//            System.out.println("Invers dari matriks Anda adalah: ");
//            for (i=0; i<sumSPL; ++i) 
//            {
//                for (int j=0; j<sumSPL; ++j)
//                {System.out.print(d[i][j]+"  "); //menampilkan inverse dari matriks
//                }System.out.println();}
//            //Perkalian antara inverse matriks dengan contant untuk mendapatkan solusi
//            double hasil[][] = new double[sumSPL][1];
//            for (i = 0; i < sumSPL; i++) 
//            {for (int j = 0; j < 1; j++){
//                    for (int k = 0; k < sumSPL; k++)
//                    {hasil[i][j] = hasil[i][j] + d[i][k] * constants[k][j];}}
//            }
//            System.out.println("-------------------------------------------------------------------------");
//            System.out.println("Maka solusi sistem persamaan linear Anda adalah");
//            System.out.println("-------------------------------------------------------------------------");
//            for(i=0; i<sumSPL; i++)
//            {
//                System.out.println("X"+(i+1)+" = "+hasil[i][0] + " ");
//                System.out.println("-------------------------------------------------------------------------");
//            }
//        }
//    }
  

    //fungsi mencari determinan matriks
    public static double determinant(double thematriks[][],int sumSPL)
    {
        //membuat variabel det untuk menampung nilai determinan
        double det=0;
        if(sumSPL == 1){det = thematriks[0][0];}// jika matriks hanya memiliki satu element
        //jika matriks 2x2
        else if (sumSPL == 2){det = thematriks[0][0]*thematriks[1][1] - thematriks[1][0]*thematriks[0][1];}
        //jika matriks 3x3 atau lebih
        else
        {det=0;
            for(int j1=0;j1<sumSPL;j1++)
            {
                double[][] newmatriks = new double[sumSPL-1][];
                for(int k=0;k<(sumSPL-1);k++){newmatriks[k] = new double[sumSPL-1];}
                for(int i=1;i<sumSPL;i++){
                    int j2=0;
                    for(int j=0;j<sumSPL;j++){
                        if(j == j1)
                            continue;
                        newmatriks[i-1][j2] = thematriks[i][j];
                        j2++;}}
                det += Math.pow(-1.0,1.0+j1+1.0)* thematriks[0][j1] * determinant(newmatriks,sumSPL-1);}
        }
        return det;
    }



    public static void masukanMatriks(Scanner scan, double Matrix[][], int baris, int kolom) {
        // Menerima pasangan x, y
        for (int i=0;i<baris;i++) {
            for(int j=0;j<kolom;j++) {
                Matrix[i][j] = scan.nextDouble();
            }
        }
    }

   
    public static double [][] Minor(double [][] Matrix, int excluded_baris, int excluded_kolom, int baris) {
        double [][] temp = new double[baris-1][baris-1]; //Matrix minor berukuran baris dan kolom kurang 1 dari aslinya
        int i=0;
        for (int row=0;row<baris;row++) {
        int j = 0;
            for (int col=0;col<baris;col++) {
                if ((row != excluded_baris) && (col != excluded_kolom)) { //Tidak termasuk baris dan kolom tersebut
                    temp[i][j] = Matrix[row][col]; //Isi dengan baris dan kolom matriks
                    j++;
                }
            }
            if (j == baris-1) //Apabila kolom sudah sampai ke N-1, lanjut ke baris selanjutnya
            i++;
            }
        return temp;
    }    
    
    public static double determinantDOUBLE(double Matrix[][], int baris) {
         double D = 0; //Inisialisasi
         if (baris==1) {
             D = Matrix[0][0]; //Elemen satu-satunya
         }
         else if (baris==2) {
             D = Matrix[0][0]*Matrix[1][1] - Matrix[1][0]*Matrix[0][1];
         }
         else {
             int tanda = 1; //Inisialisasi tanda
             for (int i=0; i<baris;i++) {
                 D = D + (tanda*Matrix[i][0]*determinantDOUBLE(Minor(Matrix,i,0,baris),baris-1)); //Matriks dikali determinan minor
                 //Tanda terus berganti
                 tanda = -tanda;
             }
         }
         return D;
       }

  
    public static void printMatrix(double[][] Matrix, int baris, int kolom) {
        System.out.println("Matrix yang sudah diinput adalah");

        for(int i=0; i<baris; i++) {
            for(int j=0; j<kolom; j++) {
                if (j == kolom-1) {
                    System.out.print(Matrix[i][j]);
                } 
                else {
                    System.out.print(Matrix[i][j]);
                    System.out.print(' ');
                }  
            }
            System.out.println();
        }
    }

    public static void masukanMatriks(Scanner scan, double Matrix[][], int baris) {
        // Menerima pasangan x, y
        System.out.print("Masukkan matriks" + "\n");
        for (int i=0;i<baris;i++) {
            for(int j=0;j<baris;j++) {
                Matrix[i][j] = scan.nextDouble();
            }
        }
    }



    /*
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                MASUK KE BAGIAN DETERMINAN COFACTOR
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */

    public static void maindetcofactor() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan dimensi matriks" + "\n");
        int baris = scan.nextInt();
        double [][] Matrix = new double [baris][baris];
        masukanMatriks(scan,Matrix,baris);
        System.out.print("Determinan matriks sebesar ");
        System.out.print(determinant(Matrix,baris)); //determinant sudah terdefinisi di bagian lain
    }


    
    
    //fungsi kali matriks
	private static double[][] multiply(double[][] a, double[][] b) {
		double[][] matrix = new double[a.length][b[0].length];
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < b[0].length; j++) {double sum = 0;
				for (int k = 0; k < a[i].length; k++)
					sum += a[i][k] * b[k][j];
				matrix[i][j] = sum;}}
		return matrix;
    }
    


	//fungsi determinan
	private static double determinant(double[][] matrix) { 
        if (matrix.length == 2)
			return matrix[0][0]*matrix[1][1] - matrix[1][0]*matrix[0][1];
		double det = 0;
		for (int i = 0; i < matrix[0].length; i++)
			det += Math.pow(-1, i) * matrix[0][i]
					* determinant(minor(matrix, 0, i));
		return det;
	}

	//fungsi transpose matriks
	private static double[][] transpose(double[][] matrix) {
		double[][] transpose = new double[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				transpose[j][i] = matrix[i][j];
		return transpose;
    }    

    	//fungsi mencari minor
	private static double[][] minor(double[][] matrix, int baris, int kolom) {
		double[][] minor = new double[matrix.length - 1][matrix.length - 1];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; i != baris && j < matrix[i].length; j++)
				if (j != kolom)
					minor[i < baris ? i : i - 1][j < kolom ? j : j - 1] = matrix[i][j];
		return minor;}
}
