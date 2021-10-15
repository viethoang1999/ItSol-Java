package Oop.QuanLyBanVeXeBus;

public class BangKeBanVe {
    private HanhKhach hanhKhach;
    private LoaiVe[] loaiVes;
    private int soVe;
    private float giaVe;

    public BangKeBanVe(HanhKhach hanhKhach, LoaiVe[] loaiVes, int soVe) {
        this.hanhKhach = hanhKhach;
        this.loaiVes = loaiVes;
        this.soVe = soVe;

    }
    public BangKeBanVe(){

    }

    public HanhKhach getHanhKhach() {
        return hanhKhach;
    }

    public void setHanhKhach(HanhKhach hanhKhach) {
        this.hanhKhach = hanhKhach;
    }

    public LoaiVe[] getLoaiVes() {
        return loaiVes;
    }

    public void setLoaiVes(LoaiVe[] loaiVes) {
        this.loaiVes = loaiVes;
    }

    public int getSoVe() {
        return soVe;
    }

    public void setSoVe(int soVe) {
        this.soVe = soVe;
    }

    public float getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(float giaVe) {
        this.giaVe = giaVe;
    }
}
