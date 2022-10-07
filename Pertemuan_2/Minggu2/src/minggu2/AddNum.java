/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;
import java.io.*;
/** 
 * <h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 * 
 * @author rivan
 * @version 1.0
 * @since 2022-08-22
 * 
 */

public class AddNum {
    /**
     * This method is used to add two integers. This is
     * a the simplest form of a class method, just to
     * show the usage of carious javadoc Tags.
     * @param numA This is the first parameter to addNum method
     * @param numB This is the second parameter to addNum method
     * @return in This returns sum of numA and numB.
     */

    public int addNum(int numA, int numB){
        return numA + numB;
    }

    /**
     * This is the main method wich makes use of addNum method.
     * @param arg Unused.
     * @exception IOException On input error.
     * @see IOException
     */

    public static void main(String args[]) throws IOException {
    AddNum obj = new AddNum ();
    int sum = obj.addNum(10,20);

    System.out.println("Sum of 10 and 20 is:" + sum);
    }
}
