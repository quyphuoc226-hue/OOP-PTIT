package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class GiangVien{
    private String ten, mon;
    private int ma;
    public GiangVien(int ma, String ten, String mon){
        this.ma = ma;
        this.ten = ten;
        this.mon = mon;
    }

    public String getMa(){
        return String.format("GV%02d", this.ma);
    }

    public String getMon() {
        String[] temp = this.mon.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String x : temp){
            sb.append(x.toUpperCase().charAt(0));
        }
        return sb.toString();
    }
    public String getTen(){
        String[] temp = this.ten.split(" ");
        return temp[temp.length - 1];
    }
    public int compare(GiangVien a){

        if(!a.getTen().equals(this.getTen())) return this.getTen().compareTo(a.getTen());
        return this.getMa().compareTo(a.getMa());
    }
    @Override
    public String toString(){
        return getMa() + " " + ten + " " + getMon();
    }
}
public class J05025_SAP_XEP_DANH_SACH_GIANG_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            GiangVien a = new GiangVien(i + 1, sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        ds.sort((a, b) -> a.compare(b));
        for(int i = 0; i < n; i++){
            System.out.println(ds.get(i));
        }
    }
}
