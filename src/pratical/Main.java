package pratical;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ArrayList<Hotel> hotel = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       for( int i=0; i<10; ++i) {
           Hotel h = new Hotel();
           h.inputInfo();
           hotel.add(h);

       }
       System.out.println("Nhap name chu khach san");
       String name;
       name = sc.nextLine();
       for ( Hotel x:hotel){
           x.timHotel(name);
       }
    }
}
