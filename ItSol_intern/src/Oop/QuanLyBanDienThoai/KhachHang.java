package Oop.QuanLyBanDienThoai;

import java.util.Scanner;

public class KhachHang extends Nguoi {
    private int makhachhang;
    private String nhomkhachhang;
    private static int autocrementId=10000;

    public KhachHang(String ten, String diachi, String sdt, int makhachhang, String nhomkhachhang) {
        super(ten, diachi, sdt);
        this.makhachhang = autocrementId++;
        this.nhomkhachhang = nhomkhachhang;
    }

    public KhachHang() {
        this.makhachhang = autocrementId++;
    }

    public int getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(int makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getNhomkhachhang() {
        return nhomkhachhang;
    }

    public void setNhomkhachhang(String nhomkhachhang) {
        this.nhomkhachhang = nhomkhachhang;
    }

    @Override
    public void input() {
        Scanner scanner=new Scanner(System.in);
        super.input();
        System.out.println("Nhập Nhóm khách hàng: ");
        System.out.println("Mua lẻ");
        System.out.println("Mua buôn");
        System.out.println("Mua qua mạng");
        boolean check =true;
        do {
            int choose=scanner.nextInt();
            scanner.nextLine();
            switch (choose){
                case 1: this.setNhomkhachhang(NhomKhachHang.MUA_LE);
                    System.out.println("Mua lẻ");
                    check=true;
                    break;
                case 2:this.setNhomkhachhang(NhomKhachHang.MUA_BUON);
                    System.out.println("Mua buôn");
                    check=true;
                    break;
                case 3:this.setNhomkhachhang(NhomKhachHang.MUA_QUA_MANG);
                    System.out.println("Mua qua mạng");
                    check=true;
                    break;

            }
        }while (!true);
        KhachHang.autocrementId++;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Mã khách hàng: "+this.makhachhang);
        System.out.println("Nhóm khách hàng: "+this.nhomkhachhang);
    }
}
