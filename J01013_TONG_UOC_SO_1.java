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
public class J01013_TONG_UOC_SO_1 {
    static int MAX = 2000006;
    static int[] A = new int[MAX];
    public static void Sang(){
        for(int i = 0; i <= 2000000; i++){
            A[i] = 1;
        }
        A[0] = A[1] = 0;
        for(int i = 2; i * i <= 2000000; i++){
            if(A[i] == 1){
                for(int j = i * i; j <= 2000000; j += i){
                    A[j] = i;
                }
            }
        }
        for(int i = 0; i <= 2000000; i++){
            if(A[i] == 1) A[i] = i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Sang();
        long tong = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            
            while(n != 1){
                tong += A[n];
                n /= A[n];
            }
            
        }
        System.out.println(tong);
    }
}
