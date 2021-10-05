package Oop.QuanLySach;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    private static int coutBanDoc;
    private static BanDoc[] banDocs;
    private static Sach[] sachs;
    private static QuanLySach[] quanLySachs;


    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.In và xuất ra danh sách bạn đọc");
        System.out.println("2.In và xuất ra danh sách sách");
        System.out.println("3.Mượn sách");
        System.out.println("4.");
    }

    public static void main(String[] args) {


        int choose;
        Scanner scanner = new Scanner(System.in);
        do {
            Menu();
            System.out.println("Chọn thao tác bạn muốn thực hiện: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhập số bạn đọc: ");
                    int n = scanner.nextInt();
                    banDocs = new BanDoc[n];
                    for (int i = 0; i < n; i++) {
                        banDocs[i] = new BanDoc();
                        banDocs[i].intput();

                    }
                    for (int i = 0; i < banDocs.length; i++) {
                        banDocs[i].output();
                    }
                case 2:
                    System.out.println("Nhập số lượng sách: ");
                    int number = scanner.nextInt();
                    sachs = new Sach[number];
                    for (int i = 0; i < number; i++) {
                        sachs[i] = new Sach();
                        sachs[i].input();

                    }
                    for (int i = 0; i < sachs.length; i++) {
                        sachs[i].output();
                    }
                case 3:
                    muonSach();


            }
        } while (choose != 5);
    }

    public static boolean checkSachvaBanDoc() {
        return sachs != null && banDocs != null && sachs.length > 0 && banDocs.length > 0;
    }

    public static void muonSach() {
        if (!checkSachvaBanDoc()) {
            System.out.println("Bạn cần nhập danh sách bạn đọc và đầu sách  trước khi cho mượn");
            return;
        }
        boolean check = true;
        quanLySachs = new QuanLySach[coutBanDoc];
        for (int i = 0; i < banDocs.length; i++) {
            System.out.println("Nhập số lượng đầu sách mà bạn " + banDocs[i].getName() + " muốn mượn: ");
            int n;
            do {
                n = new Scanner(System.in).nextInt();
                if (n < 0 || n > 5 || n > sachs.length) {
                    System.out.println("Nhập lại số lượng đầu sách lớn hơn 0 , nhỏ hơn 5 và tổng sách: "+n);
                    check = false;
                }
                
            } while (!check);
            Sach[] sachList = new Sach[n];
            int[] soLuongList = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập id  của sách thứ " + (j + 1) + "mà bạn " + banDocs[i].getName() + " muốn mượn: ");
                int temId;
                do {
                    temId = new Scanner(System.in).nextInt();
                    Sach sach = timSach(temId);
                    int m = 0;
                    if (sach != null) {
                        System.out.println("Nhập số lượng sách bạn muốn mượn: " + sach.getNamebook() + ": ");
                        do {
                            m = new Scanner(System.in).nextInt();
                            if (m > 3 || m <= 0) {
                                System.out.println("Số lượng sách  được cho phép  mượn của 1 đầu sách lơn hơn 0, " +
                                        " không vượt quá 3 và không có chữ nhập lại");
                                check = false;
                            }
                        } while (!check);
                        sachList[j] = sach;
                        soLuongList[j] = m;
                        break;
                    }
                    System.out.println("Không có sách nào trong thư viện có Id vừa nhập, vui lòng nhập lại: ");
                } while (true);
            }
            QuanLySach quanLySach = new QuanLySach(banDocs[i], sachList, soLuongList);
            quanLySachs[i] = quanLySach;
        }
        System.out.println("Danh sách  bảng mượn sách của các bạn đọc hiện tại : ");
        for (QuanLySach quanLySach : quanLySachs) {
            System.out.println(quanLySach);
        }

    }

    public static Sach timSach(int id) {
        for (Sach sach : sachs) {
            if (sach.getIdBook() == id) {
                return sach;
            }
        }
        return null;
    }

}
