package com.example.JavaPTIT;

import java.util.Scanner;

class NhanVien{
    private String ma, ten, gt, ns, dc, mst, hd;

    public String getMa() {
        return ma;
    }

    public void setMa(int n) {
        this.ma = String.format("%05d", n);
    }

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
}
public class J05006_DANH_SACH_DOI_TUONG_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NhanVien[] ds = new NhanVien[n];
        for(int i = 0; i < n; i++){
            ds[i] = new NhanVien();
            ds[i].setTen(sc.nextLine());
            ds[i].setGt(sc.nextLine());
            ds[i].setNs(sc.nextLine());
            ds[i].setDc(sc.nextLine());
            ds[i].setMst(sc.nextLine());
            ds[i].setHd(sc.nextLine());
            ds[i].setMa(i + 1);
        }
        for(int i = 0; i < n; i++){
            System.out.printf("%s %s %s %s %s %s %s\n", ds[i].getMa(), ds[i].getTen(), ds[i].getGt(), ds[i].getNs(), ds[i].getDc(), ds[i].getMst(), ds[i].getHd());
        }
    }
}
