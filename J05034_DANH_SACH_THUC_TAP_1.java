package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    private String ma, ten, lop, email, dn;
    private int stt;
    public SinhVien(int stt, String ma, String ten, String lop, String email, String dn){
        this.stt = stt;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }
    public String getDn(){
        return  this.dn;
    }
    public int compare(SinhVien a){
        return this.ten.compareTo(a.ten);
    }
    @Override
    public String toString(){
        return stt + " " + ma + " " + ten + " " + lop + " " + email + " " + dn;
    }
}
public class J05034_DANH_SACH_THUC_TAP_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            SinhVien a = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        ds.sort((a, b) -> a.compare(b));
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String Q = sc.nextLine();
            for(int i = 0; i < n; i++){
                if(ds.get(i).getDn().equals(Q)){
                    System.out.println(ds.get(i));
                }
            }
        }
    }
}
