package Composite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim AdDandan
 */
public abstract class SongComponent {
    
    public void addSongComp(SongComponent newSong){
        throw new UnsupportedOperationException();
    }
    
    public void removeSongComp(SongComponent songComponent){
        throw new UnsupportedOperationException();
    }
    
    public SongComponent getComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }
    
    public String getName(){
        throw new UnsupportedOperationException();
    }
    
    public String getBandName(){
        throw new UnsupportedOperationException();
    }
    
    public int getReleaseYear(){
        throw new UnsupportedOperationException();
    }
    
    public void displaySongInfo(){
        throw new UnsupportedOperationException();
    }
}
