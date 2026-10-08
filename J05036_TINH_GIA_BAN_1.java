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
    public float vanChuyen(){
        return gia * sl * 0.05F;
    }
    public float thanhTien(){
        return vanChuyen() + gia * sl;
    }
    public float giaBan(){
        return thanhTien() + thanhTien() * 0.02F;
    }
    @Override
    public String toString(){
        return String.format("MH%02d", ma) + " " + ten + " " + dvi + " " + String.format("%.0f", vanChuyen()) + " " + String.format("%.0f", thanhTien()) + " " + String.format("%.0f", giaBan());
    }
}
public class J05036_TINH_GIA_BAN_1 {
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
        for(int i = 0; i < n; i++){
            System.out.println(ds.get(i));
        }
    }
}
