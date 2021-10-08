package Oop.QuanLyBanHang;

public class DanhSachMuaHang {
    private  KhachHang khachHangs;
    private MatHang[] matHangs;
    private int[] SoLuong;
    private int tong;

    public DanhSachMuaHang(KhachHang khachHangs, MatHang[] matHangs, int[] soLuong, int tong) {
        this.khachHangs = khachHangs;
        this.matHangs = matHangs;
        SoLuong = soLuong;
        this.tong = tong;
    }

    public KhachHang getKhachHangs() {
        return khachHangs;
    }

    public void setKhachHangs(KhachHang khachHangs) {
        this.khachHangs = khachHangs;
    }

    public MatHang[] getMatHangs() {
        return matHangs;
    }

    public void setMatHangs(MatHang[] matHangs) {
        this.matHangs = matHangs;
    }

    public int[] getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int[] soLuong) {
        SoLuong = soLuong;
    }

    public int getTong() {
        return tong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }
    
}
