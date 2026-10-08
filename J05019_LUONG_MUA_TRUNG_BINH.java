package com.example.JavaPTIT;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

class Tram{
    private String ten, bd, kt;
    private int sl, ma, tong;
    private double time;

    public Tram(String ten, String bd, String kt, int sl){
        this.ten = ten;
        this.bd = bd;
        this.kt = kt;
        this.sl = sl;
    }
    public double getTime(){
        LocalTime a = LocalTime.parse(this.bd);
        LocalTime b = LocalTime.parse(this.kt);
        Duration d = Duration.between(a, b);
        long time = d.toMinutes();
        long hour = time / 60;
        long min = time % 60;
        return (double)(hour + (double)min / 60);
    }
    public String getTen(){
        return ten;
    }
    public int getSl(){
        return sl;
    }

}
public class J05019_LUONG_MUA_TRUNG_BINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Tram> ds = new ArrayList<>();
        Set<String> tenTram = new LinkedHashSet<>();
        for(int i = 0; i < n; i++){
            Tram a = new Tram(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
            sc.nextLine();
            ds.add(a);
            tenTram.add(a.getTen());
        }
        int dem = 1;
        for(String x : tenTram){
            int sl = 0;
            String ma = String.format("T%02d", dem);
            dem += 1;
            double time = 0;
            for(int i = 0; i < n; i++){
                if(ds.get(i).getTen().equals(x)){
                    sl += ds.get(i).getSl();
                    time += ds.get(i).getTime();
                }
            }
            System.out.printf("%s %s %.2f\n", ma, x, (double) sl / time);
        }

    }
}
