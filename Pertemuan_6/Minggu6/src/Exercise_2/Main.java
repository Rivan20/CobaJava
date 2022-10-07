/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_2;

/**
 *
 * @author rivan
 */
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Shape a1 = new Shape();
        System.out.println(a1.toString());

        Circle a2 = new Circle();
        System.out.println(a2.toString());

        Rectangle a3 = new Rectangle();
        System.out.println(a3.toString());

        Square a4 = new Square();
        System.out.println(a4.toString());

        Square s5 = new Square (7, "Purple", true);
        System.out.println(s5.toString());
        System.out.println("Area : " + s5.getArea());
        System.out.println("Perimeter : " + 
                s5.getPerimeter());
    }
}
