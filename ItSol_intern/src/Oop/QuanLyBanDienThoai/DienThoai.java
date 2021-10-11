package Oop.QuanLyBanDienThoai;

import java.util.Scanner;

public class DienThoai {
   private int masp;
   private String hangsanxuat;
   private String model;
   private double dongia;

   private static int autocrementId=10000;

    public DienThoai(int masp, String hangsanxuat, String model, double dongia) {
        this.masp = masp;
        this.hangsanxuat = hangsanxuat;
        this.model = model;
        this.dongia = dongia;
    }

    public DienThoai() {
        this.masp=autocrementId++;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập hãng sản xuất: ");
        this.hangsanxuat=scanner.nextLine();
        System.out.println("Nhập model: ");
        this.model=scanner.nextLine();
        System.out.println("Nhập đơn giá");
        this.dongia=scanner.nextDouble();
        scanner.nextLine();
    }
    public void output(){
        System.out.println("mã sp: "+this.masp);
        System.out.println("Hãng sản xuất: "+this.hangsanxuat);
        System.out.println("model: "+this.model);
        System.out.println("Nhập đơn giá: "+this.dongia);
    }
}
