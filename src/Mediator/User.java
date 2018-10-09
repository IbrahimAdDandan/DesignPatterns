/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author Ibrahim AdDandan
 */
public class User {
    
    final private String name;
    
    public User(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void showmessage(String message){
        System.out.println(message);
    }
}
