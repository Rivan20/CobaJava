/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author rivan
 */

public class Circle {
    //private instance variable, not accessible from outside this class
    private double radius;
    private String color;
    
    //Contructors (overloaded)
    //Contructors a Circle instance with default value for radius and color
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    
     public Circle(double r) {
        radius = 1.0;
        color = "red";
    }
    
    
    //Contructors a Circle instance with the given radius and color
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }
    
    //Return the radius
    public double getRadius(){
        return radius;
    }
    
    //Returns the area of this circle instace
    public double getArea() {
        return radius*radius*Math.PI;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    /**Return a self-descriptive string of this instance in the 
    from of Circle (Circle[radius=?, color=?] */
    
    @Override
    public String toString(){
        return "Circle[radius=" + radius +"color=" + color + "]";
    }
    
}
