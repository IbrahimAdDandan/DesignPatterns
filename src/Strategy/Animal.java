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
public abstract class Animal {
    
    public Fly fly;
    
    public String tryToFly(){
        return fly.canFly();
    }
    
    public void setFlyAblity(Fly flyType){
        fly = flyType;
    }
    
}
