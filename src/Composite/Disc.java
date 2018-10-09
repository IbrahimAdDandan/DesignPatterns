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
public class Disc {
    
    SongComponent songList;
    
    public Disc(SongComponent newSongList){
        songList = newSongList;
    }
    
    public void getSongList(){
        songList.displaySongInfo();
    }
    
}
