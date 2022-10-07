/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_2;

/**
 *
 * @author rivan
 */

public class Circle extends Shape {
    //private instance variable, not accessible from outside this class
    private double radius;
    
    //Contructors (overloaded)
    //Contructors a Circle instance with default value for radius and color
    public Circle() {
        super();
        radius = 1.0;
    }
    
     public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    
    //Contructors a Circle instance with the given radius and color
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    //Return the radius
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter() {
        return 2*Math.PI*radius;
       }
    
    @Override
    public String toString(){
        super.toString();
        return "A Circle with radius = " + this.radius + 
                ", which is a subclass "
                + "of " + super.toString();
    }
}
    

