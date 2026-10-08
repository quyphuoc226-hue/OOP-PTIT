package com.example.JavaPTIT;

import java.util.Scanner;

class SinhVien{
    private String ten, ns, lop, ma;
    private float gpa;

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
        String[] temp = ns.split("/");
        this.ns = String.format("%02d/%02d/%04d", Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(int n) {
        this.ma = String.format("B20DCCN" + "%03d", n);
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
public class J05003_DANH_SACH_DOI_TUONG_SINH_VIEN_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien[] ds = new SinhVien[n];
        for(int i = 0; i < n; i++){
            ds[i] = new SinhVien();
            ds[i].setTen(sc.nextLine());
            ds[i].setLop(sc.nextLine());
            ds[i].setNs(sc.nextLine());
            ds[i].setGpa(sc.nextFloat());
            sc.nextLine();
            ds[i].setMa(i + 1);
        }
        for(int i = 0; i < n; i++){
            System.out.printf("%s %s %s %s %.2f\n", ds[i].getMa(), ds[i].getTen(), ds[i].getLop(), ds[i].getNs(), ds[i].getGpa());
        }
    }

}
