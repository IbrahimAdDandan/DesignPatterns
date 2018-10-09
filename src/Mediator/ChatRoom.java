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
public class ChatRoom {
    
    private final Mediator mediator;
    
    public ChatRoom(){
        this.mediator = new Mediator();
    }
    
    public void add(User user){
        mediator.add(user);
    }
    
    public void SendMessage(User sender, User reciever, String message){
        mediator.sendMessage(sender, reciever, message);
    }
    
    public void sendPublicMessage(User sender, String message){
        mediator.sendMessage(sender, message);
    }
    
}
