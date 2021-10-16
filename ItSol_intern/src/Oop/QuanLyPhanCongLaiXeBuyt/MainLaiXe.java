package Oop.QuanLyPhanCongLaiXeBuyt;

import java.util.*;

public class MainLaiXe {
    private static List<LaiXe> laiXes = new ArrayList<>();
    private static List<Tuyen> tuyens = new ArrayList<>();
    private static List<BangPhanCOng> bangPhanCOngs = new ArrayList<>();

    public static void Menu() {
        System.out.println("----Quản Lý Phân Công Lái Xe-----");
        System.out.println("1. Nhập và xuất thông tin lái xe");
        System.out.println("2. Nhập và xuất thông tin tuyến ");
        System.out.println("3. In danh sách phân công lái xe ");
        System.out.println("4. Sắp xếp danh sách ");
        System.out.println("5.Tổng khoảng cách xe chạy trong ngày c=ủa mỗi lái xe ");
        System.out.println("6.Tháouy");
    }

    public static void main(String[] args) {
        boolean check = true;
        do {
            Menu();
            System.out.println("Nhập sự lựa chọn cửa bạn");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    intputLaiXe();
                    outputLaiXe();
                    break;
                case 2:
                    intputTuyen();
                    outputTuyen();
                    break;
                case 3:
                    danhSach();
                    outputDanhSach();
                    break;
                case 4:
                    sapXepHoTenLaiXe();
                    sapxepSoLuongTuyenTrongNgay();
                    break;
                case 5:
                    tongKhoangCachXeChay();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }

    public static void intputLaiXe() {
        LaiXe laiXe = new LaiXe();
        laiXe.input();
        laiXes.add(laiXe);
    }

    public static void outputLaiXe() {
        for (int i = 0; i < laiXes.size(); i++) {
            laiXes.get(i).output();
        }
        // laiXes.forEach(e-> System.out.println(e));
    }

    public static void intputTuyen() {
        Tuyen tuyen = new Tuyen();
        tuyen.intput();
        tuyens.add(tuyen);
    }

    public static void outputTuyen() {
        for (int i = 0; i < tuyens.size(); i++) {
            tuyens.get(i).output();
        }
    }

    public static LaiXe timLaiXe(int id) {
        for (LaiXe laixe : laiXes
        ) {
            if (laixe.getMaLaiXe() == id) {
                return laixe;
            }
        }
        return null;
    }

    public static Tuyen timTuyen(int id) {
        for (Tuyen tuyen : tuyens
        ) {
            if (tuyen.getMaTuyen() == id) {
                return tuyen;
            }
        }
        return null;
    }

    public static int tongDiemDung(BangPhanCOng bangPhanCOng) {
        int number = 0;
        for (int i : bangPhanCOng.getSoLuotChay()
        ) {
            number += i;
        }
        return number;
    }

    public static void danhSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id lái xe: ");
        boolean check = false;
        LaiXe laiXe;
        int number;
        do {
            number = scanner.nextInt();
            scanner.nextLine();
            laiXe = timLaiXe(number);

            if (laiXe == null) {
                System.out.println("Nhập lại id: ");
                check = true;
            } else {
                check = false;
            }
        } while (check);
        BangPhanCOng bangPhanCOng = null;
        int a = 0;
        for (BangPhanCOng bangphancong : bangPhanCOngs
        ) {
            a += 1;
            if (bangPhanCOng.getLaiXe().getMaLaiXe() == a) {
                check = true;
                bangPhanCOng = bangphancong;
                break;
            }

        }
        Tuyen tuyen;
        int number1 = 0;
        boolean check1 = false;
        System.out.println("Nhập id tuyến");
        do {
            number1 = scanner.nextInt();
            scanner.nextLine();
            tuyen = timTuyen(number1);
            if (tuyen == null) {
                System.out.println("Nhập lại id: ");
                check = true;
            } else {
                check = false;
            }
        } while (check1);
        if (check == true) {
            int number2 = 0;
            boolean check3 = true;
            for (Tuyen tuyen1 : bangPhanCOng.getTuyenList()
            ) {
                if (tuyen.getMaTuyen() == tuyen1.getMaTuyen()) {
                    System.out.println("Không thêm được tuyến này");
                    check3 = false;
                    break;
                }
            }
            number2 = tongDiemDung(bangPhanCOng);
            if (check3 == true) {
                System.out.println("Nhấp số lượt chạy: ");
                boolean check4 = false;
                int soluot;
                do {
                    soluot = scanner.nextInt();
                    scanner.nextLine();
                    if ((number2 + soluot) > 15) {
                        System.out.println("Nhập lại số lượt: ");
                        check4 = true;
                    } else {
                        check4 = false;
                    }
                } while (check4);
                bangPhanCOng.getSoLuotChay().add(soluot);
                bangPhanCOng.getTuyenList().add(tuyen);
                bangPhanCOngs.remove(a - 1);
                bangPhanCOngs.add(bangPhanCOng);
            } else {
                System.out.println("Số lượt chạy qua mức cho phép");
            }

        } else {
            System.out.println("Nhạp số lượt chạy: ");
            List<Integer> soLuong = new ArrayList<>();
            List<Tuyen> tuyens = new ArrayList<>();
            tuyens.add(tuyen);
            boolean check5 = false;
            int soluot;
            do {
                soluot = scanner.nextInt();
                scanner.nextLine();
                if (soluot > 15 || soluot < 0) {
                    System.out.println("Nhập lại số lượt: ");
                    check5 = true;
                } else {
                    check5 = false;
                }
            } while (check5);
            soLuong.add(soluot);
            BangPhanCOng bangPhanCOng1 = new BangPhanCOng(laiXe, tuyens, soLuong);
            bangPhanCOngs.add(bangPhanCOng1);
        }

    }

    public static void outputDanhSach() {
        bangPhanCOngs.forEach(o -> System.out.println(o));
    }

    public static void sapXepHoTenLaiXe() {
        Collections.sort(bangPhanCOngs, new Comparator<BangPhanCOng>() {
                    @Override
                    public int compare(BangPhanCOng o1, BangPhanCOng o2) {
                        return o1.getLaiXe().getHoTen().compareTo(o2.getLaiXe().getHoTen());
                    }
                }

        );
    }

    public static void sapxepSoLuongTuyenTrongNgay() {
        Collections.sort(bangPhanCOngs, new Comparator<BangPhanCOng>() {
            @Override
            public int compare(BangPhanCOng o1, BangPhanCOng o2) {
                return tongDiemDung(o1) - tongDiemDung(o2);
            }
        });
    }

    public static void tongKhoangCachXeChay() {
        for (BangPhanCOng bangPhanCong : bangPhanCOngs
        ) {
            double tong = 0;
            for (int i = 0; i < bangPhanCong.getTuyenList().size(); i++) {
                tong = tong + bangPhanCong.getSoLuotChay().get(i) * bangPhanCong.getTuyenList().get(i).getKhoangCach();
            }
            System.out.println(bangPhanCong.getLaiXe().getMaLaiXe() + "" + bangPhanCong.getLaiXe().getHoTen() + " quãng đường đi được:  " + tong + "cây ");
        }
    }
}
