/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author Ibrahim AdDandan
 */
public class DemoVisitor {
    
    public static void main(String[] args){
        Visitor visitor = new VisitorClass();
        ComputerPart mouse = new Mouse();
        mouse.accept(visitor);
        ComputerPart monitor = new Monitor();
        monitor.accept(visitor);
        ComputerPart keyboard = new Keyboard();
        keyboard.accept(visitor);
    }
    
}
