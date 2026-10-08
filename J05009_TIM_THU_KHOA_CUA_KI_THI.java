package com.example.JavaPTIT;

import java.util.Scanner;

class ThiSinh{
    private String ten, ns;
    private int ma;
    private float d1, d2, d3, tong;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public float getD1() {
        return d1;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public float getD2() {
        return d2;
    }

    public void setD2(float d2) {
        this.d2 = d2;
    }

    public float getD3() {
        return d3;
    }

    public void setD3(float d3) {
        this.d3 = d3;
    }

    public void setTong() {
        this.tong = this.d1 + this.d2 + this.d3;
    }

    public float getTong() {
        return tong;
    }
}
public class J05009_TIM_THU_KHOA_CUA_KI_THI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ThiSinh[] ds = new ThiSinh[n];
        for(int i = 0; i < n; i++){
            ds[i] = new ThiSinh();
            ds[i].setTen(sc.nextLine());
            ds[i].setNs(sc.nextLine());
            ds[i].setD1(sc.nextFloat());
            ds[i].setD2(sc.nextFloat());
            ds[i].setD3(sc.nextFloat());
            sc.nextLine();
            ds[i].setTong();
            ds[i].setMa(i + 1);
        }
        float mx = -1;
        for(int i = 0; i < n; i++){
            if(ds[i].getTong() > mx) mx = ds[i].getTong();
        }
        for(int i = 0; i < n; i++){
            if(ds[i].getTong() == mx){
                System.out.printf("%d %s %s %.1f\n", ds[i].getMa(), ds[i].getTen(), ds[i].getNs(), ds[i].getTong());
            }
        }
    }
}
