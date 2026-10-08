package com.example.JavaPTIT;

import java.util.Arrays;
import java.util.Scanner;

class SinhVien{
    private String ma, ten, lop, ns;
    private float gpa;

    public void setMa(int n) {
        this.ma = String.format("B20DCCN%03d", n);
    }

    public void setTen(String ten) {
        String[] temp = ten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : temp){
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1).toLowerCase()).append(" ");
        }
        this.ten = sb.toString();
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNs(String ns) {
        String[] temp = ns.split("/");
        this.ns = String.format("%02d/%02d/%04d", Integer.parseInt(temp[0]),Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getNs() {
        return ns;
    }

    public float getGpa() {
        return gpa;
    }
}
public class J05005_DANH_SACH_DOI_TUONG_SINH_VIEN_3 {
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
        Arrays.sort(ds, (a, b) -> Float.compare(b.getGpa(), a.getGpa()));
        for(int i = 0; i < n; i++){
            System.out.printf("%s %s %s %s %.2f\n", ds[i].getMa(), ds[i].getTen(), ds[i].getLop(), ds[i].getNs(), ds[i].getGpa());
        }
    }
}
