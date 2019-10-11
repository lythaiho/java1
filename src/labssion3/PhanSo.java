package labssion3;

import java.util.Scanner;

public class PhanSo {

    private int tuSo;
    private int mauSo;


    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        while (mauSo == 0) {
            System.out.println("Nhap mau so tu ban phim");
            Scanner in = new Scanner(System.in);
            mauSo = in.nextInt();
        }
        this.mauSo = mauSo;
    }

    public void nhapPhanSo() {
        System.out.println("Nhap Tu So");
        Scanner sc = new Scanner(System.in);
        int tuSo = sc.nextInt();
        int mauSo = sc.nextInt();
        this.setTuSo(tuSo);
        this.setMauSo(mauSo);
    }

    public void phanSo() {
        System.out.println("Phan So" + this.getTuSo() + "/" + this.getMauSo());
    }

    public int uocChungLonNhat(int a, int b) {
        if( a % b != 0) {
            return uocChungLonNhat(b, a % b);
        } else {
            return b;
        }
    }
    public PhanSo rutGonPhanSo() {
        int uocChung = uocChungLonNhat(tuSo,mauSo);
        PhanSo t = new PhanSo();
        t.tuSo=tuSo/uocChung;
        t.mauSo=mauSo/uocChung;
        return t;
    }
    public PhanSo nghichDaoPhanSo(){
        PhanSo nghichdao =new PhanSo();
        nghichdao.tuSo= mauSo;
        nghichdao.mauSo=tuSo;
        return nghichdao;
    }
}
