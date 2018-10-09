/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Ibrahim AdDandan
 */
public class FactoryTesting {
    public static void main(String[] args){
        Factory factory = new Factory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose Rocket 'R' or UFO ship 'U' ");
        while(scanner.hasNextLine()){
            String e = scanner.nextLine();
            doStuff(factory.getEnemy(e));
        }
    } //End of main
    @SuppressWarnings("UnusedAssignment")
    public static void doStuff(EnemyShip enemy){
        if(!Objects.isNull(enemy)){
                enemy.displayEnemy();
                enemy.followHero();
                enemy.enemyAttacks();
        }
    }
}
