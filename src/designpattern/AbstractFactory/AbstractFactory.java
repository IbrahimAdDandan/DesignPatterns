/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.AbstractFactory;

/**
 *
 * @author Ibrahim AdDandan
 */
import designpattern.Factory.*;

public interface AbstractFactory {
    public Color getColor(String color);
    public Shape getShape(String shapeType);
}
