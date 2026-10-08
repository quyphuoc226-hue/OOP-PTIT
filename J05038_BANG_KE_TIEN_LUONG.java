package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class NhanVien{
    private String ten, chucVu;
    private int luongNgay, soNgay, ma, thuong, phu, luongThang, thuc;
    public NhanVien(int ma, String ten, int luongNgay, int soNgay, String chucVu){
        this.ma = ma;
        this.ten = ten;
        this.luongNgay = luongNgay;
        this.chucVu = chucVu;
        if(chucVu.equals("GD")) phu = 250000;
        else if(chucVu.equals("PGD")) phu = 200000;
        else if(chucVu.equals("TP")) phu = 180000;
        else phu = 150000;
        luongThang = luongNgay * soNgay;
        if(soNgay >= 25) thuong = luongThang * 20 / 100;
        else if(soNgay >= 22) thuong = luongThang * 10 / 100;
        else thuong = 0;
        thuc = luongThang + phu + thuong;
    }
    public int getThuc() {
        return thuc;
    }
    @Override
    public String toString(){
        return String.format("NV%02d", ma) + " " + ten + " " + luongThang + " " + thuong + " " + phu + " " + thuc;
    }
}
public class J05038_BANG_KE_TIEN_LUONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int ma = i + 1;
            String ten = sc.nextLine();
            int luongNgay = sc.nextInt();
            int soNgay = sc.nextInt();
            sc.nextLine();
            String chucVu = sc.nextLine();
            NhanVien a = new NhanVien(ma, ten, luongNgay, soNgay, chucVu);
            ds.add(a);
        }
        int tong = 0;
        for(int i = 0; i < n; i++){
            System.out.println(ds.get(i));
            tong += ds.get(i).getThuc();
        }
        System.out.printf("Tong chi phi tien luong: %d", tong);
    }
}
