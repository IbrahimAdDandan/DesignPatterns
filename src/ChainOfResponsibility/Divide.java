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
public class Divide implements Chain{
    
    Chain nextChain;
    
    @Override
    public void setNextChain(Chain nextChain){
        this.nextChain = nextChain;
    }
    
    @Override
    public void calculate(int x, int y, String operationName){
        if(operationName.equalsIgnoreCase("DIV")){
            System.out.println("Division: " + x + " / " + y + " = " + (x/y));
        }else{
            this.nextChain.calculate(x, y, operationName);
        }
    }
}
