/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

import enums.Solids;

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
public class Tetrahedron extends EquilateralTriangle {
    /**
     * This is a constructor having length as parameter
     * @param length length of the tetrahedron
     */
    public Tetrahedron(double length) {
        super("Tetrahedron", length);
    }
    
    @Override
    public double getHeight() {
      return (Math.sqrt(6)/3.0) * super.getLength();
    }
    
    @Override
    public double getArea() {
        return super.getArea() * Solids.TETRAHEDRON.getNoFaces();
    }
    
    /**
     * This method gets the volume of tetrahedron
     * @return the volume of tetrahedron
     */
    public double getVolume() {
        return (Math.sqrt(2)/12.0) * Math.pow(super.getLength(), 3);
    }
    
    /**
     * This method gets the Insphere radius of the tetrahedron
     * @return the insphere radius of tetrahedron
     */
    public double getInSphereRadius() {
        return super.getLength() / Math.sqrt(24);
    }
    
    /**
     * This method gets the circumsphere radius of the tetrahedron
     * @return the circumsphere radius of the tetrahedron
     */
    public double getCircumSphereRadius() {
        return (Math.sqrt(6)/4.0) * super.getLength();
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\tInsphere radius: " + String.format("%.2f", getInSphereRadius()) + "cms\n\tCircumsphere radius: " + String.format("%.2f", getCircumSphereRadius()) + "cms\n\tVolume: " + String.format("%.2f", getVolume()) + "cm" + "\u00b3";
    }
}
