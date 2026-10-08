/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JavaPTIT;

import java.util.Scanner;

/**
 *
 * @author Hoang Quy Phuoc
 */
public class J01021_TINH_LUY_THUA {
    static int MOD = 1000000007;
    public static long LuyThua(long n, long k){
        if(k == 0) return 1;
        long X = LuyThua(n, k / 2) % MOD;
        if(k % 2 == 0) return X * X % MOD;
        else return X * X % MOD * n % MOD;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0) break;
            System.out.println((long) LuyThua(a, b));
        }
        
    }
}
