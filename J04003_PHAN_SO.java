package com.example.JavaPTIT;

import java.util.Scanner;

class PhanSo{
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
    public PhanSo rutGon(PhanSo a){
        long ucln = gcd(a.tu, a.mau);
        a.tu /= ucln;
        a.mau /= ucln;
        return a;
    }
}
public class J04003_PHAN_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo();
        a.setTu(sc.nextLong());
        a.setMau(sc.nextLong());
        a.rutGon(a);
        System.out.printf("%d/%d", a.getTu(), a.getMau());
    }
}
