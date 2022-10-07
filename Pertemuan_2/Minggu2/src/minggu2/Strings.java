/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;
import java.io.*;
import java.util.*;

/**
 *
 * @author rivan
 */
public class Strings {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) < 0)
        {
            System.out.println("No");
            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
            System.out.println(A + " " + B);
        }
        else if (A.compareTo(B)==0)
        {
            System.out.println("No");
            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
            System.out.println(A + " " + B);
        }
        else
        {
            System.out.println("Yes");
            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
            System.out.println(A + " " + B);
        }
        
    }
}

}
