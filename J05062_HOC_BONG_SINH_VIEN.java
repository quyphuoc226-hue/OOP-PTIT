package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    String ten, ketQua;
    float gpa;
    int drl, stt;
    public SinhVien(int stt, String ten, float gpa, int drl){
        this.ten = ten;
        this.gpa = gpa;
        this.drl = drl;
        this.stt = stt;
    }
    public int compare(SinhVien a){
        if(a.gpa != this.gpa) return Float.compare(a.gpa, this.gpa);
        return Integer.compare(a.drl, this.drl);
    }
    public int compareStt(SinhVien a){
        return Integer.compare(this.stt, a.stt);
    }
    @Override
    public String toString(){
        return ten + ": " + ketQua;
    }
}
public class J05062_HOC_BONG_SINH_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ds.add(new SinhVien(i + 1, sc.nextLine(), sc.nextFloat(), sc.nextInt()));
            sc.nextLine();
        }
        ds.sort((a, b) -> a.compare(b));
        float diemChuan = ds.get(m - 1).gpa;
        ds.forEach(e -> {
            if(e.gpa >= 3.6F && e.drl >= 90) e.ketQua = "XUATSAC";
            else if(e.gpa >= Math.max(3.2, diemChuan) && e.drl >= 80) e.ketQua = "GIOI";
            else if(e.gpa >= Math.max(2.5, diemChuan) && e.drl >= 70) e.ketQua = "KHA";
            else if(e.gpa < Math.max(diemChuan, 2.5) || e.drl < 70) e.ketQua = "KHONG";
        });

        ds.sort((a, b) -> a.compareStt(b));
        ds.forEach(e -> System.out.println(e));
    }
}
