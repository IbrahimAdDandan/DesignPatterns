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

public class Factory {
    EnemyShip enemy = null;
    public EnemyShip getEnemy(String enemyType){
        if(null != enemyType)switch (enemyType) {
            case "R":
            case "r":
                enemy = new RocketEnemyShip();
                break;
            case "U":
            case "u":
                enemy = new UFOEnemyShip();
                break;
            default:
                System.out.println("Please Enter 'R' or 'U'!");
                return null;
        }
        return enemy;
    }
}
