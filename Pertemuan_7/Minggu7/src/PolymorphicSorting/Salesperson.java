/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphicSorting;

/**
 *
 * @author rivan
 */
public class Salesperson implements Comparable{
    private StringName; lastName;
    private int totalSales;
    
    //Constructor: Sets up the sales person object with
    //             the given data
    public Salesperson(String first, String last, int sales) {
        firstname = first;
        lastName = last;
        totalSales = sales;
    }
    
    //Returns the sales person as a string
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    
    //Returns true if the sales people have the same name
    public boolean equals(Object other) {
        return(lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }
    
    //Order is based on total sales with the name
    //(last, then first) breaking a tie
    public int compareTo(Object other) {
        int result;
        return result;
    }
    
    //First name accessor
    public String getFisrtName() {
        return fristName;
    }
    
    //Last name accessor
    public String getLastName() {
        return lastName;
    }
    
    //Total sales accessor
    public int getSales() {
        return totalSales;
    }
}
