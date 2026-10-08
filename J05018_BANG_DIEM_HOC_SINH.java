package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Diem{
    private double d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
    private String ten;
    private int ma;
    public Diem(int ma, String ten, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10){
        this.ma = ma;
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.d6 = d6;
        this.d7 = d7;
        this.d8 = d8;
        this.d9 = d9;
        this.d10 = d10;
    }
    public String ketQua(){
        if(getTb() < 5) return "YEU";
        else if(getTb() >= 5 && getTb() < 7) return "TB";
        else if(getTb() >= 7 && getTb() < 8) return "KHA";
        else if(getTb() >= 8 && getTb() < 9) return "GIOI";
        else return "XUAT SAC";
    }
    public String getMa(){
        return String.format("HS%02d", ma);
    }
    public String getTen(){
        return this.ten;
    }
    public double getTb() {
        double tb = (d1 * 2 + d2 * 2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10) / (12.0);
        return Math.round(tb * 10) / (10.0);
    }

    @Override
    public String toString(){
        return getMa() + " " + getTen() + " " + String.format("%.1f", getTb()) + " " + ketQua();
    }

}
public class J05018_BANG_DIEM_HOC_SINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Diem> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Diem a = new Diem(i + 1, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
            ds.add(a);
        }
        Collections.sort(ds, (a, b) -> {
            if(a.getTb() != b.getTb()) return Double.compare(b.getTb(), a.getTb());
            return a.getMa().compareTo(b.getMa());
        });
        for(Diem d : ds){
            System.out.println(d);
        }
    }
}
/*
4
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
*/