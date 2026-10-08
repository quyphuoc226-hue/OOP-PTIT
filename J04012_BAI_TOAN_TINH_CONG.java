package com.example.JavaPTIT;

import java.util.Scanner;

class NhanVien{
    private String ma, ten, chucVu;
    private int luong, ngay, thuong, phu;

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

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThuong() {
        return thuong;
    }
    public int getPhu() {
        return phu;
    }
    public int thuNhap(){
        int ans = 0;
        int luongThang = luong * ngay;
        if(ngay >= 25) thuong = luongThang / 5;
        else if(ngay >= 22 && ngay < 25) thuong = luongThang / 10;
        if(chucVu.equals("GD")) phu = 250000;
        else if(chucVu.equals("PGD")) phu = 200000;
        else if(chucVu.equals("TP")) phu = 180000;
        else phu = 150000;
        ans = luongThang + thuong + phu;
        return ans;
    }
}
public class J04012_BAI_TOAN_TINH_CONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien a = new NhanVien();
        a.setMa("NV01");
        a.setTen(sc.nextLine());
        a.setLuong(sc.nextInt());
        a.setNgay(sc.nextInt());
        sc.nextLine();
        a.setChucVu(sc.nextLine());
        a.thuNhap();
        System.out.printf("%s %s %d %d %d %d", a.getMa(), a.getTen(), a.getLuong() * a.getNgay(), a.getThuong(), a.getPhu(), a.thuNhap());
    }
}
