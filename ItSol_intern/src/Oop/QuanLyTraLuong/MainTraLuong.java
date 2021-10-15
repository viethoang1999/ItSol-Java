package Oop.QuanLyTraLuong;

import java.util.Scanner;

public class MainTraLuong {
    private static GiangVien[] giangViens;
    private static MonHoc[] monHocs;
    private static BangKeKhaiGiangDay[] bangKeKhaiGiangDays;

    public static void Menu() {
        System.out.println("-----Quản lý trả lương cho giảng viên thỉnh giảng------");
        System.out.println("1.Nhập và in danh sách môn học");
        System.out.println("2.Nhập và in danh sách giảnh viên");
        System.out.println("3.Lập bảng kê khai");
        System.out.println("4.Sắp xếp");
        System.out.println("5.Tính toán và lập bảng tính công cho nhân viên");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            Menu();
            System.out.println("Nhập sự lựa chọn của bạn");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 1:
                    inputMonHoc();
                    outputMonHoc();
                    check = true;
                    break;
                case 2:
                    intputGiangVien();
                    outputGiangVien();
                    break;
                case 3:
                    traLuong();
                    danhSachGiangDay();
                    break;
                case 4:
                    sapXepTheoGiangVienDayMoiMon();
                    sapXepTheoTenGiangVien();
                    break;
                case 5:
                    tinhCongGiangVien();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (check);

    }

