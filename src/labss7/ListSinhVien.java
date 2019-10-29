package labss7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSinhVien{
    public ArrayList<Sinhvien> ListSV;
    public ListSinhVien() {
        ListSV = new ArrayList<>();
    }
    public void AddSinhVien(Sinhvien s){
        ListSV.add(s);
    }
    public void editSinhVien(int Index, Sinhvien s){
        ListSV.set(Index,s);
    }
    public void deleteSinhVien(int index){
        ListSV.remove(index);
    }
    public void sortByName() {
        Collections.sort(ListSV, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien o1, Sinhvien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Sinhvien p : ListSV){
            p.showInfo();
        }
    }
    public void sortByGpa() {
        Collections.sort(ListSV, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien o1, Sinhvien o2) {
                if(o1.getGpa() > o2.getGpa()) return 1;
                else return -1;
            }
        });
        for (Sinhvien p : ListSV){
            p.showInfo();
        }
    }



}
