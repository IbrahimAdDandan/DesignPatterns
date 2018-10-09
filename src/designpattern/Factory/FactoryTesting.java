/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Factory;

/**
 *
 * @author Ibrahim AdDandan
 */
public class FactoryTesting {

    public static void main(String[] args) {
        try {
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape circle = shapeFactory.getShape("circle");
            circle.drow();
            Shape rectangle = shapeFactory.getShape("rectanglE");
            rectangle.drow();
            Shape squar = shapeFactory.getShape("SqUAr");
            squar.drow();
            Shape poly = shapeFactory.getShape("BlaBlaBla");
            poly.drow();
        } catch (NullPointerException ex) {
            System.out.println("ERROR: please insert a correct type for the shape!");
        }
    }

}
