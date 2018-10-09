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
public class ColorFactory implements AbstractFactory{
    Color color;
    @Override
    public Color getColor(String colorName){
        switch(colorName.toUpperCase()){
            case "RED":
                color = new Red();
                break;
            case "GREEN":
                color = new Green();
                break;
            case "BLUE":
                color = new Blue();
                break;
            default: return null;
        }
        return color;
    }
    
    @Override
    public Shape getShape(String shapeType){
        return null;
    }
    
}
