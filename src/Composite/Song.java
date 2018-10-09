/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Ibrahim AdDandan
 */
public class Song extends SongComponent{
    
    private String songName;
    private String bandName;
    private int releaseYear;
    
    public Song(String newName, String newBandName, int newReleaseYear){
        songName = newName;
        bandName = newBandName;
        releaseYear = newReleaseYear;
    }
    
    @Override
    public String getName(){
        return songName;
    }
    
    @Override
    public String getBandName(){
        return bandName;
    }
    
    @Override
    public int getReleaseYear(){
        return releaseYear;
    }
    
    @Override
    public void displaySongInfo(){
        System.out.println(getName() + "Created by: " + getBandName() + 
                " release in year: " + getReleaseYear());
    }
    
}
