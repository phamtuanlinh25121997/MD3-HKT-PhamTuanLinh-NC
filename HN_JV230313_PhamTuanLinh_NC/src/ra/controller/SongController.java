package ra.controller;

import ra.model.Song;
import ra.service.SongService;

public class SongController {
    private final SongService songService;
    public SongController(){
        this.songService = new SongService();
    }
    public void addSong(Song song){
        songService.addSong(song);
    }
    public void updateSong(String songId, Song updateSong){
        songService.updateSong(songId,updateSong);
    }
    public void deleteSong(String songId){
        songService.deleteSong(songId);
    }
    public void displayAllSongs(){
        songService.displayAllSongs();
    }
}
