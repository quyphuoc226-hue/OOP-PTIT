package com.example.JavaPTIT;

import java.util.Scanner;

class ThiSinh1 {
    private String ma, ten;
    private float toan, ly, hoa, uuTien, diem;

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

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getUuTien() {
        return uuTien;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem() {
        this.diem = toan * 2 + ly + hoa;
    }

    public String ketQua() {
        if (ma.charAt(2) == '1') uuTien = 0.5F;
        else if (ma.charAt(2) == '2') uuTien = 1.0F;
        else uuTien = 2.5F;
        if (diem + uuTien >= 24) return "TRUNG TUYEN";
        else return "TRUOT";
    }

    public String fomatDiem(float diem) {
        if (diem == (int) diem) return String.format("%.0f", diem);
        return String.format("%.1f", diem);
    }
}

public class J04013_BAI_TOAN_TUYEN_SINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh1 a = new ThiSinh1();
        a.setMa(sc.nextLine());
        a.setTen(sc.nextLine());
        a.setToan(sc.nextFloat());
        a.setLy(sc.nextFloat());
        a.setHoa(sc.nextFloat());
        a.setDiem();
        String res = a.ketQua();
        System.out.printf("%s %s %s %s %s", a.getMa(), a.getTen(), a.fomatDiem(a.getUuTien()), a.fomatDiem(a.getDiem()), res);

    }
}
