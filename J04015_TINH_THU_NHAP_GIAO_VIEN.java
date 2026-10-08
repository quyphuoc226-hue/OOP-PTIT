package com.example.JavaPTIT;

import java.util.Scanner;

class GiaoVien{
    private String ma, ten;
    private long luongCb, thuNhap, heSo, phuCap;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuongCb() {
        return luongCb;
    }

    public void setLuongCb(long luongCb) {
        this.luongCb = luongCb;
    }

    public long getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap() {
        this.thuNhap = luongCb * heSo + phuCap;
    }

    public long getHeSo() {
        return heSo;
    }

    public void setHeSo() {
        this.heSo = Integer.parseInt(ma.substring(2));
    }

    public long getPhuCap() {
        return phuCap;
    }

    public void setPhuCap() {
        if(ma.substring(0, 2).equals("HT")) phuCap = 2000000;
        else if(ma.substring(0, 2).equals("HP")) phuCap = 900000;
        else phuCap = 500000;
    }
}
public class J04015_TINH_THU_NHAP_GIAO_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien a = new GiaoVien();
        a.setMa(sc.nextLine());
        a.setTen(sc.nextLine());
        a.setLuongCb(sc.nextLong());
        a.setHeSo();
        a.setPhuCap();
        a.setThuNhap();
        System.out.printf("%s %s %d %d %d", a.getMa(), a.getTen(), a.getHeSo(), a.getPhuCap(), a.getThuNhap());
    }
}
