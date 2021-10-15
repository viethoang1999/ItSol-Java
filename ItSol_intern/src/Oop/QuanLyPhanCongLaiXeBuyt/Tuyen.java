package Oop.QuanLyPhanCongLaiXeBuyt;

import java.util.Scanner;

public class Tuyen {
    private int maTuyen;
    private float khoangCach;
    private int soDiemDung;
    private static int autoincremient=100;

    public Tuyen(int maTuyen, float khoangCach, int soDiemDung) {
        this.maTuyen = autoincremient++;
        this.khoangCach = khoangCach;
        this.soDiemDung = soDiemDung;
    }
    public Tuyen(){
        this.maTuyen = autoincremient++;
    }

    public int getMaTuyen() {
        return maTuyen;
    }

    public void setMaTuyen(int maTuyen) {
        this.maTuyen = maTuyen;
    }

    public float getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(float khoangCach) {
        this.khoangCach = khoangCach;
    }

    public int getSoDiemDung() {
        return soDiemDung;
    }

    public void setSoDiemDung(int soDiemDung) {
        this.soDiemDung = soDiemDung;
    }
    public void intput(){
        Scanner scanner=new Scanner(System.in);
        this.setMaTuyen(autoincremient++);
        System.out.println("Nhập khaorng cách: ");
        this.khoangCach=scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Nhập số điểm dừng: ");
        this.soDiemDung=scanner.nextInt();
        scanner.nextLine();
    }
    public void output(){
        System.out.println("mã Tuyến: "+this.maTuyen);
        System.out.println("Khoảng cách: "+this.khoangCach);
        System.out.println("Số điểm dừng: "+this.soDiemDung);
    }

    @Override
    public String toString() {
        return "Tuyen{" +
                "maTuyen=" + maTuyen +
                ", khoangCach=" + khoangCach +
                ", soDiemDung=" + soDiemDung +
                '}';
    }
}
