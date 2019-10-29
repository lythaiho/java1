package labss7;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sl;
        ListSinhVien l= new ListSinhVien();
        while (true){
            Scanner sc = new Scanner(System.in);
            menu();
            sl = sc.nextInt();
            switch (sl){
                case 1:{
                    Sinhvien sv = new Sinhvien();
                    sv.inputInfo();
                    l.AddSinhVien(sv);
                    break;
                }
                case 2: {
                    Sinhvien sv = new Sinhvien();
                    sv.inputInfo();
                    int id = sc.nextInt();

                    for (int i=0 ; i<l.ListSV.size();++i){
                        if(id==l.ListSV.get(i).getiD()){
                            l.editSinhVien(i,sv);
                        }
                    }
                    break;
                }
                case 3: {
                    int id = sc.nextInt();

                    for (int i=0 ; i<l.ListSV.size();++i){
                        if(id==l.ListSV.get(i).getiD()){
                            l.deleteSinhVien(i);
                        }
                    }
                    break;
                }
                case 4:{
                    l.sortByGpa();
                    break;
                }
                case 5:{
                    l.sortByName();
                    break;
                }
                case 6:{
                    for(Sinhvien sv: l.ListSV){
                        sv.showInfo();
                    }
                    break;
                }
            }

        }

    }
    public static void menu() {
        System.out.println("-----Menu----");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student");
        System.out.println("0. Exit.");

    }
}
