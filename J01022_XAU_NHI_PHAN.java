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
public class J01022_XAU_NHI_PHAN {
    static long[] F = new long[100];
    public static void Fibo(){
        F[1] = 1;
        F[2] = 1;
        for(int i = 3; i <= 92; i++){
            F[i] = F[i - 1] + F[i - 2]; 
        }
    }
    public static int find(int n, long k){
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k > F[n - 2]) return find(n - 1, k - F[n - 2]);
        else return find(n - 2, k);
    }
    public static void main(String[] args) {
        Fibo();
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println((int)find(n, k));
        }
    }
}





