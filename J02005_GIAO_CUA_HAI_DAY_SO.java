package com.example.JavaPTIT;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02005_GIAO_CUA_HAI_DAY_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }
        Set<Integer> ds = new TreeSet<>();
        for(int i = 0; i < m; i++){
            int temp = sc.nextInt();
            if(set.contains(temp)) ds.add(temp);
        }
        for(Integer x : ds){
            System.out.print(x + " ");
        }
    }
}
