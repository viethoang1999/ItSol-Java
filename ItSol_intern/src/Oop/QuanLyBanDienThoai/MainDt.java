package Oop.QuanLyBanDienThoai;

import java.util.Scanner;

public class MainDt {
    private static int soLuongKhachHang;
    private static KhachHang[] khachHangs;
    private static DienThoai[] dienThoais;
    private static HoaDon[] hoaDons;

    public static void Menu() {
        System.out.println("-----Quản lý bán điện thoại------");
        System.out.println("1.Nhập và in Khách Hàng");
        System.out.println("2.Nhập và in điện thạoi");
        System.out.println("3.Nhập và in danh sách ");
        System.out.println("4.Sắp xếp");
        System.out.println("lập bảng kê tổng số tiền phải trả cho mỗi khách hàng");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            Menu();
            System.out.println("Nhap lua chon cua ban");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    input();
                    output();
                    check = true;
                    break;
                case 2:
                    intputDienThoai();
                    outputDienThoai();
                    break;
                case 3:
                    danhSachMuaHang();
                    break;
                case 4:
                    sapXepKhachHangTheoTen();
                    sepXepSoLuongDienThoai();
                    break;
                case 5:

                    break;
                case 6:
                    System.exit(0);

            }
        } while (check);
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        int khachhang = scanner.nextInt();
        scanner.nextLine();
        khachHangs = new KhachHang[khachhang];
        for (int i = 0; i < khachHangs.length; i++) {
            khachHangs[i] = new KhachHang();
            khachHangs[i].input();
        }
    }

    public static void output() {
        for (int i = 0; i < khachHangs.length; i++) {
            khachHangs[i].output();
        }
    }

    public static void intputDienThoai() {
        Scanner scanner = new Scanner(System.in);
        int dienthoai = scanner.nextInt();
        scanner.nextLine();
        dienThoais = new DienThoai[dienthoai];
        for (int i = 0; i < dienThoais.length; i++) {
            dienThoais[i] = new DienThoai();
            dienThoais[i].input();
        }
    }

    public static void outputDienThoai() {
        for (int i = 0; i < dienThoais.length; i++) {
            dienThoais[i].output();
        }
    }

    public static void danhSachMuaHang() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        hoaDons = new HoaDon[soLuongKhachHang];
        int tong;
        float gia, tongGia;
        for (int i = 0; i < khachHangs.length; i++) {
            tong = 0;
            gia = 0;
            tongGia = 0;
            System.out.println("Nhap so dien thoai ma khach hang " + khachHangs[i].getTen() + " muon mua: ");
            int n;
            do {
                n = scanner.nextInt();
                scanner.nextLine();
                if (n < 0 || n > dienThoais.length) {
                    System.out.println("Nhap lai");
                    check = false;
                }
            } while (!check);
            DienThoai[] dienThoais1 = new DienThoai[n];
            int tongDienThoai = 0;
            for (int j = 0; j < n; j++) {
                System.out.println("Nhap id cho dien thoai thu " + (j + 1) + " ma khach " + khachHangs[i].getTen() + " mua");
                int id;
                do {
                    id = scanner.nextInt();
                    scanner.nextLine();
                    DienThoai dienThoai = timKiem(id);
                    if (dienThoai != null) {
                        System.out.println("Nhap so luong dien thoai loai " + dienThoai.getHangsanxuat());
                        do {
                            tongDienThoai = scanner.nextInt();
                            scanner.nextLine();
                            if (tongDienThoai <= 0) {
                                System.out.println("SO luong dien thoai lon hon khong");
                                check = false;
                            }
                        } while (!check);
                        gia = (float) (tongGia * dienThoais[j].getDongia());
                        tong += tongDienThoai;
                        dienThoais1[j] = dienThoai;
                        break;
                    }
                    System.out.println("Khong co dien thoai nao co id vua nhap");
                } while (true);
            }
            tongGia += gia;
            HoaDon hoaDon = new HoaDon(khachHangs[i], dienThoais1, tongDienThoai);
            hoaDons[i] = hoaDon;
            hoaDons[i].setTong(tong);
            hoaDons[i].setTinhTong(tongGia);
        }
        System.out.println("Danh sach thong ke mua hang: ");
        for (HoaDon hoadon : hoaDons
        ) {
            System.out.println(hoadon);
        }
    }

    public static DienThoai timKiem(int id) {
        for (DienThoai dienthoai : dienThoais
        ) {
            if (dienthoai.getMasp() == id) {
                return dienthoai;
            }
        }
        return null;
    }

    public static void sapXepKhachHangTheoTen() {
        for (int i = 0; i < hoaDons.length; i++) {
            for (int j = i + 1; j < hoaDons.length; j++) {
                if (hoaDons[i].getKhachHang().getTen().compareTo(hoaDons[j].getKhachHang().getTen()) > 0) {
                    HoaDon temp = hoaDons[i];
                    hoaDons[i] = hoaDons[j];
                    hoaDons[j] = temp;
                }
            }
        }
        for (HoaDon hd : hoaDons
        ) {
            System.out.println(hd);
        }
    }

    public static void sepXepSoLuongDienThoai() {
        for (int i = 0; i < hoaDons.length; i++) {
            for (int j = i + 1; j < hoaDons.length; j++) {
                if (hoaDons[i].getTong() < hoaDons[j].getTong()) {
                    HoaDon temp = hoaDons[i];
                    hoaDons[i] = hoaDons[j];
                    hoaDons[j] = temp;
                }
            }
        }
        for (HoaDon hd : hoaDons
        ) {
            System.out.println(hd);
        }
    }

    public static void tongTien() {
        for (int i = 0; i < hoaDons.length; i++) {
            System.out.println("Tinh hoa don: " + hoaDons[i].getKhachHang().getTen());
            System.out.println(hoaDons[i].getTinhTong());
        }
    }


}
