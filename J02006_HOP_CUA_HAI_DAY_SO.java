package com.example.JavaPTIT;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02006_HOP_CUA_HAI_DAY_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < n + m; i++){
            int temp = sc.nextInt();
            set.add(temp);
        }
        for(Integer x : set) System.out.printf(x + " ");
    }
}
