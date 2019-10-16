package labsession;

import  java.util.ArrayList;

public class Roomss4 {
    private String tenPhong;
    private String viTri;
    private ArrayList<Userss4> danhSachUser;
    public Roomss4(){
        danhSachUser= new ArrayList<Userss4>();
    }

    public Roomss4(String tenPhong, String viTri, ArrayList<Userss4> danhSachUser) {
        this.tenPhong = tenPhong;
        this.viTri = viTri;
        this.danhSachUser = danhSachUser;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public ArrayList<Userss4> getDanhSachUser() {
        return danhSachUser;
    }

    public void setDanhSachUser(ArrayList<Userss4> danhSachUser) {
        this.danhSachUser = danhSachUser;
    }

    public void ThemUser(){
        Userss4 Userss4 =new Userss4();
        Userss4.themUser();
        this.danhSachUser.add(Userss4);
    }

    public  void xoaUser(int x){
        this.danhSachUser.remove(x);
    }

    public void Showinfo() {
        System.out.println("ten phong: "+this.getTenPhong());
        System.out.println("vi tri: " +this.getViTri());
        for (Userss4 u : danhSachUser){
            u.getInfo();
        }
    }

}
