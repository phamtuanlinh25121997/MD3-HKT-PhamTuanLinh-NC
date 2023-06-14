package ra.service;

import ra.model.Singer;

public class SingerService {
    private Singer[] singers;
    private int singerCount;
    
    public void addSinger(Singer singer) {
        singers[singerCount] = singer;
        singerCount++;
    }

    public void deleteSinger(int singerId) {
        for (int i = 0; i < singerCount; i++) {
            if (singers[i].getSingerId() == singerId) {
                for (int j = 1; j < singerCount - 1; j++) {
                    singers[j] = singers[j + 1];
                }
                singers[singerCount - 1] = null;
                singerCount--;
                break;
            }
        }
    }
    public Singer[] getAllSingers(){
        return singers;
    }
    public Singer getSingerById(int singerId){
        for (int i=0; i< singerCount;i++){
            if (singers[i].getSingerId()== singerId){
                return singers[i];
            }
        }
        return null;
    }

    public void updateSinger(int singerId, Singer updateSinger) {
    }

    public void displayAllSingers() {
    }
}