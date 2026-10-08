package com.example.JavaPTIT;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

class KhachHang{
    private String ma, ten, vao, ra;
    private int time, gio, phut;

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

    public String getVao() {
        return vao;
    }

    public void setVao(String vao) {
        this.vao = vao;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public int getTime() {
        return time;
    }

    public void setTime() {
        LocalTime a = LocalTime.parse(vao);
        LocalTime b = LocalTime.parse(ra);
        long d = Duration.between(a, b).toMinutes();
        int gio = (int)d / 60;
        int phut = (int)d % 60;
        this.gio = gio;
        this.phut = phut;
    }
    public int compareTime(KhachHang a){
        if(this.gio != a.gio) return Integer.compare(this.gio, a.gio);
        return Integer.compare(this.phut, a.phut);
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }
}
public class J05011_TINH_GIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        KhachHang[] ds = new KhachHang[n];
        for(int i = 0; i < n; i++){
            ds[i] = new KhachHang();
            ds[i].setMa(sc.nextLine());
            ds[i].setTen(sc.nextLine());
            ds[i].setVao(sc.nextLine());
            ds[i].setRa(sc.nextLine());
            ds[i].setTime();
        }
        Arrays.sort(ds, (a, b) -> b.compareTime(a));
        for(int i = 0; i < n; i++){
            System.out.printf("%s %s %d" + " gio " + "%d" + " phut\n", ds[i].getMa(), ds[i].getTen(), ds[i].getGio(), ds[i].getPhut());
        }
    }
}
