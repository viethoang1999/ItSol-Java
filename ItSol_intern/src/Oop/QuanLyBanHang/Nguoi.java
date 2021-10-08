package Oop.QuanLyBanHang;

import java.util.Scanner;

public class Nguoi {
    private int ma;
    private String  hoten;
    private String diachi;
    private String sdt;
    private static int autocrement=10000;

    public Nguoi() {
        this.ma = autocrement++;
    }

    public Nguoi(int ma, String hoten, String diachi, String sdt) {
        this.ma = autocrement++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
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
    public  void input(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập Họ tên: ");
        this.hoten=scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.diachi=scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        this.sdt=scanner.nextLine();
    }
    public void output(){
        System.out.println("Mã nhân viên: "+this.ma);
        System.out.println("Họ tên: "+this.hoten);
        System.out.println("Địa chỉ: "+this.diachi);
        System.out.println("Số điện thoại: "+this.sdt);
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ma=" + ma +
                ", hoten='" + hoten + '\'' +
                ", diachi='" + diachi + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }


}
