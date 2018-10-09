/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Factory;

import designpattern.AbstractFactory.AbstractFactory;
import designpattern.AbstractFactory.Color;

/**
 *
 * @author Ibrahim AdDandan
 */
public class ShapeFactory implements AbstractFactory{
    
    Shape shape;
    
    @Override
    public Shape getShape(String shapeType){
        switch(shapeType.toUpperCase()){
            case "SQUAR":
                shape = new Squar();
                break;
            case "CIRCLE":
                shape = new Circle();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
            default: return null;
        }
        return shape;
    }
    
    @Override
    public Color getColor(String color){
        return null;
    }
    
}
