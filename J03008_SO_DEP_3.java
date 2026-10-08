package com.example.JavaPTIT;

import java.util.Scanner;

public class J03008_SO_DEP_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            boolean ok = true;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7') {
                    ok = false;
                }
            }
            if(!ok) System.out.println("NO");
            else {
                StringBuilder sb = new StringBuilder();
                sb.append(s).reverse();
                String rev = sb.toString();
                if(!s.equals(rev)) System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
