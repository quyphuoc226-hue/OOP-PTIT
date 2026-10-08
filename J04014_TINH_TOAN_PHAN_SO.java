package com.example.JavaPTIT;

import java.util.Scanner;

class PhanSo2{
    private long tu, mau;

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

    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b){
        return a / gcd(a, b) * b;
    }

    public void rutgon(){
        long bcnn = gcd(this.tu, this.mau);
        this.tu /= bcnn;
        this.mau /= bcnn;
    }

    public PhanSo2 pt1(PhanSo2 b){
        PhanSo2 c = new PhanSo2();
        c.mau = lcm(b.mau, this.mau);
        c.tu = c.mau / this.mau * this.tu + c.mau / b.mau * b.tu;
        c.mau *= c.mau;
        c.tu *= c.tu;
        c.rutgon();
        return c;
    }

    public PhanSo2 pt2(PhanSo2 b, PhanSo2 d){
        PhanSo2 c = new PhanSo2();
        c.tu = this.tu * b.tu * d.tu;
        c.mau = this.mau * b.mau * d.mau;
        c.rutgon();
        return c;
    }
}
public class J04014_TINH_TOAN_PHAN_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            PhanSo2 a = new PhanSo2();
            PhanSo2 b = new PhanSo2();

            a.setTu(sc.nextLong());
            a.setMau(sc.nextLong());

            b.setTu(sc.nextLong());
            b.setMau(sc.nextLong());

            PhanSo2 c = new PhanSo2();
            PhanSo2 d = new PhanSo2();

            c = a.pt1(b);
            d = a.pt2(b, c);

            System.out.printf("%d/%d %d/%d", c.getTu(), c.getMau(), d.getTu(), d.getMau());
            System.out.println();
        }
    }
}
