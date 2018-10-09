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
public class Subtraction implements Chain{
    
    Chain nextChain;
    
    @Override
    public void setNextChain(Chain nextChain){
        this.nextChain = nextChain;
    }
    
    @Override
    public void calculate(int x, int y, String operationName){
        if(operationName.equalsIgnoreCase("SUB")){
            System.out.println("Subtraction: " + x + " - " + y + " = " + (x-y));
        }else{
            this.nextChain.calculate(x, y, operationName);
        }
    }
}
