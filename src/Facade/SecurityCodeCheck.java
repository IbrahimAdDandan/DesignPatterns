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
public class SecurityCodeCheck {
    
    private final int secCode = 1234;
    
    public int getSecCode(){
        return secCode;
    }
    
    public boolean isCorrectCode(int secCode2Chck){
        return secCode2Chck == getSecCode();
    }
}
