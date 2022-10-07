/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_2;

/**
 *
 * @author rivan
 */
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape() {
        this.color = "Green";
        this.filled = true;
    }
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString() {
        String fill = isFilled() ? "Filled" : "Not Filled";
        return "A Shape with color of" + this.color + " and" + fill;
    }
}
