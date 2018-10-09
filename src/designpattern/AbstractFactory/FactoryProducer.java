/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.AbstractFactory;

import designpattern.Factory.ShapeFactory;

/**
 *
 * @author Ibrahim AdDandan
 */
public class FactoryProducer {
    AbstractFactory abstractFactory;
    public AbstractFactory getFactory(String factoryName){
        switch(factoryName.toUpperCase()){
            case "COLOR":
                abstractFactory = new ColorFactory();
                break;
            case "SHAPE":
                abstractFactory = new ShapeFactory();
                break;
            default: return null;
        }
        return abstractFactory;
    }
}
