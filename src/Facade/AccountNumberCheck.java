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
public class AccountNumberCheck {

    private final int accountNumber = 12345678;

    public int getAccoutNumber() {
        return accountNumber;
    }

    public boolean accountActive(int actNumToCheck) {
        return actNumToCheck <= getAccoutNumber();
    }

}
