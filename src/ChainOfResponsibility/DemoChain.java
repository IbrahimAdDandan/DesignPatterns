/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

/**
 *
 * @author Ibrahim AdDandan
 */
public class DemoChain {
    
    public static void main(String[] args){
        Chain add = new Add();
        Chain div = new Divide();
        Chain sub = new Subtraction();
        Chain mult = new Multiple();
        add.setNextChain(sub);
        sub.setNextChain(mult);
        mult.setNextChain(div);
        add.calculate(11, 5, "div");
    }
    
}
