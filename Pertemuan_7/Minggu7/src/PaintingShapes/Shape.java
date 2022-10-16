/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintingShapes;

/**
 *
 * @author rivan
 */
public abstract class Shape {
	private String shapeName;
	
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	
	abstract double area();
	
	public String toString() {
		return "Name of the shape is " + shapeName;
	}
}
