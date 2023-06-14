package ra.controller;

import ra.model.Singer;
import ra.service.SingerService;

public class SingerController {
    private SingerService singerService;
    public SingerController(){
        this.singerService = new SingerService();
    }
    public void addSinger(Singer singer){
        singerService.addSinger(singer);
    }
    public void updateSinger(int singerId, Singer updateSinger){
        singerService.updateSinger(singerId,updateSinger);
    }
    public void deleteSinger(int singerId){
        singerService.deleteSinger(singerId);
    }
    public void displayAllSingers(){
        singerService.displayAllSingers();
    }
}
