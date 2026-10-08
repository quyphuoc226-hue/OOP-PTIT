package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Scanner;

class Person{
    private String ten, ns;
    public Person(String ten, String ns){
        this.ten = ten;
        this.ns = ns;
    }
    public int compare(Person a){
        String[] temp1 = a.ns.split("/");
        String[] temp2 = this.ns.split("/");
        int nam1 = Integer.parseInt(temp1[2]);
        int nam2 = Integer.parseInt(temp2[2]);
        int thang1 = Integer.parseInt(temp1[1]);
        int thang2 = Integer.parseInt(temp2[1]);
        int ngay1 = Integer.parseInt(temp1[0]);
        int ngay2 = Integer.parseInt(temp2[0]);
        if(nam1 != nam2) return Integer.compare(nam1, nam2);
        if(thang1 != thang2) return Integer.compare(thang1, thang2);
        return Integer.compare(ngay1, ngay2);
    }
    @Override
    public String toString(){
        return ten;
    }
}
public class J05032_TRE_NHAT_GIA_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Person> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Person a = new Person(sc.next(), sc.next());
            ds.add(a);
        }
        ds.sort((a, b) -> a.compare(b));
        System.out.println(ds.get(0));
        System.out.println(ds.get(n - 1));
    }
}
