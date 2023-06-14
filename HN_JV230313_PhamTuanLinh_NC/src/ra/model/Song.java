package ra.model;

import java.util.Date;
import java.util.Scanner;

public class Song {
    private static int nextSongId = 1;
    private String songId;
    private String songName;
    private String descriptions;
    private String singer;
    private String songWriter;
    private Date createdDate;
    private boolean songStatus;

    public Song() {
        this.songId = "S" + String.format("%03d", nextSongId++);
        this.createdDate = new Date();
    }

    public String getSongId() {
        return songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getSinger() {
        return singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bài hát");
        songName = scanner.nextLine();
        System.out.println("Nhập mô tả bài hát");
        descriptions = scanner.nextLine();

        // Chọn ca sĩ
        System.out.println("Chọn ca sĩ");
        Singer[] singers = new Singer[0];
        for (Singer singer : singers) {
            System.out.println(Singer.getSingerId() + "." + singer.getSingerName());
        }
        System.out.println("Chọn ca sĩ theo ID");
        int singerId = scanner.nextInt();
        scanner.nextLine();
        singer = String.valueOf(getSingerById(singers, singerId));

        System.out.println("Chọn người sáng tác");
        songWriter = scanner.nextLine();
    }

    private Singer getSingerById(Singer[] singers, int singerId) {
        for (Singer singer : singers) {
            if (singer.getSingerId() == singerId) {
                return singer;
            }
        }
        return null;
    }


    public void displayData() {
        System.out.println("Mã bài hát" + songId);
        System.out.println("Tên bài hát" + songName);
        System.out.println("Mô tả bài hát" + descriptions);
        System.out.println("Ca sĩ hát bài hát" + singer);
        System.out.println("Người sáng tác" + songWriter);
        System.out.println("Ngày tạo" + createdDate);
        System.out.println("Trạng thái" + songStatus);
    }

    public void setSinger(Singer singer) {
    }
}
