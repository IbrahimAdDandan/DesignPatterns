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
public class OldRobotBuilder implements RobotBuilder{

    private final Robot robot;
    
    public OldRobotBuilder(){
        this.robot = new Robot();
    }
    
    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin head");
    }

    @Override
    public void buildrobotLegs() {
        robot.setRobotLegs("Roller Skates");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("BlowTorch Arms");
    }
    
    @Override
    public Robot getRobot(){
        return this.robot;
    }
    
}
