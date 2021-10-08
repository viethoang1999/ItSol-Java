package Oop.QuanLyTraLuong;

import java.util.Scanner;

public class GiangVien extends Nguoi {
    private String trinhdo;
    private float luong;

    public GiangVien(int ma, String hoten, String diachi, String sdt, String trinhdo, float luong) {
        super(ma, hoten, diachi, sdt);
        this.trinhdo = trinhdo;
        this.luong = luong;
    }

    public GiangVien(){

    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    @Override
    public void input() {
        Scanner sc=new Scanner(System.in);
        super.input();
        trinhdo=sc.nextLine();
        System.out.println("Nhập loại trình độ: ");
        System.out.println("GS-TS");
        System.out.println("PGS-TS");
        System.out.println("Giảng viên chính: ");
        System.out.println("Th.S");
        boolean check=true;
        do {
            System.out.println("Chọn trình độ của bạn: ");
            int number= sc.nextInt();
            sc.nextLine();
          switch (number){
              case 1:
                  this.setTrinhdo(LoaiTrinhDo.GS_TS);
                  System.out.println("GS-TS");
                  check=true;
                  break;
              case 2:
                  this.setTrinhdo(LoaiTrinhDo.PGS_TS);
                  System.out.println("PGS-TS");
                  check=true;
                  break;
              case 3:
                  this.setTrinhdo(LoaiTrinhDo.GIANG_VIEN_CHINH);
                  System.out.println("Giảng viên chính");
                  check=true;
                  break;
              case 4:
                  this.setTrinhdo(LoaiTrinhDo.Th_S);
                  System.out.println("Th.S");
                  check=true;
                  break;

          }
        }while (!check);
    }

    @Override
    public void ouput() {
        super.ouput();
        System.out.println("Loại trình độ: "+this.trinhdo);
    }
}
