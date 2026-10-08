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
    public String getMon(){
        StringBuilder sb = new StringBuilder();
        String[] temp = this.mon.split(" ");
        for(String x : temp){
            sb.append(x.toUpperCase().charAt(0));
        }
        return sb.toString();
    }
    public String getTen1(){
        return this.ten;
    }
    public String getTen(){
        StringBuilder sb = new StringBuilder();
        String[] temp = this.ten.split(" ");
        for(String x : temp){
            sb.append(x.toUpperCase());
        }
        return sb.toString();
    }
    @Override
    public String toString(){
        return String.format("GV%02d", ma) + " " + ten + " " + getMon();
    }
}
public class J05027_TIM_KIEM_GIANG_VIEN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            GiangVien a = new GiangVien(i + 1, sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        int q = sc.nextInt();
        while(q-- > 0){
            GiangVien Q = new GiangVien(0, sc.next(), "");
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n", Q.getTen1());
            for(int i = 0; i < n; i++){
                if(ds.get(i).getTen().contains(Q.getTen())){
                    System.out.println(ds.get(i));
                }
            }

        }
    }
}
