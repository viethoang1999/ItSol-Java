package Oop.QuanLyPhanCongLaiXeBuyt;

import java.util.ArrayList;
import java.util.List;

public class BangPhanCOng {
    private LaiXe laiXe;
    private List<Tuyen> tuyenList;
    private List<Integer> soLuotChay;

    public BangPhanCOng(LaiXe laiXe, List<Tuyen> tuyenList, List<Integer> soLuotChay) {
        this.laiXe = laiXe;
        this.tuyenList = tuyenList;
        this.soLuotChay = soLuotChay;
    }

    public BangPhanCOng() {

    }

    public LaiXe getLaiXe() {
        return laiXe;
    }

    public void setLaiXe(LaiXe laiXe) {
        this.laiXe = laiXe;
    }

    public List<Tuyen> getTuyenList() {
        return tuyenList;
    }

    public void setTuyenList(List<Tuyen> tuyenList) {
        this.tuyenList = tuyenList;
    }

    public List<Integer> getSoLuotChay() {
        return soLuotChay;
    }

    public void setSoLuotChay(List<Integer> soLuotChay) {
        this.soLuotChay = soLuotChay;
    }

    @Override
    public String toString() {
        return "BangPhanCOng{" +
                "laiXe=" + laiXe +
                ", tuyenList=" + tuyenList +
                ", soLuotChay=" + soLuotChay +
                '}';
    }
}
