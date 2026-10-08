package com.example.JavaPTIT;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J02007_DEM_SO_LAN_XUAT_HIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int dem = 1; dem <= t; dem++){
            Map<Integer, Integer> mp = new LinkedHashMap<>();
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            for(int x : a){
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            System.out.printf("Test %d:\n", dem);
            for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
                System.out.printf("%d xuat hien %d lan\n", entry.getKey(), entry.getValue());
            }
        }
    }
}
