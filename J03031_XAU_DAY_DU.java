package com.example.JavaPTIT;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03031_XAU_DAY_DU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int k = sc.nextInt();
            Set<Character> set = new TreeSet<>();
            for(int i = 0; i < s.length(); i++){
                set.add(s.toLowerCase().charAt(i));
            }
            if(26 - set.size() <= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
