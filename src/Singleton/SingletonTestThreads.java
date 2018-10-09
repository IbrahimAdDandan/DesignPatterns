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
public class SingletonTestThreads {
    public static void main(String[] args){
        Runnable getInstance = new GetinstanceSynch();
        Runnable getInstanceAgain = new GetinstanceSynch();
        new Thread(getInstance).start();
        new Thread(getInstanceAgain).start();
    }
}
