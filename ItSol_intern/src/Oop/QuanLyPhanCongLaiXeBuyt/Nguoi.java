package Oop.QuanLyPhanCongLaiXeBuyt;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String diaChi;
    private String sdt;

    public Nguoi(String hoTen, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.diaChi = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        this.sdt = scanner.nextLine();
    }

    public void output() {
        System.out.println("Ho tên: " + this.hoTen);
        System.out.println("Địa chỉ: " + this.diaChi);
        System.out.println("Số điện thoại: " + this.sdt);
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
