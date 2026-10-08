package com.example.JavaPTIT;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016_CHIA_HET_CHO_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = BigInteger.valueOf(11);
            if(a.remainder(b) == BigInteger.ZERO) System.out.println("1");
            else System.out.println("0");
        }
    }
}
