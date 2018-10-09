/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Ibrahim AdDandan
 */
public class SingletonTest {
    
    public static void main(String[] args){
        Singleton1 newInstance = Singleton1.getInstance();
        System.out.println("First instance ID: " + System.identityHashCode(newInstance));
        Singleton1  instanceTow = Singleton1.getInstance();
        System.out.println("Second instance ID: " + System.identityHashCode(instanceTow));
    }
    
}
