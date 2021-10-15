package Oop.QuanLyBanVeXeBus;

import java.util.Scanner;

public class LoaiVe {
    private int maLoai;
    private String moTa;
    private double giaBan;
    private static int autocrement = 10000;

    public LoaiVe(int maLoai, String moTa, double giaBan) {
        this.maLoai = autocrement++;
        this.moTa = moTa;
        this.giaBan = giaBan;
    }

    public LoaiVe() {
        this.maLoai = autocrement++;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        this.setMaLoai(autocrement);
        System.out.println("Nhập Mô Tả: ");
        System.out.println("1.Trái tuyến");
        System.out.println("2.Liên tuyến");
        this.moTa = scanner.nextLine();
        boolean check = true;
        do {
            int type = 0;
            try {
                type = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Nhập số, ko được nhập chữ");
                check = false;
                continue;
            }
            switch (type) {
                case 1:
                    this.setMoTa(MoTa.LIEN_TUYEN);
                    System.out.println("Liên tuyến");
                    break;
                case 2:
                    this.setMoTa(MoTa.TRAI_TUYEN);
                    System.out.println("Trái tuyến");
                    break;
            }
        } while (!check);
        System.out.println("Nhập giá bán: ");
        this.giaBan = scanner.nextDouble();
        scanner.nextLine();
    }

    public void output() {
        System.out.println("Mã loại: " + this.maLoai);
        System.out.println("Mô tả: " + this.moTa);
        System.out.println("Giá bán: " + this.giaBan);
    }
}
