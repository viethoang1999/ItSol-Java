package Oop.QuanLyBanDienThoai;

import java.util.Scanner;

public class MainDt {
    private static KhachHang[] khachHangs;
    private static DienThoai[] dienThoais;
    private static HoaDon[] hoaDons;
    public static void Menu(){
        System.out.println("-----Quản lý bán điện thoại------");
        System.out.println("1.Nhập và in Khách Hàng");
        System.out.println("2.Nhập và in điện thạoi");
        System.out.println("3.Nhập và in danh sách ");
        System.out.println("4.Sắp xếp");
        System.out.println("lập bảng kê tổng số tiền phải trả cho mỗi khách hàng");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean check =true;
        do {
            Menu();
            System.out.println("Nhap lua chon cua ban");
            int choose=scanner.nextInt();
            scanner.nextLine();
            switch (choose){
                case 1:
                    input();
                    output();
                    check=true;
                    break;
                case 2:
                    intputDienThoai();
                    outputDienThoai();
                    break;
                case 3:


            }
        }while (check);
    }
    public static void input(){
        Scanner scanner=new Scanner(System.in);
        int khachhang=scanner.nextInt();
        scanner.nextLine();
        khachHangs=new KhachHang[khachhang];
        for (int i = 0; i <khachHangs.length ; i++) {
            khachHangs[i]=new KhachHang();
            khachHangs[i].input();
        }
    }
    public static void output(){
        for(int i=0;i<khachHangs.length;i++){
            khachHangs[i].output();
        }
    }
    public static void intputDienThoai(){
        Scanner scanner=new Scanner(System.in);
        int dienthoai=scanner.nextInt();
        scanner.nextLine();
        dienThoais=new DienThoai[dienthoai];
        for (int i = 0; i < dienThoais.length ; i++) {
            dienThoais[i]=new DienThoai();
            dienThoais[i].input();
        }
    }
    public static void outputDienThoai(){
        for (int i = 0; i < dienThoais.length; i++) {
            dienThoais[i].output();
        }
    }



}
