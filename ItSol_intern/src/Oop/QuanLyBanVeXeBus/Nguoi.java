package Oop.QuanLyBanVeXeBus;

import java.util.Scanner;

public class Nguoi {
    private String hoten;
    private String diachi;
    private String sdt;

    public Nguoi(String hoten, String diachi, String sdt) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public Nguoi() {
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

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        this.hoten = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diachi = scanner.nextLine();
        System.out.println("Nhap so dien thoai: ");
        this.sdt = scanner.nextLine();
    }

    public void output() {
        System.out.println("Ho ten: " + this.hoten);
        System.out.println("Dia chi: " + this.diachi);
        System.out.println("So dien thoai: " + this.sdt);
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoten='" + hoten + '\'' +
                ", diachi='" + diachi + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
