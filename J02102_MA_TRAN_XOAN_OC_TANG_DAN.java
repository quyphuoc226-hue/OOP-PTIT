/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JavaPTIT;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hoang Quy Phuoc
 */
public class J02102_MA_TRAN_XOAN_OC_TANG_DAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int [] A = new int[n * n];
        for(int i = 0; i < n * n; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
        int cnt = 0;
        while(h1 <= h2 && c1 <= c2){
            for(int i = c1; i <= c2; i++){
                a[h1][i] = A[cnt++];
            }
            h1++;
            for(int i = h1; i <= h2; i++){
                a[i][c2] = A[cnt++];
            }
            c2--;
            if(h2 > h1){
                for(int i = c2; i >= c1; i--){
                    a[h2][i] = A[cnt++];
                }
                h2--;
            }
            if(c2 > c1){
                for(int i = h2; i >= h1; i--){
                    a[i][c1] = A[cnt++];
                }
                c1++;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
