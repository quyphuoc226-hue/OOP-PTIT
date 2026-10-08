package com.example.JavaPTIT;

import java.util.Scanner;

class SinhVien{
    private String ma, ten, lop, ns;
    private float gpa;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setNs(String ns) {
        String[] word = ns.split("/");
        int ngay = Integer.parseInt(word[0]);
        int thang = Integer.parseInt(word[1]);
        int nam = Integer.parseInt(word[2]);
        this.ns = String.format("%02d/%02d/%04d", ngay, thang, nam);
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNs() {
        return ns;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
public class J04006_KHAI_BAO_LOP_SINH_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien();
        a.setMa("B20DCCN001");
        a.setTen(sc.nextLine());
        a.setLop(sc.nextLine());
        a.setNs(sc.nextLine());
        a.setGpa(sc.nextFloat());
        System.out.printf("%s %s %s %s %.2f", a.getMa(), a.getTen(), a.getLop(), a.getNs(), a.getGpa());
    }


}
