package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class NhanVien{
    private String ten, chucVu;
    private int ma, soNgay, luongCb, thuong, phu, thuNhap, luongThang;
    public NhanVien(int ma, String ten, int luongCb, int soNgay, String chucVu){
        this.ma = ma;
        this.ten = ten;
        this.luongCb = luongCb;
        this.soNgay = soNgay;
        this.chucVu = chucVu;
        luongThang = luongCb * soNgay;
        if(soNgay >= 25) thuong = luongThang * 20 / 100;
        else if(soNgay >= 22) thuong = luongThang * 10 / 100;
        else thuong = 0;
        if(chucVu.equals("GD")) phu = 250000;
        else if(chucVu.equals("PGD")) phu = 200000;
        else if(chucVu.equals("TP")) phu = 180000;
        else phu = 150000;
        thuNhap = luongThang + thuong + phu;
    }
    public int compare(NhanVien a){
        return Integer.compare(this.thuNhap, a.thuNhap);
    }
    @Override
    public  String toString(){
        return String.format("NV%02d", ma) + " " + ten + " " + luongThang + " " + thuong + " " + phu + " " + thuNhap;
    }

}
public class J05041_SAP_XEP_BANG_TINH_CONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            int luongCb = sc.nextInt();
            int soNgay = sc.nextInt();
            sc.nextLine();
            String chucVu = sc.nextLine();
            NhanVien a = new NhanVien(i + 1, ten, luongCb, soNgay, chucVu);
            ds.add(a);
        }
        ds.sort((a, b) -> b.compare(a));
        for(int i = 0; i < n; i++){
            System.out.println(ds.get(i));
        }
    }
}
