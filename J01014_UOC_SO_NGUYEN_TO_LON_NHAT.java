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
public class J01014_UOC_SO_NGUYEN_TO_LON_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long ans = 0;
            long n = sc.nextLong();
            for(long i = 2; i * i <= n; i++){
                if(n % i == 0){
                    ans = i;
                    while(n % i == 0){
                        n /= i;
                    }
                }
            }
            if(n != 1) ans = n;
            System.out.println(ans);
        }
    }
}
