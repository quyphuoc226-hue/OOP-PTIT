package com.example.JavaPTIT;

import java.util.Arrays;
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

    public int compareNs(NhanVien other){
        String[] a = this.ns.split("/");
        String[] b = other.ns.split("/");
        int namA = Integer.parseInt(a[2]);
        int namB = Integer.parseInt(b[2]);
        if(namA != namB) return Integer.compare(namA, namB);
        int thangA = Integer.parseInt(a[1]);
        int thangB = Integer.parseInt(b[1]);
        if(thangA != thangB) return Integer.compare(thangA, thangB);
        int ngayA = Integer.parseInt(a[0]);
        int ngayB = Integer.parseInt(b[0]);
        return Integer.compare(ngayA, ngayB);
    }
}
public class J05007_SAP_XEP_DANH_SACH_DOI_TUONG_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NhanVien[] ds = new NhanVien[n];
        for(int i = 0; i < n; i++){
            ds[i] = new NhanVien();
            ds[i].setMa(i + 1);
            ds[i].setTen(sc.nextLine());
            ds[i].setGt(sc.nextLine());
            ds[i].setNs(sc.nextLine());
            ds[i].setDc(sc.nextLine());
            ds[i].setMst(sc.nextLine());
            ds[i].setHd(sc.nextLine());
        }
        Arrays.sort(ds, (a, b) -> a.compareNs(b));
        for(int i = 0; i < n; i++){
            System.out.printf("%s %s %s %s %s %s %s\n", ds[i].getMa(), ds[i].getTen(), ds[i].getGt(), ds[i].getNs(), ds[i].getDc(), ds[i].getMst(), ds[i].getHd());
        }
    }
}
