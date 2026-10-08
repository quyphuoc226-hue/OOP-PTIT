package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class Time{
    private int gio, phut, giay;
    public Time(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public int compare(Time a){
        if(a.gio != this.gio) return Integer.compare(a.gio, this.gio);
        if(a.phut != this.phut) return Integer.compare(a.phut, this.phut);
        return Integer.compare(a.giay, this.giay);
    }
    @Override
    public String toString(){
        return gio + " " + phut + " " + giay;
    }
}
public class J05033_SAP_XEP_THOI_GIAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Time a = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            ds.add(a);
        }
        ds.sort((a, b) -> b.compare(a));
        for(int i = 0; i < n; i++){
            System.out.println(ds.get(i));
        }
    }
}
