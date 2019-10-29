package labss7;

import java.util.Scanner;

public class Sinhvien {
    public int iD;
    public String name;
    public int age;
    public String address;
    public float gpa;

    public Sinhvien(){

    }

    public Sinhvien(int iD, String name, int age, String address, float gpa) {
        this.iD = iD;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public void inputInfo(){
        Sinhvien sv = new Sinhvien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Id");
        sv.setiD(sc.nextInt());
        System.out.println("Nhap Name");
        sv.setName(sc.nextLine());
        sc.nextLine();
        System.out.println("Nhap Age");
        sv.setAge(sc.nextInt());
        System.out.println("Nhap Address");
        sv.setAddress(sc.nextLine());
        System.out.println("Nhap Gpa");
        sv.setGpa(sc.nextInt());
    }
    public void showInfo(){
        System.out.println(this.getiD());
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getAddress());
        System.out.println(this.getGpa());
    }

}

