package Oop.QuanLySach;

import java.util.ArrayList;
import java.util.Arrays;

public class QuanLySach {
   private BanDoc banDoc;
   private Sach[] sach;
   private int[] soLuong;
   private int tongSach;
   public QuanLySach(BanDoc banDoc, Sach[] sach,int[] soLuong){
       this.banDoc=banDoc;
       this.sach=sach;
       this.soLuong=soLuong;
   }

    public BanDoc getBanDoc() {
        return banDoc;
    }

    public void setBanDoc(BanDoc banDoc) {
        this.banDoc = banDoc;
    }

    public Sach[] getSach() {
        return sach;
    }

    public void setSach(Sach[] sach) {
        this.sach = sach;
    }

    public int[] getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int[] soLuong) {
        this.soLuong = soLuong;
    }

    public int getTongSach() {
        return tongSach;
    }

    public void setTongSach(int tongSach) {
        this.tongSach = tongSach;
    }
    @Override
    public String toString() {
        return "QuanLySach{" +
                "banDoc=" + banDoc +
                ", sach=" + Arrays.toString(sach) +
                ", soLuong=" + Arrays.toString(soLuong) +
                ", tongSach=" + tongSach +
                '}';
    }
}
