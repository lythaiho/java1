package labss6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        News n = new News();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ID");
        n.setID(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Title");
        n.setTitle(sc.nextLine());
        System.out.println("Nhap PublishDate");
        n.setPublishDate(sc.nextLine());
        System.out.println("Nhap Author");
        n.setAuthor(sc.nextLine());
        System.out.println("Nhap Content");
        n.setContent(sc.nextLine());
        for ( int i=0 ; i<n.RateList.length;++i) {
            n.RateList[i]=sc.nextInt();
        }
        n.Display();
        n.Calculate();
        n.Display();
    }
}
