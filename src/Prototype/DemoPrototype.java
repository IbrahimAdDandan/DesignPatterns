/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Ibrahim AdDandan
 */
public class DemoPrototype {
    public static void main(String[] args){
        Shape circle = new Circle();
        System.out.println("Circle ID: " + System.identityHashCode(circle));
        CloneMaker cloneMaker = new CloneMaker();
        Shape circleCopy = (Circle) cloneMaker.getClone(circle);
        System.out.println("Copy of Circle ID: " + System.identityHashCode(circleCopy));
        
    }
}
