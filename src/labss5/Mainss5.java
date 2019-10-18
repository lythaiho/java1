package labss5;

public class Mainss5 {
    public static void main(String args[]) {
        Tamgiac t = new Tamgiac();
        int chuvi =t.tinhChuVi();
        System.out.println("Chu vi"+chuvi);
        double dientich = t.tinhDienTich();
        System.out.println("Dientich"+dientich);
        t.checkTamGiac();
    }
}
