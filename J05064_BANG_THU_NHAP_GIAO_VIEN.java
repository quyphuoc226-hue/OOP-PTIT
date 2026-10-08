package com.example.JavaPTIT;


import java.util.ArrayList;
import java.util.Scanner;

class GiaoVien{
    String ma, ten, chuc;
    int bac, phu, luongcb, thunhap;
    public GiaoVien(String ma, String ten, int luongcb){
        this.ma = ma;
        this.ten = ten;
        this.luongcb = luongcb;
        chuc = ma.substring(0, 2);
        bac = Integer.parseInt(ma.substring(2));
        if(chuc.equals("HT")) phu = 2000000;
        else if(chuc.equals("HP")) phu = 900000;
        else phu = 500000;
        thunhap = luongcb * bac + phu;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + bac + " " + phu + " " + thunhap;
    }
}
public class J05064_BANG_THU_NHAP_GIAO_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiaoVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ds.add(new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextInt()));
            sc.nextLine();
        }
        int cnt_HT = 0, cnt_HP = 0;
        for(GiaoVien e : ds)  {
            if(!e.chuc.equals("HT") && !e.chuc.equals("HP")){
                System.out.println(e);
            }
            else if(e.chuc.equals("HT") && cnt_HT < 1){
                System.out.println(e);
                cnt_HT++;
            }
            else if(e.chuc.equals("HP") && cnt_HP < 2){
                System.out.println(e);
                cnt_HP++;
            }
        }
    }
}
