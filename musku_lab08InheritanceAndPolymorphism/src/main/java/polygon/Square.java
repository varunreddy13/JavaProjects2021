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
public class Square extends RegularPolygon{   
    /**
     * constructor having one parameter
     * @param length 
     */
    public Square(double length){
        super("Square", 4, length);
    }
    /**
     * constructor having two parameters
     * @param name
     * @param length 
     */
    public Square(String name, double length){
        super(name, 4, length);
    }
}
