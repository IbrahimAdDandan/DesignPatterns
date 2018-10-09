/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author Ibrahim AdDandan
 */
public class DemoStrategy {
    
    public static void main(String[] args){
        
        Animal bird = new Bird();
        Animal dog = new Dog();
        System.out.println(bird.tryToFly());
        System.out.println(dog.tryToFly());
        
    }
    
}
