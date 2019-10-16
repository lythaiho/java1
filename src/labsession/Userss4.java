package labsession;
import  java.util.Scanner;

public class Userss4 {
    private String ten;
    private int tuoi;
    private int chungMinhNhanDan;


    public  Userss4(){

    }

    public Userss4(String ten, int tuoi, int chungMinhNhanDan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.chungMinhNhanDan = chungMinhNhanDan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getChungMinhNhanDan() {
        return chungMinhNhanDan;
    }

    public void setChungMinhNhanDan(int chungMinhNhanDan) {
        this.chungMinhNhanDan = chungMinhNhanDan;
    }


    public void themUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten");
        ten = sc.nextLine();
        System.out.println("nhap tuoi");
        tuoi =sc.nextInt();
        System.out.println("nhap chung minh nhan dan");
        chungMinhNhanDan = sc.nextInt();
    }
    public void getInfo(){
        System.out.println(this.getTen());
        System.out.println(this.getTuoi());
        System.out.println(this.getChungMinhNhanDan());

    }
}
