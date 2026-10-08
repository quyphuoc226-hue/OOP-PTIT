package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    private String ma, ten, lop, email;
    public  SinhVien(String ma, String ten, String lop, String email){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    public String getLop(){
        return this.lop.substring(1, 3);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }
}
public class J05023_LIET_KE_SINH_VIEN_THEO_KHOA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        int q = sc.nextInt();
        while(q-- > 0){
            String Q = sc.next();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", Q);
            for(int i = 0; i < n; i++){
                if(ds.get(i).getLop().equals(Q.substring(2))){
                    System.out.println(ds.get(i));
                }
            }
        }
    }
}
