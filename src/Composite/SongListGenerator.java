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
public class SongListGenerator {
    public static void main(String[] args){
        SongComponent industriaMusic = new SongGroup("Industrial Music", "is a style of an experimental music that draws on tarnsgressive and provoactive themes.");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Meta Music", "is a genre of Rock that developed in late 1960s, largely in the UK and the US.");
        SongComponent dubStepMusic = new SongGroup("DubStep Music", "is a genre of an electtronic dance music, that orginated in south London, England");
        SongComponent everySong = new SongGroup("Songs List", "every song available");
        everySong.addSongComp(industriaMusic);
        industriaMusic.addSongComp(new Song("Head like a hole", "NIN", 1990));
        industriaMusic.addSongComp(new Song("Headhunter", "Front 242", 1988));
        dubStepMusic.addSongComp(new Song("centiPede", "knife party", 2012));
        industriaMusic.addSongComp(dubStepMusic);
        dubStepMusic.addSongComp(new Song("Tetris", "Doctor P", 2011));
        everySong.addSongComp(heavyMetalMusic);
        heavyMetalMusic.addSongComp(new Song("war pig", "Black sabath", 1970));
        heavyMetalMusic.addSongComp(new Song("Ace of spades", "Mtorhead", 1980));
        Disc crazyLarry = new Disc(everySong);
        crazyLarry.getSongList();
    }
}