    public static void inputMonHoc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số môn học: ");
        int monhoc = scanner.nextInt();
        scanner.nextLine();
        monHocs = new MonHoc[monhoc];
        for (int i = 0; i < monHocs.length; i++) {
            monHocs[i] = new MonHoc();
            monHocs[i].input();
        }

    }

    public static void outputMonHoc() {
        for (int i = 0; i < monHocs.length; i++) {
            monHocs[i].output();
        }
    }

    public static void intputGiangVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số giảng viên: ");
        int giangvien = scanner.nextInt();
        scanner.nextLine();
        giangViens = new GiangVien[giangvien];
        for (int i = 0; i < giangViens.length; i++) {
            giangViens[i] = new GiangVien();
            giangViens[i].input();
        }
    }

    public static void outputGiangVien() {
        for (int i = 0; i < giangViens.length; i++) {
            giangViens[i].ouput();
        }
    }

    public static void traLuong() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        int soGiaoVien = scanner.nextInt();
        scanner.nextLine();
        giangViens = new GiangVien[soGiaoVien];
        int tong;
        for (int i = 0; i < giangViens.length; i++) {
            tong = 0;
            System.out.println("Kee khai cho giarng vieen: " + giangViens[i].getHoten());
            System.out.println("Nhap so mon hoc ma giang vian day: " + monHocs[i].getTenmon());
            int soMonHoc;
            do {
                soMonHoc = scanner.nextInt();
                scanner.nextLine();
                if (soMonHoc <= 0 || soMonHoc > monHocs.length) {
                    System.out.println("Số môn học giảng viên dạy phải lớn hơn 0 và nhỏ hơn tổng số môn: ");
                    check = false;
                }
            } while (!check);
            MonHoc[] monHocsList = new MonHoc[soMonHoc];
            int[] tongSoLopHoc = new int[soMonHoc];
            do {
                for (int j = 0; j < soMonHoc; j++) {
                    int tong1 = 0;
                    System.out.println("Nhập id môn thứ " + (j + 1) + " mà giảng viên " + giangViens[i].getHoten() + " dạy: ");
                    int maMonHoc;
                    int tongLop = 0;
                    do {
                        maMonHoc = scanner.nextInt();
                        MonHoc monHoc = timMaMonHoc(maMonHoc);
                        if (monHoc != null) {
                            System.out.println("Nhập sô lớp của môn thứ: " + (j + 1) + " mà giảng viên dạy " + giangViens[i].getHoten() + " dạy: ");
                            do {
                                tongLop = scanner.nextInt();
                                if (tongLop <= 0 || tongLop > 3) {
                                    System.out.println("Số lớp phải lớn hơn 3 và nhỏ hơn 0");
                                    check = false;
                                }
                            } while (!check);
                            tong1 += monHocs[j].getTongsotiet() * tongLop;
                            if (tong1 > 200) {
                                System.out.println("Tông số tiết học không quá 200: ");
                                check = false;
                                break;
                            } else check = true;
                            int soTietThucHanh = monHoc.getTongsotiet() - monHoc.getSotietlythuyet();
                            float luong = monHoc.getMuckinhphi() * monHoc.getSotietlythuyet() + soTietThucHanh;
                            giangViens[j].setLuong(luong);
                            tong += tong1;
                            monHocsList[j] = monHoc;
                            tongSoLopHoc[j] = tongLop;
                            break;
                        } else
                            System.out.println("Không có id môn học vừa nhập");
                    } while (true);
                }
            } while (!check);
            BangKeKhaiGiangDay bangKeKhaiGiangDay = new BangKeKhaiGiangDay(giangViens[i], monHocsList, tongSoLopHoc);
            bangKeKhaiGiangDays[i] = bangKeKhaiGiangDay;
            bangKeKhaiGiangDays[i].setTongmonhoc(tong);
        }
    }

    public static void danhSachGiangDay() {
        for (BangKeKhaiGiangDay bangKeKhaiGiangDay : bangKeKhaiGiangDays) {
            System.out.println(bangKeKhaiGiangDay);
        }
    }

    public static MonHoc timMaMonHoc(int maMonHoc) {
        for (MonHoc monhoc : monHocs
        ) {
            if (monhoc.getMamonhoc() == maMonHoc) {
                return monhoc;
            }

        }
        return null;
    }

    public static void sapXepTheoGiangVienDayMoiMon() {
        for (int i = 0; i < bangKeKhaiGiangDays.length; i++) {
            for (int j = 0; j < bangKeKhaiGiangDays[i].getMonHocs().length; j++) {
                for (int k = 0; k < bangKeKhaiGiangDays[i].getMonHocs().length; k++) {
                    if (monHocs[j].getTongsotiet() < monHocs[k].getTongsotiet()) {
                        MonHoc temp = monHocs[j];
                        monHocs[j] = monHocs[k];
                        monHocs[k] = temp;
                    }
                }

            }
            for (int j = i + 1; j < bangKeKhaiGiangDays.length; j++) {
                if (bangKeKhaiGiangDays[i].getTongmonhoc() < bangKeKhaiGiangDays[j].getTongmonhoc()) {
                    BangKeKhaiGiangDay temp = bangKeKhaiGiangDays[i];
                    bangKeKhaiGiangDays[i] = bangKeKhaiGiangDays[j];
                    bangKeKhaiGiangDays[j] = temp;
                }
            }
        }
        for (BangKeKhaiGiangDay bangkekhai : bangKeKhaiGiangDays
        ) {
            System.out.println(bangkekhai);

        }
    }

    public static void sapXepTheoTenGiangVien() {
        for (int i = 0; i < bangKeKhaiGiangDays.length; i++) {
            for (int j = 0; j < bangKeKhaiGiangDays.length; j++) {
                if (bangKeKhaiGiangDays[i].getGiangViens().getHoten().compareTo(bangKeKhaiGiangDays[j].getGiangViens().getHoten()) > 0) {
                    BangKeKhaiGiangDay temp = bangKeKhaiGiangDays[i];
                    bangKeKhaiGiangDays[i] = bangKeKhaiGiangDays[j];
                    bangKeKhaiGiangDays[j] = temp;
                }
            }
        }
        for (BangKeKhaiGiangDay bangkekhai : bangKeKhaiGiangDays
        ) {
            System.out.println(bangkekhai);

        }
    }

    public static void tinhCongGiangVien() {
        for (BangKeKhaiGiangDay bangkekhai : bangKeKhaiGiangDays
        ) {
            System.out.println("Lương giảnh viên: " + bangkekhai.getGiangViens().getHoten());
            System.out.println(bangkekhai.getGiangViens().getLuong());
        }
    }

}

