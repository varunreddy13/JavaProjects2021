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
public class RegularPolygon extends Polygon {
    private double length;
    
    /**
     * this is a constructor
     * @param name
     * @param noSides
     * @param length 
     */

    public RegularPolygon(String name, int noSides,double length) {
        super(name, noSides);
        this.length = length;
    }
     
    /**
     * getter method of length
     * @return length 
     */
    public double getLength() {
        return length;
    }
    
   
    @Override
    public double getArea(){
        
    return (1.0/4.0)*super.getNoSides()*getLength()*getLength()*(1.0/Math.tan(Math.PI/super.getNoSides()));
    }
    
    @Override
    public double getPerimeter() {
    
      return super.getNoSides()*length;
    }
    
    @Override
    public double getInternalAngle(){
    
    return (180 * (super.getNoSides() - 2))/super.getNoSides();
    }
     /**
     * This method gets the InCircleRadius of the regular polygon
     * @return the InCircleRadius
     */
    public double getInCircleRadius(){
    
    return (length/2) * (1.0/Math.tan(Math.PI/super.getNoSides()));
    }
     /**
     * This method gets the CircumCircleRadius of the regular polygon
     * @return the CircumCircleRadius
     */
    public double getCircumCircleRadius(){
     
     return (length/2) * (1.0/Math.sin(Math.PI/super.getNoSides()));
    
    }

    @Override
    public String toString() {
          return super.toString() + "\n\tLength of side: " + length + "cms\n\tInternal angle: " + String.format("%.2f", getInternalAngle()) + "\u00b0" + "\n\tCircumcircle radius: " + String.format("%.2f", getCircumCircleRadius()) + "cms\n\tIncircle radius: " + String.format("%.2f", getInCircleRadius()) + "cms\n\tArea: " + String.format("%.2f", getArea()) + "cm" + "\u00b2" + "\n\tPerimeter: " + String.format("%.2f", getPerimeter()) + "cms";
    }
    
    
    
    
    
    
}
