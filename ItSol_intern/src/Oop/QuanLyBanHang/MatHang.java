package Oop.QuanLyBanHang;

import java.util.Scanner;

public class MatHang {
    private int mahang;
    private String tenhang;
    private String nhomhang;
    private float giaban;

    private static int autoId=10000;

    public MatHang(int mahang, String tenhang, String nhomhang, float giaban) {
        this.mahang = autoId++;
        this.tenhang = tenhang;
        this.nhomhang = nhomhang;
        this.giaban = giaban;
    }
    public MatHang(){
        this.mahang = autoId++;
    }

    public int getMahang() {
        return mahang;
    }

    public void setMahang(int mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getNhomhang() {
        return nhomhang;
    }

    public void setNhomhang(String nhomhang) {
        this.nhomhang = nhomhang;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        MatHang.autoId = autoId;
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên hàng: ");
        this.tenhang=scanner.nextLine();
        System.out.println("Nhập nhóm hàng: ");
        System.out.println("Hang thời trang");
        System.out.println("Hàng tiêu dùng");
        System.out.println("hàng điện máy");
        System.out.println("Hàng gia dụng");
        this.nhomhang=scanner.nextLine();
        boolean check=true;
        do {
            int number=scanner.nextInt();
            scanner.nextLine();
            switch (number){
                case 1:
                    this.setNhomhang(NhomHang.HANG_THOI_TRANG);
                    System.out.println("hàng thời trang");
                    check=true;
                    break;
                case 2:
                    this.setNhomhang(NhomHang.HANG_TIEU_DUNG);
                    System.out.println("Hàng tiêu dùng");
                    check=true;
                    break;
                case 3:
                    this.setNhomhang(NhomHang.HANG_DIEN_MAY);
                    System.out.println("hàng điện máy");
                    check=true;
                    break;
                case 4:
                    this.setNhomhang(NhomHang.HANG_GIA_DUNG);
                    System.out.println("hàng gia dụng");
                    check=true;
                    break;
            }
        }while (!check);
        System.out.println("Nhập giá bán: " );
        this.giaban=scanner.nextFloat();
        scanner.nextLine();
    }
    public  void output(){
        System.out.println("Mã hàng: "+this.mahang);
        System.out.println("Tên hàng: "+this.tenhang);
        System.out.println("Nhóm hàng: "+this.nhomhang);
        System.out.println("Giá: "+this.giaban);
    }
}
