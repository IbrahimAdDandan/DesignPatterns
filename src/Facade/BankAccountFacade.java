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
public class BankAccountFacade {
    
    private final int  accountnum;
    private final int securityCode;
    private final AccountNumberCheck actChck;
    private final SecurityCodeCheck secCheck;
    private final FundsCheck fundCheck;
    private final WelcomToBank bankWelcome;

    public BankAccountFacade(int accountnum, int securityCode) {
        this.accountnum = accountnum;
        this.securityCode = securityCode;
        actChck = new AccountNumberCheck();
        secCheck = new SecurityCodeCheck();
        fundCheck = new FundsCheck();
        bankWelcome = new WelcomToBank();
    }
    
    public int getAcctNum(){
        return accountnum;
    }
    public int getSecNum(){
        return securityCode;
    }
    
    public void withDrowCash(double amount){
        if(actChck.accountActive(accountnum) &&secCheck.isCorrectCode(securityCode) && fundCheck.haveEnouphMoney(amount)){
            System.out.println("Transaction is complete!");
        }else{
            System.out.println("Transaction Failed!");
        }
    }
    
    public void depositCash(double amount){
        if(actChck.accountActive(accountnum) &&secCheck.isCorrectCode(securityCode)){
            fundCheck.makeDeposit(amount);
            System.out.println("Transaction is complete!");
        }else{
            System.out.println("Transaction Failed!");
        }
    }
    
}
