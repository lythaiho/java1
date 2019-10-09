package session3;
import java.util.Scanner;

public class Hdsession3 {
    public String name;
    public  int  age;
    public static String abc="good";
    public String getName() {
        return name;
    }
    public Hdsession3() {
        inputInfo();
        showInfo();
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
    public void showInfo() {
        System.out.println("Full name"+name);
//        System.out.println("Full name"+this.name);
        System.out.println("Tuoi"+age);
        System.out.println(Hdsession3.abc);

    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        setName(sc.nextLine());
        System.out.println("Nhap tuoi: ");
        setAge(sc.nextInt());
    }

    public static void main(String args[]){
        Hdsession3 ss2 = new Hdsession3();
//        ss2.inputInfo();
//        ss2.showInfo();
        Hdsession3 ss3 = new Hdsession3();
//        ss3.inputInfo();
//        ss3.showInfo();
//        sayHello();
        System.out.println("So sanh");
        System.out.println("SS2 name" + ss2.getName());
        System.out.println("SS3 name" + ss3.getName());
        System.out.println("So sanh");
        System.out.println("SS2 name" + ss2.getAge());
        System.out.println("SS3 name" + ss3.getAge());
    }
//    public  static void sayHello(){
//        Hdsession3 ss4= new Hdsession3();
//        ss4.showInfo();
//        //        System.out.println("Full name"+name);
//        System.out.println("Hello world!");
//        System.out.println(abc);
//    }
}
