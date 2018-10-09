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
 public abstract class EnemyShip {
    private String name;
    private double amtDamage;
    public String getName(){
        return name;
    }
    public double getAmtDamage(){
        return amtDamage;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAmtDamage(double damage){
        amtDamage = damage;
    }
    public void followHero(){
        System.out.println(getName() + " is following the Hero");
    }
    public void displayEnemy(){
        System.out.println(getName() + " is on the screen");
    }
    public void enemyAttacks(){
        System.out.println(getName() + " attacks and does " + getAmtDamage());
    }
}
