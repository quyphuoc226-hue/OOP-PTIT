package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    private String ten;
    private int tong, dung;
    public SinhVien(String ten, int dung, int tong){
        this.ten = ten;
        this.dung = dung;
        this.tong = tong;
    }
    public int compare(SinhVien a){
        if(a.dung != this.dung) return Integer.compare(a.dung, this.dung);
        if(a.tong != this.tong) return Integer.compare(this.tong,a.tong);
        return this.ten.compareTo(a.ten);
    }
    @Override
    public String toString(){
        return ten + " " + dung + " " + tong;
    }
}
public class J05042_BANG_XEP_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
            ds.add(a);
        }
        ds.sort((a, b) -> a.compare(b));
        for(int i = 0; i < n; i++){
            System.out.println(ds.get(i));
        }
    }
}
