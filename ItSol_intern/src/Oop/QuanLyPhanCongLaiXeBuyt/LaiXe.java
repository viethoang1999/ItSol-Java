package Oop.QuanLyPhanCongLaiXeBuyt;

public class LaiXe extends Nguoi {
    private int maLaiXe;
    private String trinhDo;

    public LaiXe(String hoTen, String diaChi, String sdt, int maLaiXe, String trinhDo) {
        super(hoTen, diaChi, sdt);
        this.maLaiXe = maLaiXe;
        this.trinhDo = trinhDo;
    }
    public LaiXe(){

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
}
