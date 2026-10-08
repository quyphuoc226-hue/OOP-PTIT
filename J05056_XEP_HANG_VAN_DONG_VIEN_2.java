package com.example.JavaPTIT;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
class VDV {
    private String hoTen, ngaySinh, xuatPhat, ketThuc;
    private int ma, rank, uuTien, thanhTichThuc, thanhTichXepHang;
    public VDV(int ma, String hoTen, String ngaySinh, String xuatPhat, String ketThuc) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.xuatPhat = xuatPhat;
        this.ketThuc = ketThuc;
        int tuoi = 2021 - Integer.parseInt(ngaySinh.substring(6));
        if (tuoi < 18) uuTien = 0;
        else if (tuoi < 25) uuTien = 1;
        else if (tuoi < 32) uuTien = 2;
        else uuTien = 3;
        LocalTime st = LocalTime.parse(xuatPhat);
        LocalTime en = LocalTime.parse(ketThuc);
        long d = Duration.between(st, en).getSeconds();
        thanhTichThuc = (int) (d);
        thanhTichXepHang = (int) (d - uuTien);
    }
    public int compare(VDV a) {
        return Integer.compare(this.thanhTichXepHang, a.thanhTichXepHang);
    }
    public int getThanhTichXepHang() {
        return thanhTichXepHang;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public String chuyen(long d) {
        long hour = d / 3600;
        long min = (d - hour * 3600) / 60;
        long sec = d - hour * 3600 - min * 60;
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
    @Override
    public String toString() {
        return String.format("VDV%02d", ma) + " " + hoTen + " " + chuyen(thanhTichThuc) + " " + chuyen(uuTien) + " " + chuyen(thanhTichXepHang) + " " + rank;
    }
}
public class J05056_XEP_HANG_VAN_DONG_VIEN_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<VDV> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            VDV a = new VDV(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        ds.sort((a, b) -> a.compare(b));
        ds.get(0).setRank(1);
        for(int i = 1; i < n; i++){
            if(ds.get(i).getThanhTichXepHang() == ds.get(i - 1).getThanhTichXepHang()) ds.get(i).setRank(ds.get(i - 1).getRank());
            else ds.get(i).setRank(i + 1);
        }
        for(VDV x : ds){
            System.out.println(x);
        }
    }
}
