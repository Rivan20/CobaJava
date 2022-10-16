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

	//----------------------------------------- 
	// Creates someshapes and a Paint object 
	// and prints the amount of paintneeded
	// to paint each shape.
	//-----------------------------------------
	
	public static void main(String[] args) {
                final double COVERAGE = 350;
		double coveraged;
		Paint _paint = new Paint(10);

		Shape deck = new Retangle(20, 35);
		System.out.println(deck.toString());
		coveraged = _paint.amount(deck);
		System.out.println(coveraged + "\n");
		
		Shape bigBall = new Sphere(15);
		System.out.println(((Sphere)bigBall).toString());
		coveraged = _paint.amount(bigBall);
		System.out.println(coveraged + "\n");
		
		Shape tank = new Cylinder(10, 30);
		System.out.println(((Cylinder)tank).toString());
		coveraged = _paint.amount(tank);
		System.out.println(coveraged + "\n");
	}

}
