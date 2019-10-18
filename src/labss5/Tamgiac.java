package labss5;
import java.util.Scanner;
public class Tamgiac {
    protected int a;
    protected int b;
    protected int c;



    public Tamgiac() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        this.a = sc.nextInt();
        System.out.println("Nhap b");
        this.b = sc.nextInt();
        System.out.println("Nhap c");
        this.c = sc.nextInt();
    }

    public Tamgiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int tinhChuVi() {
        return this.a + this.b + this.c;
    }

    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }
    public void checkTamGiac(){
        if(isTamGiacDeu()){
            System.out.println("day la lam giac deu");
        }else if (isTamGiacVuong()){
            System.out.println("day la lam giac Vuong");
        }else if (isTamGiacCan()){
            System.out.println("day la lam giac Can");
        }else {
            System.out.println("day la lam giac thuong");
        }
    }

    public boolean isTamGiacVuong() {
        if ((Math.pow(this.a, 2) + Math.pow(this.b, 2) == Math.pow(this.c, 2)) ||
                (Math.pow(this.b, 2) + Math.pow(this.c, 2) == Math.pow(this.a, 2)) ||
                (Math.pow(this.a, 2) + Math.pow(this.c, 2) == Math.pow(this.b, 2))) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isTamGiacCan(){
        if(this.a==this.b||this.a==this.c||this.b==this.c){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isTamGiacDeu(){
        if(this.a == this.b && this.b == this.c && this.c == this.a ){
            return true;
        }else {
            return false;
        }
    }
}
