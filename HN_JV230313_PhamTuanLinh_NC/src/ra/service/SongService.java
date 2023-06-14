package ra.service;

import ra.model.Song;

public class SongService {
    private Song[] songs;
    private int songCount;
    
    public void addSong(Song song) {
        for (int i = 0; i < songCount; i++) {
            if (songs[i].getSongId().equals(song.getSongId())) {
                songs[i] = song;
                break;
            }
        }
    }

    public void deleteSong(String songId) {
        for (int i = 0; i < songCount; i++) {
            if (songs[i].getSongId().equals(songId)) {
                for (int j = 1; j < songCount - 1; j++) {
                    songs[j] = songs[j + 1];
                }
                songs[songCount - 1] = null;
                songCount--;
                break;
            }
        }
    }
    public Song[] getAllSongs(){
        return songs;
    }
    public Song getSongById(String songId){
        for (int i = 0; i< songCount;i++){
            if(songs[i].getSongId().equals(songId)){
                return songs[i];
            }
        }
        return null;
    }

    public void updateSong(String songId, Song updateSong) {
    }

    public void displayAllSongs() {
    }
}
