package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class NhanVien{
    String ma, ten, chuc;
    int bac, stt;
    static int cnt_GD = 0, cnt_TP = 0, cnt_PP = 0;
    public NhanVien(String ma, String ten){
        this.ma = ma;
        this.ten = ten;
        chuc = ma.substring(0, 2);
        bac = Integer.parseInt(ma.substring(2, 4));
        stt = Integer.parseInt(ma.substring(4, 7));
        if(chuc.equals("GD") && cnt_GD >= 1 || chuc.equals("TP") && cnt_TP >= 3 || chuc.equals("PP") && cnt_PP >= 3) chuc = "NV";
        else if(chuc.equals("GD")) cnt_GD++;
        else if(chuc.equals("TP")) cnt_TP++;
        else if(chuc.equals("PP")) cnt_PP++;
    }
    public int compare(NhanVien a){
        if(a.bac != this.bac) return Integer.compare(a.bac, this.bac);
        return Integer.compare(this.stt, a.stt);
    }
    public String toString(){
        return ten + " " + chuc + " " + String.format("%03d", stt) + " " + String.format("%02d", bac);
    }
}
public class J05065_LIET_KE_NHAN_VIEN_THEO_NHOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String[] temp = sc.nextLine().split(" ", 2);
            ds.add(new NhanVien(temp[0], temp[1]));
        }
        ds.sort((a, b) -> a.compare(b));
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++){
            String Q = sc.nextLine();
            ds.forEach(e -> {
                if(e.chuc.equals(Q)) System.out.println(e);
            });
            System.out.println();
        }
    }
}
