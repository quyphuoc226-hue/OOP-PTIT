package com.example.JavaPTIT;
import java.util.ArrayList;
import java.util.Scanner;
class ThiSinh{
    String ten, ma, ketQua;
    float toan, ly, hoa, uuTien, tong, xetTuyen;
    public ThiSinh(String ma, String ten, float toan, float ly, float hoa){
        this.ma = ma;
        this.ten = ten;
        if (ma.substring(0, 3).equals("KV1")) uuTien = 0.5F;
        else if(ma.substring(0, 3).equals("KV2")) uuTien = 1.0F;
        else uuTien = 2.5F;
        tong = toan * 2 + ly + hoa;
        xetTuyen = tong + uuTien;
    }
    public String check(float a){
        if(a == (int)a) return String.format("%.0f", a);
        return String.format("%.1f", a);
    }
    public int compare(ThiSinh a){
        if(this.xetTuyen != a.xetTuyen) return Float.compare(this.xetTuyen, a.xetTuyen);
        return a.ma.compareTo(this.ma);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + check(uuTien) + " " + check(xetTuyen) + " " + ketQua;
    }
}
public class J05059_XAC_DINH_DANH_SACH_TRUNG_TUYEN {
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
        ds.sort((a, b) -> b.compare(a));
        int soLuong = sc.nextInt();
        float diemChuan = ds.get(soLuong - 1).xetTuyen;
        System.out.println(diemChuan);
        ds.forEach(e -> {
                if(e.xetTuyen >= diemChuan) e.ketQua = "TRUNG TUYEN";
                else e.ketQua = "TRUOT";
        });
        ds.forEach(e -> System.out.println(e));
    }
}