package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    private String ma, ten, lop, email;
    public  SinhVien(String ma, String ten, String lop, String email){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    public String getNganh(){
        String nganh = this.ma.substring(5, 7);
        if(nganh.equals("CN") && lop.charAt(0) != 'E') return "CONG NGHE THONG TIN";
        if(nganh.equals("KT")) return "KE TOAN";
        if(nganh.equals("AT") && lop.charAt(0) != 'E') return "AN TOAN THONG TIN";
        if(nganh.equals("VT")) return "VIEN THONG";
        if(nganh.equals("DT")) return "DIEN TU";
        return "";
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }
}
public class J05024_LIET_KE_SINH_VIEN_THEO_NGANH {
    public static String vietHoa(String Q){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Q.length(); i++){
            sb.append(Q.toUpperCase().charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String Q = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", vietHoa(Q));
            for(int i = 0; i < n; i++){
                if(ds.get(i).getNganh().equals(vietHoa(Q))){
                    System.out.println(ds.get(i));
                }
            }
        }
    }
}
