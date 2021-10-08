package Oop.QuanLyTraLuong;

public class BangKeKhaiGiangDay {
    private GiangVien giangViens;
    private MonHoc[] monHocs;
    private int [] tong;
    private int tongmonhoc;

    public BangKeKhaiGiangDay(GiangVien giangViens, MonHoc[] monHocs, int[] tong) {
        this.giangViens = giangViens;
        this.monHocs = monHocs;
        this.tong = tong;
    }

    public int getTongmonhoc() {
        return tongmonhoc;
    }

    public void setTongmonhoc(int tongmonhoc) {
        this.tongmonhoc = tongmonhoc;
    }

    public GiangVien getGiangViens() {
        return giangViens;
    }

    public void setGiangViens(GiangVien giangViens) {
        this.giangViens = giangViens;
    }

    public MonHoc[] getMonHocs() {
        return monHocs;
    }

    public void setMonHocs(MonHoc[] monHocs) {
        this.monHocs = monHocs;
    }

    public int[] getTong() {
        return tong;
    }

    public void setTong(int[] tong) {
        this.tong = tong;
    }
}
