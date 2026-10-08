package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    private String ma, ten, lop, email;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
public class J05021_SAP_XEP_THEO_MA_SINH_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();

        while(sc.hasNextLine()){
            SinhVien a = new SinhVien();
            a.setMa(sc.nextLine());
            a.setTen(sc.nextLine());
            a.setLop(sc.nextLine());
            a.setEmail(sc.nextLine());
            ds.add(a);
        }
        ds.sort((x, y) -> x.getMa().compareTo(y.getMa()));
        for(int i = 0; i < ds.size(); i++){
            System.out.printf("%s %s %s %s\n", ds.get(i).getMa(), ds.get(i).getTen(), ds.get(i).getLop(), ds.get(i).getEmail());
        }
    }
}
