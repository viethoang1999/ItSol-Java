package Oop.QuanLyTraLuong;

import java.util.Scanner;

public class Nguoi {
    private int ma;
    private String hoten;
    private String diachi;
    private String sdt;
    private static int autocrement = 10000;

    public Nguoi(int ma, String hoten, String diachi, String sdt) {
        this.ma = ma;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public Nguoi() {
        this.ma = autocrement++;
    }


    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập họ tên: ");
        this.hoten=scanner.nextLine();
        System.out.println("Mời bjan nhập địa chỉ: ");
        this.diachi=scanner.nextLine();
        System.out.println("Mời bạn số điện thoại: ");
        this.sdt=scanner.nextLine();

    }
    public void ouput(){
        System.out.println("Mã: "+this.ma);
        System.out.println("Họ tên: "+this.hoten);
        System.out.println("Địa chỉ: "+this.diachi);
        System.out.println("Số điện thoại: "+this.sdt);
    }
}
