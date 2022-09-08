/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3;

import java.io.*;
/**
 *
 * @author rivan
 */
public class Array {
    public static void main(String[] args) {
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 17, 18};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};
        //Array 2 dimensi
        int[][] twoDimensionalArray1 = {firstArray, secondArray, 
                thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, 
                sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
                ninthArray};
        //Array 3 dimensi
        int[][][] threeDimensionalArray = {twoDimensionalArray1, 
                  twoDimensionalArray2, twoDimensionalArray3};
        
        for(int z = 0; z < 3; z++) {
            System.out.print("{");
            for(int y = 0; y < 3; y++) {
                System.out.print("{");
                for(int x = 0; x < 3; x++) {
                    System.out.print(threeDimensionalArray[z][y][x]+" ");
                }
                System.out.print("}");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
