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
public class Polygon {
    
    private String name;
    private int noSides;
     
    /**
     * constructor
     * @param name
     * @param noSides 
     */
    
    public Polygon(String name, int noSides) {
        this.name = name;
        this.noSides = noSides;
    }
    
    /**
     * this is a getter method
     * @return name 
     */
    public String getName() {
        return name;
    }
     
    /**
     * this is a getter method for number of sides
     * @return noSides
     */
    public int getNoSides() {
        return noSides;
    }
    /**
     * this is a method of get area
     * @return area
     */
    public double getArea() {
    
    return 0.0;
    }
     /**
     * this is a method of  area
     * @return Perimeter
     */
    public double getPerimeter(){
        
      return 0.0;
    } 
     /**
     * this is a method of get InternalAngle
     * @return InternalAngle
     */
    public double getInternalAngle() {
        return 0.0;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
       
        return "Polygon: " + name.substring(0, 1).toUpperCase() + name.substring(1) + "\n\tNumber of sides: " + noSides;
    }
    
    
}
