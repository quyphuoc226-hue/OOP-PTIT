package com.example.JavaPTIT;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03009_TAP_TU_RIENG_CUA_HAI_XAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            Set<String> set1 = new TreeSet<>();
            Set<String> set2 = new TreeSet<>();
            String a = sc.nextLine();
            String[] s1 = a.split(" ");
            for(String x : s1) {
                set1.add(x);
            }
            String b = sc.nextLine();
            String[] s2 = b.split(" ");
            for(String x : s2){
                set2.add(x);
            }
            for(String x : set1){
                if(!set2.contains(x)) System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
