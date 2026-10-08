package com.example.JavaPTIT;

import java.util.Scanner;

public class J03032_DAO_TU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] temp = s.split(" ");
            StringBuilder ans = new StringBuilder();
            for(String x : temp){
                StringBuilder sb = new StringBuilder();
                sb.append(x).reverse().append(" ");
                ans.append(sb.toString());
            }
            System.out.println(ans.toString());
        }
    }
}
