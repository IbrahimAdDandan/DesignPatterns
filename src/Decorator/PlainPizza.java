/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Ibrahim AdDandan
 */
public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "thin dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
    
}
