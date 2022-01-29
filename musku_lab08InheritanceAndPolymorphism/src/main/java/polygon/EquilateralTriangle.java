/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

/**
 *
 * @author S545158
 */

/**
 * Class: 44542-01 Object Oriented Programming
 * @author Varun Reddy
 * Description: Making sure everything works
 * Due: 03/11/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class EquilateralTriangle extends RegularPolygon {
    
/**
     * This is a constructor having length as parameter
     * @param length length of the equilateral triangle
     */
    public EquilateralTriangle(double length) {
        super("Equilateral Triangle", 3, length);
    }

    /**
     * This is a constructor having name and length as parameters
     * @param name it is the name of the triangle, i.e, Tetrahedron 
     * @param length length of the triangle, i.e, Tetrahedron
     */
    public EquilateralTriangle(String name, double length) {
        super(name, 3, length);
    }
    
    /**
     * This method gets the height of the equilateral triangle
     * @return the height of the equilateral triangle
     */
    public double getHeight() {
        return (Math.sqrt(3)/2.0) * super.getLength();
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\tHeight: " + String.format("%.2f", getHeight()) + "cms";
    }
}
    
    

