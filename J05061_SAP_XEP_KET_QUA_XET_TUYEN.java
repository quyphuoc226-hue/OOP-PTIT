package com.example.JavaPTIT;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class PH{
    int ma, tuoi, xepLoai;
    String ten, ns, ketQua;
    float lyThuyet, thucHanh, thuong;
    public PH(int ma, String ten, String ns, float lyThuyet, float thucHanh){
        this.ma = ma;
        this.ten = ten;
        this.ns = ns;
        tuoi = 2021 - Integer.parseInt(ns.substring(6));
        if(lyThuyet >= 8 && thucHanh >= 8) thuong = 1.0F;
        else if (lyThuyet >= 7.5 && thucHanh >= 7.5) thuong = 0.5F;
        else thuong = 0;
        xepLoai = Math.round((lyThuyet + thucHanh) / 2 + thuong);
        if(xepLoai > 10) xepLoai = 10;
        if(xepLoai < 5) ketQua = "Truot";
        else if(xepLoai <= 6) ketQua = "Trung binh";
        else if(xepLoai == 7) ketQua = "Kha";
        else if(xepLoai == 8) ketQua = "Gioi";
        else ketQua = "Xuat sac";
    }
    @Override
    public String toString(){
        return String.format("PH%02d", ma) + " " + ten + " " + tuoi + " " + xepLoai + " " + ketQua;
    }
}
public class J05061_SAP_XEP_KET_QUA_XET_TUYEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<PH> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ds.add(new PH(i + 1, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat()));
            sc.nextLine();
        }
        ds.sort((b, a) -> {
            if(a.xepLoai != b.xepLoai) return Integer.compare(a.xepLoai, b.xepLoai);
            return Integer.compare(b.ma, a.ma);
        });
        ds.forEach(e -> System.out.println(e));
    }
}
