/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintingShapes;

/**
 *
 * @author rivan
 */
public class Retangle extends Shape {
	private double width;
	private double length;

	public Retangle(double w, double l) {
		super("Rectangle");
    	width = w;
    	length = l;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

        @Override
	public double area()
    {
    	return width * length;
    }

    @Override
    public String toString()
    {
    	return super.toString() + " of width " + width + " of length " + length; 
    }
}
