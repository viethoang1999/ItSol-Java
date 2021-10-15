package Oop.QuanLyPhanCongLaiXeBuyt;

import java.util.Scanner;

public class LaiXe extends Nguoi {
    private int maLaiXe;
    private String trinhDo;
    private static int autocement=10000;

    public LaiXe(String hoTen, String diaChi, String sdt, int maLaiXe, String trinhDo) {
        super(hoTen, diaChi, sdt);
        this.maLaiXe = autocement++;
        this.trinhDo = trinhDo;
    }
    public LaiXe(){
        this.maLaiXe = autocement++;
    }

    public int getMaLaiXe() {
        return maLaiXe;
    }

    public void setMaLaiXe(int maLaiXe) {
        this.maLaiXe = maLaiXe;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public void input() {
        Scanner scanner=new Scanner(System.in);
        this.setMaLaiXe(autocement++);
        super.input();
        System.out.println("Nhập trình độ lái xe");
        System.out.println("Loại A");
        System.out.println("Loại B");
        System.out.println("Loại C");
        System.out.println("Loại D");
        System.out.println("Loại E");
        System.out.println("Loại F");
        boolean check=true;
        do {
            int type;
            try {
                type=scanner.nextInt();
                scanner.nextLine();
            }catch (Exception e){
                System.out.println("Nhập số");
                check=false;
                continue;
            }
            switch (type){
                case 1:this.setTrinhDo(TrinhDo.LOAI_A);
                    System.out.println("Loại A");
                    break;
                case 2:this.setTrinhDo(TrinhDo.LOAI_B);
                    System.out.println("Loại B");
                    break;
                case 3:this.setTrinhDo(TrinhDo.LOAI_C);
                    System.out.println("Loại C");
                    break;
                case 4:this.setTrinhDo(TrinhDo.LOAI_D);
                    System.out.println("Loại D");
                    break;
                case 5:this.setTrinhDo(TrinhDo.LOAI_E);
                    System.out.println("Loại E");
                    break;
                case 6:this.setTrinhDo(TrinhDo.LOAI_F);
                    System.out.println("Loại F");
                    break;
            }
        }while (!true);

    }

    @Override
    public void output() {
        System.out.println("Ma lai xe: "+this.maLaiXe);
        super.output();
        System.out.println("Trình độ: "+this.trinhDo);

    }

    @Override
    public String toString() {
        return "LaiXe{" +
                "maLaiXe=" + maLaiXe +
                ", trinhDo='" + trinhDo + '\'' +
                '}';
    }
}
