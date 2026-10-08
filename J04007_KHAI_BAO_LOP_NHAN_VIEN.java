package com.example.JavaPTIT;

import java.util.Scanner;

class NhanVien1 {
    private String ma, ten, gt, ns, dc, mst, hd;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
}
public class J04007_KHAI_BAO_LOP_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien1 a = new NhanVien1();
        a.setMa("00001");
        a.setTen(sc.nextLine());
        a.setGt(sc.nextLine());
        a.setNs(sc.nextLine());
        a.setDc(sc.nextLine());
        a.setMst(sc.nextLine());
        a.setHd(sc.nextLine());
        System.out.printf("%s %s %s %s %s %s %s", a.getMa(), a.getTen(), a.getGt(), a.getNs(), a.getDc(), a.getMst(), a.getHd());
    }
}
