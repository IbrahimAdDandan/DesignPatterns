/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Ibrahim AdDandan
 */
public class FundsCheck {
    
    private double cashInAccount = 1000.00;
    
    public double getCashInAct(){
        return cashInAccount;
    }
    
    public void decreaseCash(double amount){
        cashInAccount -= amount;
    }
    
    public void increaseCash(double amount){
        cashInAccount += amount;
    }
    
    public boolean haveEnouphMoney(double amount){
        if(amount > cashInAccount){
            System.out.println("ERROR: you don't have enouph money!");
            System.out.println("Your Balance: " + getCashInAct());
            return false;
        }else{
            decreaseCash(amount);
            System.out.println("Withdrowl complete: your Balance: " + getCashInAct());
            return true;
        }
    }
    
    public void makeDeposit(double amount){
        increaseCash(amount);
        System.out.println("Deposit complete, your blalnce: " + getCashInAct());
    }
    
}
