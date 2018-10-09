/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ibrahim AdDandan
 */
public class Singleton1 {

    private static Singleton1 firstInstance = null;
    static boolean firstThread = true;

    private Singleton1() {
    }

    @SuppressWarnings({"empty-statement", "DoubleCheckedLocking"})
    public static Singleton1 getInstance() {

//        if (firstInstance == null) {
//            if (firstThread) {
//                firstThread = false;
//                Thread.currentThread();
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(Singleton1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
            synchronized (Singleton1.class) {
                if (firstInstance == null) {
                    firstInstance = new Singleton1();
                }
            }
//        }
        return firstInstance;
    }
}
