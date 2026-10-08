package com.example.JavaPTIT;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

class HoaDon{
    private String ten, phong;
    private long phatSinh, ma, tien, soNgay;
    private Date vao, ra;

    public HoaDon(long ma, String ten, String phong, String vao, String ra, long phatSinh) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.vao = sdf.parse(vao);
        this.ra = sdf.parse(ra);
        this.phatSinh = phatSinh;
    }

    public String getMa() {
        return String.format("KH%02d", ma);
    }

    public long getSoNgay() {
        long d = ra.getTime() - vao.getTime();
        long day = TimeUnit.MILLISECONDS.toDays(d);
        return day + 1;
    }

    public long getTien() {
        int heSo;
        if(this.phong.charAt(0) == '1') heSo = 25;
        else if(this.phong.charAt(0) == '2') heSo = 34;
        else if(this.phong.charAt(0) == '3') heSo = 50;
        else heSo = 80;
        return heSo * getSoNgay() + this.phatSinh;
    }
    @Override
    public String toString(){
        return getMa() + " " + ten + " " + phong + " " + getSoNgay() + " " + getTien();
    }
}
public class J05016_HOA_DON_KHACH_SAN {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<HoaDon> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            HoaDon a = new HoaDon(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLong());
            ds.add(a);
            sc.nextLine();
        }
        Collections.sort(ds, (a, b) -> Long.compare(b.getTien(), a.getTien()));
        for(HoaDon hoaDon : ds){
            System.out.println(hoaDon);
        }
    }
}