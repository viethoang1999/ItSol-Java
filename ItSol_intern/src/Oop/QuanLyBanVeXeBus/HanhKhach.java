package Oop.QuanLyBanVeXeBus;

import Oop.QuanLyBanHang.LoaiKhachHang;

import java.util.Scanner;

public class HanhKhach extends Nguoi {
    private int maHanhKhach;
    private String loaiKhachHang;
    private static int autoincrement=10000;

    public HanhKhach(String hoten, String diachi, String sdt, int maHanhKhach, String loaiKhachHang) {
        super(hoten, diachi, sdt);
        this.maHanhKhach = autoincrement++;
        this.loaiKhachHang = loaiKhachHang;
    }

    public HanhKhach() {
        this.maHanhKhach = autoincrement++;
    }

    public int getMaHanhKhach() {
        return maHanhKhach;
    }

    public void setMaHanhKhach(int maHanhKhach) {
        this.maHanhKhach = maHanhKhach;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    @Override
    public void input() {
        Scanner scanner=new Scanner(System.in);
        super.input();
        System.out.println("Nhap loai khach hang: ");
        System.out.println("1.Hoc sinh , sinh vien");
        System.out.println("2.Can bo trong nganh ");
        System.out.println("3. Khach hang thong thuong");
        boolean check=true;
        int type=scanner.nextInt();
        scanner.nextLine();
        do {
            switch (type){
                case 1: this.setLoaiKhachHang(LoaiHanhKhach.HOC_SINH_SINH_VIEN);
                    System.out.println("1. Học sinh Sinh viên");
            }
        }while (true);



    }
}
