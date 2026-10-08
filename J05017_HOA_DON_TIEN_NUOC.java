package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class HoaDon1{
    private String ten;
    private int cu, moi, ma;
    private double tien;
    public HoaDon1(String ten, int cu, int moi, int ma){
        this.ten = ten;
        this.cu = cu;
        this.moi = moi;
        this.ma = ma;
    }
    public double getTien(){
        int d = moi - cu;
        int tong = 0;
        if(d < 51){
            tong = d * 100;
            this.tien = tong + tong * (2.0) / 100;
        }
        else if(d >= 51 && d < 101){
            tong = 50 * 100 + (d - 50) * 150;
            this.tien = tong + tong * (3.0) / 100;
        }
        else{
            tong = 50 * 100 + 50 * 150 + (d - 100) * 200;
            this.tien = tong + tong * (5.0) / 100;
        }
        return this.tien;
    }
    public String getMa(){
        return String.format("KH%02d", ma);
    }
    @Override
    public String toString(){
        return getMa() + " " + ten + " " + String.format("%.0f", getTien());
    }
}
public class J05017_HOA_DON_TIEN_NUOC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<HoaDon1> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            HoaDon1 a = new HoaDon1(sc.nextLine(), sc.nextInt(), sc.nextInt(), i + 1);
            ds.add(a);
            sc.nextLine();
        }
        Collections.sort(ds, (a, b) -> Double.compare(b.getTien(), a.getTien()));
        for(HoaDon1 hd : ds){
            System.out.println(hd);
        }
    }
}