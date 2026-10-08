package com.example.JavaPTIT;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

class VDV{
    private String ten, ns, st, en, thuc, thanhTich;
    private int ma, hang, uuTien;
    private long tgian;
    public VDV(int ma, String ten, String ns, String st, String en){
        this.ma = ma;
        this.ten = ten;
        this.ns = ns;
        this.st = st;
        this.en = en;
        LocalTime a = LocalTime.parse(st);
        LocalTime b = LocalTime.parse(en);
        long d = Duration.between(a, b).getSeconds();
        thuc = chuyen(d);
        int tuoi = 2021 - Integer.parseInt(ns.substring(6));
        if(tuoi < 18) uuTien = 0;
        else if (tuoi < 25) uuTien = 1;
        else if (tuoi <= 32) uuTien = 2;
        else uuTien = 3;
        tgian = d - uuTien;
        thanhTich = chuyen(tgian);

    }
    public int compare(VDV a){
        return Long.compare(this.tgian, a.tgian);
    }
    public int compareMa(VDV a){
        return Integer.compare(this.ma, a.ma);
    }
    public String chuyen(long d){
        long hour = d / 3600;
        long min = (d - hour * 3600) / 60;
        long sec = d - hour * 3600 - min * 60;
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }

    public long getTgian() {
        return tgian;
    }

    public void setHang(int hang) {
        this.hang = hang;
    }

    public int getHang() {
        return hang;
    }

    @Override
    public String toString(){
        return String.format("VDV%02d", ma) + " " + ten + " " + thuc + " " + String.format("00:00:%02d", uuTien) + " " + thanhTich + " " + hang;
    }
}
public class J05055_XEP_HANG_VAN_DONG_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<VDV> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            VDV a = new VDV(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        ds.sort((a, b) -> a.compare(b));
        ds.get(0).setHang(1);
        for(int i = 1; i < n; i++){
            if(ds.get(i).getTgian() != ds.get(i - 1).getTgian()){
                ds.get(i).setHang(i + 1);
            }
            else{
                ds.get(i).setHang(ds.get(i - 1).getHang());
            }
        }
        ds.sort((a, b) -> a.compareMa(b));
        for(int i = 0; i < n; i++){
            System.out.println(ds.get(i));
        }
    }
}
