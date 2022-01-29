/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

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
public enum Solids {
    
   /**
     * This enum variable tetrahedron having 4 sides
     */
     TETRAHEDRON(4),

    /**
     * This enum variable cube having 6 sides
     */
    CUBE(6),

    /**
     * This enum variable box having 6 sides
     */
    BOX(6);
    private final int noFaces;

    private Solids(int noFaces) {
        this.noFaces = noFaces;
    }

    /**
     * This method gets the number of faces of a solid
     * @return the number of faces of a solid
     */
    public int getNoFaces() {
        return noFaces;
    }
    
}
