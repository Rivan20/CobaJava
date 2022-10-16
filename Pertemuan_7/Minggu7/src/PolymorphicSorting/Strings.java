/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphicSorting;

import java.util.Scanner;

/**
 *
 * @author rivan
 */

public class Strings {
	public static void main(String[] args)
    {

        String[] StringList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many Strings do you want to sort? ");
        size = scan.nextInt();
        StringList = new String[size];

        System.out.println("\nEnter the strings...");
        StringList[0] = scan.nextLine();
        for (int i = 0; i < size; i++)
        {
        	StringList[i] = scan.nextLine();
        }

        Sorting.insertionSort(StringList);

        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(StringList[i] + " ");
        System.out.println();
    }
}
