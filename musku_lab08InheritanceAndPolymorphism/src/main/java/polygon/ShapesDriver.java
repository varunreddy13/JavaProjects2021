/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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

public class ShapesDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Polygon> polygonList = new ArrayList<Polygon>();
        ArrayList<Cube> cubeList = new ArrayList<Cube>();
        ArrayList<Tetrahedron> tetraList = new ArrayList<Tetrahedron>();
        Scanner sc = new Scanner(new File("shapes.txt"));
        while (sc.hasNext()) {
            String name = sc.next();
            switch (name) {
                case "cube": {
                    double length = sc.nextDouble();
                    Cube shape = new Cube(length);
                    polygonList.add(shape);
                    cubeList.add(shape);
                    break;
                }
                case "tetrahedron": {
                    double length = sc.nextDouble();
                    Tetrahedron shape = new Tetrahedron(length);
                    polygonList.add(shape);
                    tetraList.add(shape);
                    break;
                }
                case "triangle": {
                    double length = sc.nextDouble();
                    EquilateralTriangle shape = new EquilateralTriangle(length);
                    polygonList.add(shape);
                    break;
                }
                case "square": {
                    double length = sc.nextDouble();
                    Square shape = new Square(length);
                    polygonList.add(shape);
                    break;
                }
                default: {
                    int side = sc.nextInt();
                    double length = sc.nextDouble();
                    RegularPolygon shape = new RegularPolygon(name, side, length);
                    polygonList.add(shape);
                    break;
                }
            }

        }
        System.out.println("***************");
        for (Polygon list : polygonList) {

            System.out.println(list.toString());
            System.out.println("\n***************");
        }

        double value = 0.0;
        String result = "";

        for (Polygon list : polygonList) {
            if (value < list.getArea()) {
                value = list.getArea();
                result = "The polygon with largest area is " + list.getName() + " with area of " + String.format("%.2f", (Math.round(list.getArea() * 100) / 100.0)) + "cm²";
            }
        }
        System.out.println(result);

        //    The polygon with largest area is Cube with area of 423.36cm²
        for (Polygon list : polygonList) {

            if (value > list.getArea()) {
                value = list.getArea();
                result = "The polygon with smallest area is " + list.getName() + " with area of " + String.format("%.2f", (Math.round(list.getArea() * 100) / 100.0)) + "cm²";
            }
        }
        System.out.println(result);
//The polygon with smallest area is Pentagon with area of 15.48cm²
        value = 0.0;
        for (Polygon list : polygonList) {

            if (value < list.getPerimeter()) {
                value = list.getPerimeter();
                result = "The polygon with largest perimeter is " + list.getName() + " with perimeter of " + String.format("%.2f", (Math.round(list.getPerimeter() * 100) / 100.0)) + "cms";
            }
        }
        System.out.println(result);
//The polygon with largest perimeter is Decagon with perimeter of 60.00cms
        for (Polygon list : polygonList) {

            if (value > list.getPerimeter()) {
                value = list.getPerimeter();
                result = "The polygon with smallest perimeter is " + list.getName() + " with perimeter of " + String.format("%.2f", (Math.round(list.getPerimeter() * 100) / 100.0)) + "cms";
            }
        }
        System.out.println(result);
//The polygon with smallest perimeter is Pentagon with perimeter of 15.00cms
        System.out.println("***************");
        System.out.println("Surface area to Volume ratio of given solids are:");

        System.out.println("Cube:");
        for (Cube list : cubeList) {
                System.out.println("	Surface area: " +  String.format("%.2f", (Math.round(list.getArea() * 100) / 100.0)) + "cm²\n"
                        + "	Volume: " + String.format("%.2f", (Math.round(list.getVolume() * 100) / 100.0)) + "cm³");
        }
        System.out.println("Tetrahedron:");
        for (Tetrahedron list : tetraList) {
                System.out.println("	Surface area: " +  String.format("%.2f", (Math.round(list.getArea() * 100) / 100.0)) + "cm²\n"
                        + "	Volume: " +  String.format("%.2f", (Math.round(list.getVolume() * 100) / 100.0)) + "cm³");
        }
        
        System.out.println("******************************************");
            System.out.println("Where did you use polymorphic substitution in this project?");
            System.out.println(" In this project we used the polymorphic substition in the while loop by storing the reference of subclass like Cube, Square, Tetrahedron, EquilateralTriangle and RegularPolygon for the superclass object.");
            System.out.println("******************************************");
            System.out.println("Where did you use late binding polymorphism in this project?");
            System.out.println("The ability to override methods coupled with the run-time determination of which method to "
                    + "invoke is referred to as late binding polymorphism. In this project, in superclass getArea(), "
                    + "getPerimeter() and getInternalAngle() are overridided at the runtime.");
            System.out.println("******************************************");
         
    }

}

