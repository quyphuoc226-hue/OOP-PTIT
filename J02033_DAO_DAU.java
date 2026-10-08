package com.example.JavaPTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02033_DAO_DAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            a.add(temp);
        }
        Collections.sort(a);
        int ans = 0;
        for(int i = 1; i < n; i++){
            ans += a.get(i);
        }
        if(k % 2 == 0) ans += a.get(0);
        else ans += a.get(0) * -1;
        System.out.println(ans);
    }
}
