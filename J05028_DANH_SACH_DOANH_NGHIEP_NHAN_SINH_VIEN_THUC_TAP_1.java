package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class DoanhNghiep{
    private String ma, ten;
    private int sl;
    public DoanhNghiep(String ma, String ten, int sl){
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }
    public int compare(DoanhNghiep a){
        if(a.sl != this.sl) return Integer.compare(a.sl, this.sl);
        return this.ma.compareTo(a.ma);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + sl;
    }
}
public class J05028_DANH_SACH_DOANH_NGHIEP_NHAN_SINH_VIEN_THUC_TAP_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<DoanhNghiep> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            DoanhNghiep a = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            sc.nextLine();
            ds.add(a);
        }
        ds.sort((a, b) -> a.compare(b));
        for(int i = 0; i < n; i++){
            System.out.println(ds.get(i));
        }
    }
}
