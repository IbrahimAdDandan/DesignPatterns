/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 * This is The Target.
 * @author Ibrahim AdDandan
 */
public interface EnemyAttacker {
    public void fireWeapon();
    public void driveForward();
    public void setDriver(String driverName);
}
