package com.example.JavaPTIT;

import java.util.Scanner;

public class J03007_SO_DEP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(s.charAt(0) != '8') System.out.println("NO");
            else {
                int mid = s.length() / 2;
                int tong = 0;
                for(int i = 0; i < mid; i++){
                    tong += s.charAt(i) - '0';
                }
                if(s.length() % 2 == 0) tong *= 2;
                else tong *= 2 + s.charAt(mid + 1);
                if(tong % 10 != 0) System.out.println("NO");
                else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(s).reverse();
                    String rev = sb.toString();
                    if(!rev.equals(s)) System.out.println("NO");
                    else System.out.println("YES");
                }
            }
        }
    }
}
