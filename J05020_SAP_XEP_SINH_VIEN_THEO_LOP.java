package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    private String ma, ten, lop, email;
    public SinhVien(String ma, String ten, String lop, String email){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    public int compare(SinhVien a){
        if(!a.lop.equals(this.lop)) return a.lop.compareTo(this.lop);
        return a.ma.compareTo(this.ma);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }
}
public class J05020_SAP_XEP_SINH_VIEN_THEO_LOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        ds.sort((a, b) -> b.compare(a));
        for(int i = 0; i < n; i++){
            System.out.println(ds.get(i));
        }
    }
}
