/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Ibrahim AdDandan
 */
public class RocketEnemyShip extends EnemyShip{
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public RocketEnemyShip(){
        setName("Rocket");
        setAmtDamage(10.0);
    }
}
