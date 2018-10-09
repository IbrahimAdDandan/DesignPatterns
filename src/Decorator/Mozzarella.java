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
public class Mozzarella extends ToppingPizza{
    
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding dough");
        System.out.println("Adding Mozzarella");
    }
    
    @Override
    public String getDescription(){
        return tempPizza.getDescription() + " , Mozzarella.";
    }
    
    @Override
    public double getCost(){
        return tempPizza.getCost() + .40;
    }
}
