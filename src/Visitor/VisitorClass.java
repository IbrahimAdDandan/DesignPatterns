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
public class VisitorClass implements Visitor{
    
    @Override
    public void visit(Mouse mouse){
        System.out.println("Visit mouse");
    }
    
    @Override
    public void visit(Monitor monitor){
        System.out.println("Visit Monitor");
    }
    
    @Override
    public void visit(Keyboard keyboard){
        System.out.println("Visit Keyboard");
    }
    
}
