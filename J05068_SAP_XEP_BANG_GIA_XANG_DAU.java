package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class SanPham{
    String ma, hang;
    long sl, dongia, thue, thanhtien;
    public SanPham(String ma, long sl){
        this.ma = ma;
        this.sl = sl;
        if(ma.endsWith("BP")) hang = "British Petro";
        else if(ma.endsWith("ES")) hang = "Esso";
        else if(ma.endsWith("SH")) hang = "Shell";
        else if(ma.endsWith("CA")) hang = "Castrol";
        else if(ma.endsWith("MO")) hang = "Mobil";
        else hang = "Trong Nuoc";
        if(ma.startsWith("X")){
            dongia = 128000;
            if(!ma.endsWith("TN")) thue = dongia * sl * 3 / 100;
            else thue = 0;
        }
        else if(ma.startsWith("D")){
            dongia = 11200;
            if(!ma.endsWith("TN")) thue = dongia * sl * 7 / 2 / 100;
            else thue = 0;
        }
        else if(ma.startsWith("N")){
            dongia = 9700;
            if(!ma.endsWith("TN")) thue = dongia * sl * 2 / 100;
            else thue = 0;
        }
        thanhtien = dongia * sl + thue;
    }
    public String toString(){
        return ma + " " + hang + " " + dongia + " " + thue + " " + thanhtien;
    }
}
public class J05068_SAP_XEP_BANG_GIA_XANG_DAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.nextLine();
        ArrayList<SanPham> ds = new ArrayList<>();
        for(long i = 0; i < n; i++){
            String ma = sc.next();
            long sl = sc.nextLong();
            sc.nextLine();
            ds.add(new SanPham(ma, sl));
        }
        ds.sort((a, b) -> Long.compare(b.thanhtien, a.thanhtien));
        ds.forEach(e -> System.out.println(e));
    }
}
