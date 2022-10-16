/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintingShapes;

/**
 *
 * @author rivan
 */
public class Cylinder extends Shape {
	private double radius;
	private double height;

	public Cylinder(double r, double h) {
		super("Cylinder");
    	radius = r;
    	height = h;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

        @Override
	public double area()
        {
            return 4*Math.PI*radius*radius*height;
        }

        @Override
        public String toString()
        {
            return super.toString() + " of radius " + radius + " of height " + height; 
        }
}
