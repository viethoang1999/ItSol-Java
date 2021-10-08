package Oop.QuanLyTraLuong;

import java.util.Scanner;

public class MonHoc {
    private int mamonhoc;
    private String tenmon;
    private int tongsotiet;
    private int sotietlythuyet;
    private float muckinhphi;
    private static int autocrement= 100;

    public MonHoc(int mamonhoc, String tenmon, int tongsotiet, int sotietlythuyet, float muckinhphi) {
        this.mamonhoc = mamonhoc;
        this.tenmon = tenmon;
        this.tongsotiet = tongsotiet;
        this.sotietlythuyet = sotietlythuyet;
        this.muckinhphi = muckinhphi;
    }

    public MonHoc() {
        this.mamonhoc=autocrement++;
    }

    public int getMamonhoc() {
        return mamonhoc;
    }

    public void setMamonhoc(int mamonhoc) {
        this.mamonhoc = mamonhoc;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getTongsotiet() {
        return tongsotiet;
    }

    public void setTongsotiet(int tongsotiet) {
        this.tongsotiet = tongsotiet;
    }

    public int getSotietlythuyet() {
        return sotietlythuyet;
    }

    public void setSotietlythuyet(int sotietlythuyet) {
        this.sotietlythuyet = sotietlythuyet;
    }

    public float getMuckinhphi() {
        return muckinhphi;
    }

    public void setMuckinhphi(float muckinhphi) {
        this.muckinhphi = muckinhphi;
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập Tên môn: ");
        this.tenmon=scanner.nextLine();
        System.out.println("Nhập tổng số tiết: ");
        this.tongsotiet= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập số tiết lý thuyết: ");
        this.sotietlythuyet= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhaajo mức kinh phí: ");
        this.muckinhphi=scanner.nextInt();
        scanner.nextLine();
    }
    public void output(){
        System.out.println("Mã môn học: "+this.mamonhoc);
        System.out.println("Tên môn học: "+this.tenmon);
        System.out.println("Tổng số tiết: "+this.tongsotiet);
        System.out.println("Số tiết lý thuyết: "+this.sotietlythuyet);
        System.out.println("Mức kinh phí: "+this.muckinhphi);
    }
}
