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
public interface RobotBuilder {
    
    public void buildRobotHead();
    public void buildrobotLegs();
    public void buildRobotTorso();
    public void buildRobotArms();
    public Robot getRobot();
    
}
