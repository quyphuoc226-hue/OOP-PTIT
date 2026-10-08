package com.example.JavaPTIT;

import java.util.Scanner;

class SoPhuc{
    private int thuc, ao;

    public int getThuc() {
        return thuc;
    }

    public void setThuc(int thuc) {
        this.thuc = thuc;
    }

    public int getAo() {
        return ao;
    }

    public void setAo(int ao) {
        this.ao = ao;
    }

    public SoPhuc cong(SoPhuc a){
        SoPhuc b = new SoPhuc();
        b.thuc = a.thuc + this.thuc;
        b.ao = a.ao + this.ao;
        return b;
    }

    public SoPhuc nhan(SoPhuc a){
        SoPhuc b = new SoPhuc();
        b.thuc = a.thuc * this.thuc - a.ao * this.ao;
        b.ao = a.ao * this.thuc + this.ao * a.thuc;
        return b;
    }

    public String fomatAo(){
        if(this.ao >= 0) return String.format("+ %d", this.ao);
        return String.format("- %d", Math.abs(this.ao));
    }
}
public class J04018_SO_PHUC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            SoPhuc a = new SoPhuc();
            SoPhuc b = new SoPhuc();

            a.setThuc(sc.nextInt());
            a.setAo(sc.nextInt());

            b.setThuc(sc.nextInt());
            b.setAo(sc.nextInt());

            SoPhuc c = new SoPhuc();
            c = a.nhan(a.cong(b));
            SoPhuc d = new SoPhuc();
            d = a.cong(b).nhan(a.cong(b));
            System.out.printf("%d %si, %d %si\n", c.getThuc(), c.fomatAo(), d.getThuc(), d.fomatAo());

        }
    }
}
