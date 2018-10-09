/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ibrahim AdDandan
 */
public class SongGroup extends SongComponent{
    
    ArrayList songComponent = new ArrayList();
    String groupName;
    String groupDescription;
    
    public SongGroup(String newGroupName, String newGroupDesc){
        groupName = newGroupName;
        groupDescription = newGroupDesc;
    }
    
    public String getGroupName(){
        return groupName;
    }
    
    public String getGroupDesc(){
        return groupDescription;
    }
    
    @Override
    public void addSongComp(SongComponent newSongComp){
        songComponent.add(newSongComp);
    }
    
    @Override
    public void removeSongComp(SongComponent newSongComp){
        songComponent.remove(newSongComp);
    }
    
    @Override
    public SongComponent getComponent(int componentIndex){
        return (SongComponent) songComponent.get(componentIndex);
    }
    
    @Override
    public void displaySongInfo(){
        System.out.println(getGroupName() + " " +
                getGroupDesc() + "\n");
        Iterator songIterator = songComponent.iterator();
        while(songIterator.hasNext()){
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
    
}
