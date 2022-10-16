/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintingShapes;

/**
 *
 * @author rivan
 */
public class Paint {

	private double coverage; //number of square feet per gallon
	
	//-----------------------------------------
	// Constructor: Sets up the paint object.
	//-----------------------------------------
	public Paint(double c)
	{
		coverage = c;
	} 

	//--------------------------------------------------- 
	// Returns the amount of paint (number of gallons)
	// needed to paint the shape given as the parameter.
	//--------------------------------------------------- 
	public double amount(Shape s)
	{
		System.out.print("Computing amount for " + s + " is "); 
		return s.area()/coverage;
	}

}