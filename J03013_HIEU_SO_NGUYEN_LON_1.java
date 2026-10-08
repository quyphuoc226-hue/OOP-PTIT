package com.example.JavaPTIT;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013_HIEU_SO_NGUYEN_LON_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            int l = Math.max(a.toString().length(), b.toString().length());
            String ans = a.subtract(b).abs().toString();
            while(ans.length() < l){
                ans = "0" + ans;
            }
            System.out.println(ans);
        }
    }
}
