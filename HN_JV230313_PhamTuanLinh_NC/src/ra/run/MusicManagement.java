package ra.run;

import ra.controller.SingerController;
import ra.controller.SongController;
import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

public class MusicManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SingerController singerController = new SingerController();
        SongController songController = new SongController();
        while (true) {
            System.out.println("************************MUSIC-MANAGEMENT*************************");
            System.out.println("1. Quản lý ca sĩ");
            System.out.println("2. Quản lý bài hát");
            System.out.println("3. Tìm kiếm bài hát");
            System.out.println("4. Thoát");
            System.out.println("Chọn 1: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    singerManagement(scanner, singerController);
                    break;
                case 2:
                    songManagement(scanner, singerController, songController);
                    break;
                case 3:
                    searchManagement(scanner, songController);
                    break;
                case 4:
                    System.out.println("Thoát khỏi chương trình");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void singerManagement(Scanner scanner, SingerController singerController) {
        while (true) {
            System.out.println("**********************SINGER-MANAGEMENT*************************");
            System.out.println("1. Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2. Hiển thị danh sách tất cả ca sĩ đã lưu trữ");
            System.out.println("3. Thay đổi thông tin ca sĩ theo mã id");
            System.out.println("4. Xóa ca sĩ theo mã id");
            System.out.println("5. Thoát");
            System.out.println("Chọn 2: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng ca sĩ cần thêm: ");
                    int singerCount = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < singerCount; i++) {
                        Singer singer = new Singer();
                        singer.inputData();
                        singerController.addSinger(singer);
                    }
                    break;
                case 2:
                    singerController.displayAllSingers();
                    break;
                case 3:
                    System.out.println("Nhập mã id của ca sĩ cần cập nhật: ");
                    int singerId = scanner.nextInt();
                    scanner.nextLine();
                    Singer updatedSinger = new Singer();
                    updatedSinger.inputData();
                    singerController.updateSinger(singerId, updatedSinger);
                    break;
                case 4:
                    System.out.println("Nhập mã id của ca sĩ cần xóa: ");
                    int deleteSingerId = scanner.nextInt();
                    scanner.nextLine();
                    singerController.deleteSinger(deleteSingerId);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void songManagement(Scanner scanner, SingerController singerController, SongController songController) {
        while (true) {
            System.out.println("**********************SONG-MANAGEMENT*************************");
            System.out.println("1. Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2. Hiển thị danh sách tất cả bài hát đã lưu trữ");
            System.out.println("3. Thay đổi thông tin bài hát theo mã id");
            System.out.println("4. Xóa bài hát theo mã id");
            System.out.println("5. Thoát");
            System.out.println("Chọn 2: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng bài hát cần thêm: ");
                    int songCount = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < songCount; i++) {
                        Song song = new Song();
                        song.inputData();
                        System.out.println("Nhập mã id của ca sĩ biểu diễn: ");
                        int singerId = scanner.nextInt();
                        scanner.nextLine();
                        Singer singer = findSingerById(singerController, singerId);
                        if (singer != null){
                            song.setSinger(singer);
                            songController.addSong(song);
                        }else {
                            System.out.println("Không tìm thấy ca sĩ với mã id đã nhập.");
                        }
                    }
                    break;
                case 2:
                    songController.displayAllSongs();
                    break;
                case 3:
                    System.out.print("Nhập mã id của bài hát cần cập nhật: ");
                    String songId = scanner.nextLine();

                    // Nhập thông tin cập nhật của bài hát
                    Song updatedSong = new Song();
                    updatedSong.inputData();

                    songController.updateSong(songId, updatedSong);
                    break;
                case 4:
                    System.out.print("Nhập mã id của bài hát cần xóa: ");
                    String deleteSongId = scanner.nextLine();

                    songController.deleteSong(deleteSongId);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
    private static void searchManagement(Scanner scanner, SongController songController) {
        // Tìm kiếm bài hát theo các tiêu chí (tên bài hát, tên ca sĩ, thể loại, ngày phát hành, ...)
    }
    private static Singer findSingerById(SingerController singerController, int singerId) {
        return null;
    }
}
