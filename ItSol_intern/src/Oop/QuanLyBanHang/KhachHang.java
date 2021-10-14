package Oop.QuanLyBanHang;

import java.util.Scanner;

public class KhachHang extends Nguoi {
    private String loaikhachhang;

    public KhachHang() {
    }

    public KhachHang(int ma, String hoten, String diachi, String sdt, String loaikhachhang) {
        super(ma, hoten, diachi, sdt);
        this.loaikhachhang = loaikhachhang;
    }

    public String getLoaikhachhang() {
        return loaikhachhang;
    }

    public void setLoaikhachhang(String loaikhachhang) {
        this.loaikhachhang = loaikhachhang;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        this.loaikhachhang = scanner.nextLine();
        System.out.println("Nhập loại khách hàng: ");
        System.out.println("Mua lẻ: ");
        System.out.println("Mua buôn");
        boolean check = true;
        do {
            System.out.println("Hãy chọn loại bạn đọc");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 1:
                    this.setLoaikhachhang(LoaiKhachHang.MUA_LE);
                    System.out.println("Mua lẻ");
                    check = true;
                    break;
                case 2:
                    this.setLoaikhachhang(LoaiKhachHang.MUA_BUON);
                    System.out.println("Mua buôn");
                    check = true;
                    break;
                default:
                    System.out.println("Nhập lại");
                    check = false;
                    break;
            }
        } while (!check);

    }

    @Override
    public void output() {
        super.output();
        System.out.println("Loại buôn bán: " + this.loaikhachhang);
    }
}
