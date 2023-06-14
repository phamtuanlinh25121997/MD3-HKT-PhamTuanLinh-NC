package ra.model;

import java.util.Scanner;

public class Singer {
    private static int count =0 ;
    private int singerId;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;

    public Singer(){
        count++;
        this.singerId =count;
    }
    public static int getSingerId(){
        return singerId;
    }
    public String getSingerName(){
        return singerName;
    }
    public void setSingerName(String singerName){
        this.singerName =singerName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality =nationality;
    }
    public boolean isGender(){
        return gender;
    }
    public void setGender(boolean gender){
        this.gender =gender;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên ca sĩ:");
        singerName = scanner.nextLine();
        System.out.println("Nhập tuổi của ca sĩ:");
        age = scanner.nextInt();
        System.out.println("Nhập quốc tịch của ca sĩ:");
        nationality = scanner.nextLine();
        System.out.println("Nhập giới tính:");
        gender = scanner.nextBoolean();
        System.out.println("Nhập thể loại:");
        genre = scanner.nextLine();
    }
    public void displayData(){
        System.out.println("Mã ca sĩ"+ singerId);
        System.out.println("Tên ca sĩ"+ singerName);
        System.out.println("Tuổi của ca"+age);
        System.out.println("Quốc tịch của ca sĩ"+nationality);
        System.out.println("Giới tính của ca sĩ"+gender);
        System.out.println("Thể loại"+genre);
    }
}
