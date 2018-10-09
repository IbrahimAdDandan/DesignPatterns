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
abstract public class ToppingPizza implements Pizza{
    
    protected Pizza tempPizza;
    
    public ToppingPizza(Pizza newPizza){
        tempPizza = newPizza;
    }
    
    @Override
    public String getDescription(){
        return tempPizza.getDescription();
    }
    
    @Override
    public double getCost(){
        return tempPizza.getCost();
    }
    
}
