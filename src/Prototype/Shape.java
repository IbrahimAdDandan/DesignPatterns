/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ibrahim AdDandan
 */
public abstract class Shape implements Cloneable{
    
    public Shape makeCopy(){
        Shape shapeObject = null;
        System.out.println("Copy of Circle is made.");
        try {
            shapeObject = (Shape) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Shape.class.getName()).log(Level.SEVERE, null, ex);
        }
        return shapeObject;
    }
    
}
