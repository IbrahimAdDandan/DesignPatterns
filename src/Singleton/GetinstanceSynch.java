/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Ibrahim AdDandan
 */
public class GetinstanceSynch implements Runnable{
    @Override
    public void run(){
        Singleton1 newInstance = Singleton1.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(newInstance));
    }
}
