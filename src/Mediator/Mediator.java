/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

import java.util.ArrayList;

/**
 *
 * @author Ibrahim AdDandan
 */
public class Mediator {
    
    ArrayList<User> users;
    
    public Mediator(){
        users = new ArrayList<>();
    }
    
    public void add(User user){
        users.add(user);
    }
    
    public void sendMessage(User sender, User user, String message){
        user.showmessage(sender.getName() + ": " + message);
    }
    
    public void sendMessage(User sender, String message){
        for(User user : users){
        user.showmessage(sender.getName() + ": " + message);}
    }
    
}
