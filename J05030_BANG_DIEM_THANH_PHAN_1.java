package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    private String ma, ten, lop;
    private float d1, d2, d3;
    public SinhVien(String ma, String ten, String lop, float d1, float d2, float d3){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public int compare(SinhVien a){
        return this.ma.compareTo(a.ma);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + String.format("%.1f", d1) + " " + String.format("%.1f", d2) + " " + String.format("%.1f", d3);
    }
}
public class J05030_BANG_DIEM_THANH_PHAN_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            ds.add(a);
            sc.nextLine();
        }
        ds.sort((a, b) -> a.compare(b));
        for(int i = 0; i < n; i++){
            System.out.print(i + 1 + " ");
            System.out.println(ds.get(i));
        }
    }
}
