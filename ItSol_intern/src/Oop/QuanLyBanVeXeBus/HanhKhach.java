package Oop.QuanLyBanVeXeBus;

import Oop.QuanLyBanHang.LoaiKhachHang;

import java.util.Scanner;

public class HanhKhach extends Nguoi {
    private int maHanhKhach;
    private String loaiKhachHang;
    private static int autoincrement = 10000;

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
        Scanner scanner = new Scanner(System.in);
        this.setMaHanhKhach(autoincrement);
        super.input();
        System.out.println("Nhap loai khach hang: ");
        System.out.println("1.Hoc sinh , sinh vien");
        System.out.println("2.Can bo trong nganh ");
        System.out.println("3. Khach hang thong thuong");
        System.out.println("Chọn loại khách hàng: ");
        this.loaiKhachHang = scanner.nextLine();
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
                    this.setLoaiKhachHang(LoaiHanhKhach.HOC_SINH_SINH_VIEN);
                    System.out.println("1. Học sinh Sinh viên");
                    break;
                case 2:
                    this.setLoaiKhachHang(LoaiHanhKhach.CAN_BO_NGANH);
                    System.out.println("2.Cán bộ ngành");
                    break;
                case 3:
                    this.setLoaiKhachHang(LoaiHanhKhach.KHACH_BINH_THUONG);
                    System.out.println("3.Khách bình thường");
                    break;
            }
        } while (!check);


    }

    @Override
    public void output() {
        System.out.println("Mã khách: " + maHanhKhach);
        super.output();
        System.out.println("Loại khách hàng: " + this.loaiKhachHang);

    }

    @Override
    public String toString() {
        return super.toString() + "HanhKhach{" +
                "maHanhKhach=" + maHanhKhach +
                ", loaiKhachHang='" + loaiKhachHang + '\'' +
                '}';
    }
}
