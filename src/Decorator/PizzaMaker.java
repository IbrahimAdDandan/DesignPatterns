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
public class PizzaMaker {
    
    public static void main(String[] args){
        Pizza classicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + classicPizza.getDescription());
        System.out.println("Price: " + classicPizza.getCost());
    }
    
}
