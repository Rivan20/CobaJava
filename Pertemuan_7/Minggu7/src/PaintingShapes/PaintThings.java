/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintingShapes;

import java.text.DecimalFormat;
/**
 *
 * @author rivan
 */
public class PaintThings {
    //Create some shapes and a Paint object
    //and prints the amount of paint needed
    //to paint each shape
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERGE);
        
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;
        
        double deckAmt, ballAmt, tankAmt;
        
        //Instantiate  the three shape to paint
        
        //Compute the amount of paint needed for each shape
        
        //Print the amount of paint for each
        DecymalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckkAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
