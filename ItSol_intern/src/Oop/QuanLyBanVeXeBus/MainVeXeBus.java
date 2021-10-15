package Oop.QuanLyBanVeXeBus;

import java.util.Scanner;

public class MainVeXeBus {
    private static int soHanhKhach;
    private static HanhKhach[] hanhKhachs;
    private static LoaiVe[] loaiVes;
    private static BangKeBanVe[] bangKeBanVes;
    Scanner scanner = new Scanner(System.in);

    public static void Menu() {
        System.out.println("-------Quản lý bán vé xe bus--------");
        System.out.println("1. Nhập và in danh sách hành khách");
        System.out.println("2. Nhập và in danh sách loại vé");
        System.out.println("3. Sắp xếp");
        System.out.println("4. Tính tổng giá tiền phải trả của mỗi khách");
    }

    public static void main(String[] arg) {
        boolean check = true;
        do {
            Menu();
            System.out.println("Nhập sự lựa chọn cửa bạn");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    inputHanhKhach();
                    outputHanhKhach();
                    break;
                case 2:
                    intputLoaiVe();
                    outputLoaiVe();
                    break;
                case 3:
                    danhSachBanVe();
                    break;
                case 4:
                    sepXepTheoHoTenHanhKhach();
                    sapXepTheoLoaiVe();
                    break;
                case 5:
                    tongTienMuaVe();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }

    public static void inputHanhKhach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hành khách: ");
        int hk = scanner.nextInt();
        scanner.nextLine();
        hanhKhachs = new HanhKhach[hk];
        for (int i = 0; i < hanhKhachs.length; i++) {
            hanhKhachs[i] = new HanhKhach();
            hanhKhachs[i].input();
        }

    }

    public static void outputHanhKhach() {
        for (int i = 0; i < hanhKhachs.length; i++) {
            hanhKhachs[i].output();
        }
    }

    public static void intputLoaiVe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHập số lượng vé: ");
        int ve = scanner.nextInt();
        scanner.nextLine();
        loaiVes = new LoaiVe[ve];
        for (int i = 0; i < loaiVes.length; i++) {
            loaiVes[i] = new LoaiVe();
            loaiVes[i].input();
        }
    }

    public static void outputLoaiVe() {
        for (int i = 0; i < loaiVes.length; i++) {
            loaiVes[i].output();
        }
    }

    public static void danhSachBanVe() {
        Scanner scanner = new Scanner(System.in);
        bangKeBanVes = new BangKeBanVe[soHanhKhach];
        float tongGia;
        for (int i = 0; i < bangKeBanVes.length; i++) {
            tongGia = 0;
            int count = 0;
            System.out.println("Thống kê cho hành khách :" + hanhKhachs[i].getHoten());
            System.out.println("Nhập số loại vé hành khách " + hanhKhachs[i].getHoten() + " muốn mua");
            int soLoaiVe = 0;
            boolean check = true;
            do {
                try {
                    soLoaiVe = scanner.nextInt();
                    scanner.nextLine();
                    check = true;
                } catch (Exception e) {
                    System.out.println("Không duoc nhập kí tự ");
                    check = false;
                    continue;
                }
                if (soLoaiVe < 0 || soLoaiVe > loaiVes.length) {
                    System.out.println("Số loại vé khách muốn mua phải lớn hơn 0 và nhỏ hơn tổng loại vé");
                    check = false;
                }
            } while (!check);
            LoaiVe[] loaiVes1 = new LoaiVe[soLoaiVe];
            float gia;
            for (int j = 0; j < soLoaiVe; j++) {
                gia = 0;
                System.out.println("Nhập id của loại vé thứ " + (j + 1) + " mà khách " + hanhKhachs[i].getHoten() + " muốn mua");
                int id;
                do {
                    try {
                        id = scanner.nextInt();
                        scanner.nextLine();
                        check = true;
                    } catch (Exception e) {
                        System.out.println("Không được nhập ký tự khác ngoài số");
                        check = false;
                        continue;
                    }
                    LoaiVe loaiVe = timVe(id);
                    int tong = 0;
                    if (loaiVe != null) {
                        System.out.println("Nhập số lượng vé khách muốn mua của loại vé " + loaiVe.getMoTa());
                        do {
                            try {
                                tong = scanner.nextInt();
                                scanner.nextLine();
                                check = true;
                            } catch (Exception e) {
                                System.out.println("không được nhập ký tự khác ngoài số");
                                check = false;
                                continue;
                            }
                            if (tong != 1) {
                                System.out.println("Số lượng vé mua 1 loại không quá 1");
                                check = false;
                            }
                        } while (!check);
                        gia = (float) (tong * loaiVes[j].getGiaBan());
                        tongGia += gia;
                        loaiVes1[j] = loaiVe;
                        count++;
                        break;
                    }
                    System.out.println("Không có vé có id vừa nhập, nhập lại");
                } while (true);
            }
            BangKeBanVe bangKeBanVe = new BangKeBanVe(hanhKhachs[i], loaiVes1, count);
            bangKeBanVes[i] = bangKeBanVe;
            bangKeBanVes[i].setGiaVe(tongGia);
        }
        for (BangKeBanVe kekhai : bangKeBanVes
        ) {
            System.out.println(kekhai);

        }
    }

    public static LoaiVe timVe(int id) {
        for (LoaiVe loaive : loaiVes
        ) {
            if (loaive.getMaLoai() == id) {
                return loaive;
            }
        }
        return null;
    }

    public static void sepXepTheoHoTenHanhKhach() {
        for (int i = 0; i < bangKeBanVes.length; i++) {
            for (int j = i + 1; j < bangKeBanVes.length; j++) {
                if (bangKeBanVes[i].getHanhKhach().getHoten().compareTo(bangKeBanVes[j].getHanhKhach().getHoten()) > 0) {
                    BangKeBanVe temp = bangKeBanVes[i];
                    bangKeBanVes[i] = bangKeBanVes[j];
                    bangKeBanVes[j] = temp;
                }
            }
        }
        for (BangKeBanVe kekhai : bangKeBanVes
        ) {
            System.out.println(kekhai);
        }
    }

    public static void sapXepTheoLoaiVe() {
        for (int i = 0; i < bangKeBanVes.length; i++) {
            for (int j = 0; j < bangKeBanVes.length; j++) {
                if (bangKeBanVes[i].getSoVe() > bangKeBanVes[j].getSoVe()) {
                    BangKeBanVe temp = bangKeBanVes[i];
                    bangKeBanVes[i] = bangKeBanVes[j];
                    bangKeBanVes[j] = temp;
                }
            }
        }
        for (BangKeBanVe kekhai : bangKeBanVes
        ) {
            System.out.println(kekhai);

        }

    }

    public static void tongTienMuaVe() {
        float gia;
        for (BangKeBanVe kekhai : bangKeBanVes
        ) {
            if (kekhai.getHanhKhach().getLoaiKhachHang().equals(LoaiHanhKhach.HOC_SINH_SINH_VIEN)) {
                gia = kekhai.getGiaVe() * 50 / 100;
            } else if (kekhai.getHanhKhach().getLoaiKhachHang().equals(LoaiHanhKhach.CAN_BO_NGANH)) {
                gia = kekhai.getGiaVe() * 70 / 100;
            } else {
                gia = kekhai.getGiaVe();
            }
            System.out.println(gia);

        }
    }
}
