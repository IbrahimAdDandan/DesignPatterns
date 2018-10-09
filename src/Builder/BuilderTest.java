/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Ibrahim AdDandan
 */
public class BuilderTest {
    public static void main(String[] args){
        RobotBuilder oldRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldRobot);
        robotEngineer.makeRobot();
        Robot firstRobot = robotEngineer.getrobot();
        System.out.println("Robot build!");
        System.out.println("Robot Head type: " + firstRobot.getRobotHead());
        System.out.println("Robot Arms type: " + firstRobot.getRobotArms());
        System.out.println("Robot Torso type: " + firstRobot.getRobotTorso());
        System.out.println("Robot Legs type: " + firstRobot.getRobotLegs());
    }
}
