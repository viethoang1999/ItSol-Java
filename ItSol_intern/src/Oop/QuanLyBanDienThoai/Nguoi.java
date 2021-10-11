package Oop.QuanLyBanDienThoai;

import java.util.Scanner;

public abstract class Nguoi {
    private String ten;
    private String diachi;
    private String sdt;

    public Nguoi(String ten, String diachi, String sdt) {
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public Nguoi() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
        System.out.println("Nhập Ten: ");
        this.ten=scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.diachi=scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        this.sdt=scanner.nextLine();
    }
    public void output(){
        System.out.println("Tên: "+this.ten);
        System.out.println("Địa chỉ: "+this.diachi);
        System.out.println("Số điện thoại: "+this.sdt);
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", diachi='" + diachi + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
