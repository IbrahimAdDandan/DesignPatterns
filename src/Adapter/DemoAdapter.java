/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Ibrahim AdDandan
 */
public class DemoAdapter {
    public static void main(String[] args){
        
        EnemyTank rx7Tank = new EnemyTank();
        EnemyRobot fredTheRobot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
        System.out.println("The Robot");
        fredTheRobot.reactToHuman("Ibra");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println("The Adapter");
        robotAdapter.setDriver("Paul");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
        System.out.println("The Tank");
        rx7Tank.setDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        
    }
}
