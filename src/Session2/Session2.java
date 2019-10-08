package Session2;
import  java.util.Scanner;

public class Session2 {
    public static void main(String args[]) {
        int n;
        int a;
        System.out.println("Nhap so N tu ban phim");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n<=2) {
            System.out.println("Khong co so nguyen to nho hon no");
        }
        for ( int i=2; i<n ; i++ ) {
            a = 0;
            for (int z=2; z<=i ; z++) {
                if(i % z == 0) {
                    a=a+1;
                }
            }
            if(a==1) {
                System.out.println("so nguyen to nho hon la :" +i);
            }
        }
    }
}
