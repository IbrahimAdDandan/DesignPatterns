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
public class ColorFactoryTesting {

    public static void main(String[] args) {
        try {
            ColorFactory colorFactory = new ColorFactory();
            Color red = colorFactory.getColor("red");
            Color green = colorFactory.getColor("GReen");
            Color blue = colorFactory.getColor("BluE");
            Color soso = colorFactory.getColor("soso");
            red.fill();
            green.fill();
            blue.fill();
            soso.fill();
        } catch (NullPointerException e) {
            System.out.println("ERROR: please enter a correct color!");
        }
    }
}
