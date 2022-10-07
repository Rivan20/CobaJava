/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaintingShapes;

/**
 *
 * @author rivan
 */
public class Sphere {
    private double radius; //radius in feet
    
    //Contrucstor: Set up the sphere
    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }
    
    //Returns the surface area of the sphere
    public double area() {
        return 4*Math.PI*radius*radius;
    }
    
    //Returns the sphere as a String
    public String toString() {
        return super.toString() + " of radius" + radius;
    }
    
}
