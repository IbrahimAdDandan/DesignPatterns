/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author Ibrahim AdDandan
 */
public interface Fly {
    public String canFly();
}

class canFly implements Fly{
    @Override
    public String canFly(){
        return "I can fly!";
    }
} 

class canNotFly implements Fly{
    @Override
    public String canFly(){
        return "I can't fly";
    }
}