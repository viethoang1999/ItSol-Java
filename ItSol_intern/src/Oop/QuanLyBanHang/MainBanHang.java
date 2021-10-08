package Oop.QuanLyBanHang;

import java.util.Scanner;

public class MainBanHang {
    private static KhachHang[] khachHangs;
    private static MatHang[] matHangs;
    private static DanhSachMuaHang[] danhSachMuaHangs;

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------Ban Hang Sieu Thi------------");
        System.out.println("1.Nhập danh sách mặt hàng mới. in ra danh sách mặt hàng đã có ");
        System.out.println("2.Nhập danh sách khách hàng, in ra danh sách khách hàng đã có");
        System.out.println("3.Lập danh sách mua hàng");
        System.out.println("4.Sắp xếp danh sách Bảng danh sách mua hàng");
        System.out.println("5.Lạp hóa đơn cho mõi khách hàng");

    }

    public static void main(String[] args) {
        boolean check = true;
        do {
            menu();
            System.out.println("Chọn việc bạn muốn thực hiện");
            int number = new Scanner(System.in).nextInt();
            switch (number) {

                case 1:
                    inputMatHang();
                    outputMatHang();
                    check=true;
                    break;
                case 2:
                    inputKhachHang();
                    outputKhachHang();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
            }
        } while (!check);

    }

    public static void inputMatHang() {
        System.out.println("Nhập số mặt hàng mới: ");
        int hang = new Scanner(System.in).nextInt();
        matHangs = new MatHang[hang];
        for (int i = 0; i < matHangs.length; i++) {
            matHangs[i] = new MatHang();
            matHangs[i].input();
        }

    }
    public static void outputMatHang(){
        for (int i = 0; i < matHangs.length ; i++) {
            matHangs[i].output();
        }
    }
    public static void inputKhachHang(){
        System.out.println("Nhập số khách hàng: ");
        int khachHang=new Scanner(System.in).nextInt();
        khachHangs=new KhachHang[khachHang];
        for (int i = 0; i < khachHangs.length ; i++) {
            khachHangs[i]=new KhachHang();
            khachHangs[i].input();
        }
    }
    public static void outputKhachHang(){
        for (int i = 0; i < khachHangs.length; i++) {
            khachHangs[i].output();
        };
    }

}
