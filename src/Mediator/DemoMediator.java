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
public class DemoMediator {
    
    public static void main(String[] args){
        User mark = new User("Mark");
        User frank = new User("Frank");
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.add(mark);
        chatRoom.add(frank);
        chatRoom.sendPublicMessage(frank, "Hi");
    }
    
}
