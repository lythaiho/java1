package session5;

import java.util.Scanner;

public class Tamgiac {
    private int a;
    private int b;
    private int c;

    public Tamgiac() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap a");
            this.a = sc.nextInt();
            System.out.println("Nhap b");
            this.b = sc.nextInt();
            System.out.println("Nhap c");
            this.c = sc.nextInt();
            if (!CheckTamGiac(this.a, this.b, this.c)) {
                System.out.println("Nhap lai tam giac a,b,c");
            }
        } while (!CheckTamGiac(this.a, this.b, this.c));

    }

    public int Tinhchuvi() {
        return this.a + this.b + this.c;
    }

    public double Tinhdientich() {
        int p = Tinhchuvi() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public Boolean CheckTamGiac(int a, int b, int c) {
        if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
            return false;
        } else return true;

    }

}
