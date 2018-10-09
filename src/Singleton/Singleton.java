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
public class Singleton {
    private static Singleton firstInstance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        
    if(firstInstance == null){
        firstInstance = new Singleton();
    }
    return firstInstance;
    }
}
