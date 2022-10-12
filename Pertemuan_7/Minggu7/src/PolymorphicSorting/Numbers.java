/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphicSorting;

/**
 *
 * @author rivan
 */
public class Numbers {
    //Reads in an array of integers, sort them,
    //the prints them in sorted order
    public static void main(String[] arg) {
        int[] intList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextIntt();
        intList = new int[size];
        
        System.out.println("\nEnter the numbers... ");
        for(int i=0; i < size; i++)
            intList[i] = scan.nextInt();
        
        Sorting.selectionSort(intList);
        System.out.println("\nYour numbers in sorted order...");
        for(int i=0; i < size; i++){
            System.out.println();
        }
    }
}
