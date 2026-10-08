package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class MatHang{
    private String ten, dvi;
    private int ma, gia, sl;
    public MatHang(int ma, String ten, String dvi, int gia, int sl){
        this.ma = ma;
        this.ten = ten;
        this.dvi = dvi;
        this.gia = gia;
        this.sl = sl;
    }
    public int vanChuyen(){
        return Math.round(gia * sl * 0.05F);
    }
    public int thanhTien(){
        return Math.round(vanChuyen() + gia * sl);
    }
    public int giaBan(){
        int x = Math.round((thanhTien() + thanhTien() * 0.02F) / sl);
        if(x % 100 != 0) return x - x % 100 + 100;
        else return x;
    }
    public int compare(MatHang a){
        return Integer.compare(a.giaBan(), this.giaBan());
    }
    @Override
    public String toString(){
        return String.format("MH%02d", ma) + " " + ten + " " + dvi + " " + vanChuyen() + " " + thanhTien() + " " + giaBan();
    }
}
public class J05037_TINH_GIA_BAN_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> ds = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            MatHang a = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
            ds.add(a);
        }
        ds.sort((a, b) -> a.compare(b));
        for(int i = 0; i < n; i++){
            System.out.println(ds.get(i));
        }
    }
}
