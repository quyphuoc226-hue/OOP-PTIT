package com.example.JavaPTIT;
import java.util.ArrayList;
import java.util.Scanner;
class ThiSinh{
    private String ten, ma, ketQua;
    private float toan, ly, hoa, uuTien, tong, xetTuyen;
    public ThiSinh(String ma, String ten, float toan, float ly, float hoa){
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if (ma.substring(0, 3).equals("KV1")) uuTien = 0.5F;
        else if(ma.substring(0, 3).equals("KV2")) uuTien = 1.0F;
        else uuTien = 2.5F;
        tong = toan * 2 + ly + hoa;
        xetTuyen = tong + uuTien;
        if(xetTuyen >= 24) ketQua = "TRUNG TUYEN";
        else ketQua = "TRUOT";
    }
    public String check(float a){
        if(a == (int)a) return String.format("%.0f", a);
        return String.format("%.1f", a);
    }
    public int compare(ThiSinh a){
        if(a.xetTuyen != this.xetTuyen) return Float.compare(a.xetTuyen, this.xetTuyen);
        return this.ma.compareTo(a.ma);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + check(uuTien) + " " + check(xetTuyen) + " " + ketQua;
    }
}
public class J05058_SAP_XEP_KET_QUA_TUYEN_SINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ThiSinh a = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            ds.add(a);
            sc.nextLine();
        }
        ds.sort((a, b) -> a.compare(b));
        for(ThiSinh x : ds){
            System.out.println(x);
        }
    }
}