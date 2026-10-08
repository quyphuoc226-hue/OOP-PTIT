package com.example.JavaPTIT;

import java.util.Arrays;
import java.util.Scanner;

class MatHang{
    private String ten, nhom;
    private int ma;
    private float mua, ban, loiNhuan;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public float getMua() {
        return mua;
    }

    public void setMua(float mua) {
        this.mua = mua;
    }

    public float getBan() {
        return ban;
    }

    public void setBan(float ban) {
        this.ban = ban;
    }

    public float getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan() {
        this.loiNhuan = this.ban - this.mua;
    }

    public int compareLoiNhuan(MatHang a){
        return Float.compare(a.loiNhuan, this.loiNhuan);
    }
}
public class J05010_SAP_XEP_DANH_SACH_MAT_HANG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MatHang[] ds = new MatHang[n];
        for(int i = 0; i < n; i++){
            ds[i] = new MatHang();
            ds[i].setMa(i + 1);
            ds[i].setTen(sc.nextLine());
            ds[i].setNhom(sc.nextLine());
            ds[i].setMua(sc.nextFloat());
            ds[i].setBan(sc.nextFloat());
            sc.nextLine();
            ds[i].setLoiNhuan();
        }
        Arrays.sort(ds, (a, b) -> a.compareLoiNhuan(b));
        for(int i = 0; i < n; i++){
            System.out.printf("%d %s %s %.2f\n", ds[i].getMa(), ds[i].getTen(), ds[i].getNhom(), ds[i].getLoiNhuan());
        }
    }
}
