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
    public String getMa(){
        return String.format("GV%02d", ma);
    }
    @Override
    public String toString(){
        return getMa() + " " + ten + " " + getMon();
    }
}
public class J05026_DANH_SACH_GIANG_VIEN_THEO_BO_MON {
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
        sc.nextLine();
        while(q-- > 0){
            GiangVien Q = new GiangVien(0, "", sc.nextLine());
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n", Q.getMon());
            for(int i = 0; i < n; i++){
                if(ds.get(i).getMon().equals(Q.getMon())){
                    System.out.println(ds.get(i));
                }
            }
        }
    }
}
