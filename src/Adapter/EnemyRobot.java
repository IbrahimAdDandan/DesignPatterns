/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import java.util.Random;

/**
  This is the Adaptee.
 * @author Ibrahim AdDandan
 */
public class EnemyRobot {
    
    Random generator = new Random();
    
    public void smashWithHands(){
        int damage = generator.nextInt(10)+1;
        System.out.println("Robot cause " + damage + "damage");
    }
    
    public void walkForward(){
        int movement = generator.nextInt(5)+1;
        System.out.println("Robot walks forward " + movement + "spaces");
    }
    
    public void reactToHuman(String driverName){
        System.out.println("Robot tramps on " + driverName);
    }
    
}
