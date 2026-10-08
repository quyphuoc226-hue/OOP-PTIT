package com.example.JavaPTIT;

import java.util.Scanner;

class ThiSinh{
    private String ten, ns;
    private float d1, d2, d3;

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

    public float getD1() {
        return d1;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}

public class J04005_KHAI_BAO_LOP_THI_SINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh a = new ThiSinh();
        a.setTen(sc.nextLine());
        a.setNs(sc.nextLine());
        a.setD1(sc.nextFloat());
        a.setD2(sc.nextFloat());
        a.setD3(sc.nextFloat());
        System.out.printf("%s %s %.1f", a.getTen(), a.getNs(), a.getD1() + a.getD2() + a.getD3());
    }
}
