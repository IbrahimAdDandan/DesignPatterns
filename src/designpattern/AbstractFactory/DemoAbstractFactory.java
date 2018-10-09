/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.AbstractFactory;

import designpattern.Factory.Shape;

/**
 *
 * @author Ibrahim AdDandan
 */
public class DemoAbstractFactory {
    public static void main(String[] args){
        FactoryProducer factoryProducer = new FactoryProducer();
        try{
        AbstractFactory colorFactory = factoryProducer.getFactory("Color");
        Color red = colorFactory.getColor("red");
        red.fill();
        }catch(NullPointerException e){
            System.out.println("Enter a valid factory name");
        }
        try{
        AbstractFactory blaFactory = factoryProducer.getFactory("BlaBlaBla...");
        blaFactory.getColor("bla");
        }catch(NullPointerException e){
            System.out.println("ERROR: Enter a valid factory name!");
        }
        try{
        AbstractFactory shapeFactory = factoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("circle");
        circle.drow();
        }catch(NullPointerException e){
            System.out.println("Enter a valid factory name");
        }
    }
}
