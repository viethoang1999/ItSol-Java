package Oop.QuanLyBanDienThoai;

import java.util.Arrays;

public class HoaDon {
    private KhachHang khachHang;
    private DienThoai[] dienThoais;
    private int soluong;
    private int tong;

    public HoaDon(KhachHang khachHang, DienThoai[] dienThoais, int soluong) {
        this.khachHang = khachHang;
        this.dienThoais = dienThoais;
        this.soluong = soluong;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public DienThoai[] getDienThoais() {
        return dienThoais;
    }

    public void setDienThoais(DienThoai[] dienThoais) {
        this.dienThoais = dienThoais;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getTong() {
        return tong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "khachHang=" + khachHang +
                ", dienThoais=" + Arrays.toString(dienThoais) +
                ", soluong=" + soluong +
                ", tong=" + tong +
                '}';
    }
}
