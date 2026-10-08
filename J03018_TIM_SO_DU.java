package com.example.JavaPTIT;

import java.math.BigInteger;
import java.util.Scanner;

public class J03018_TIM_SO_DU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = BigInteger.valueOf(4);
            if(a.remainder(b) != BigInteger.ZERO) System.out.println(0);
            else System.out.println(4);
        }
    }
}
