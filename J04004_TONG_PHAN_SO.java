package com.example.JavaPTIT;

import java.util.Scanner;

class PhanSo1{
    private long tu, mau;

    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b){
        return a / gcd(a, b) * b;
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }

    public PhanSo1 tong(PhanSo1 b){
        PhanSo1 c = new PhanSo1();
        c.mau = lcm(this.mau, b.mau);
        c.tu = c.mau / this.mau * this.tu + c.mau / b.mau * b.tu;
        return c;
    }

    public void rutgon(){
        long bcnn = gcd(this.tu, this.mau);
        this.tu /= bcnn;
        this.mau /= bcnn;
    }
}
public class J04004_TONG_PHAN_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo1 a = new PhanSo1();
        PhanSo1 b = new PhanSo1();

        a.setTu(sc.nextLong());
        a.setMau(sc.nextLong());

        b.setTu(sc.nextLong());
        b.setMau(sc.nextLong());

        PhanSo1 c = new PhanSo1();
        c = a.tong(b);
        c.rutgon();
        System.out.printf("%d/%d", c.getTu(), c.getMau());
    }
}
