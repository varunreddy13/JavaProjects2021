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
public class Cube extends Square {
    
    
    /**
     * This is a constructor having length as parameter
     * @param length length of the cube
     */
    public Cube(double length) {
        super("Cube", length);
    }
    
    @Override
    public double getArea() {
        double result = super.getArea() * Solids.CUBE.getNoFaces();
        return result;
        //return super.getArea() * Solids.CUBE.getNoFaces();
    }
    
    /**
     * This method gets the volume of cube
     * @return the volume of cube
     */
    public double getVolume() {
        return Math.pow(super.getLength(), 3);
    }
    
    /**
     * This method gets the in-sphere radius of cube
     * @return the in-sphere radius
     */
    public double getInSphereRadius() {
        return super.getLength()/2.0;
    }
    
    /**
     * This method gets the circumsphere radius of cube
     * @return the circumsphere radius
     */
    public double getCircumSphereRadius() {
        return (Math.sqrt(3)/2.0) * super.getLength();
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\tInsphere radius: " + String.format("%.2f", getInSphereRadius()) + "cms" + "\n\tCircumsphere radius: " + String.format("%.2f", getCircumSphereRadius()) + "cms" + "\n\tVolume: " + String.format("%.2f", getVolume()) + "cm" + "\u00b3";
    }
}

