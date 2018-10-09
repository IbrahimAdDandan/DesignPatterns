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
public class TestBankAccount {
    public static void main(String[] args){
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.withDrowCash(50.00);
        accessingBank.withDrowCash(900.00);
        accessingBank.withDrowCash(150.00);
        accessingBank.depositCash(250.00);
    }
}
