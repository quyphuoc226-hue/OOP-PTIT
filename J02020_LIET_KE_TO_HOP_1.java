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
public class J02020_LIET_KE_TO_HOP_1 {
    static int n, k;
    static int a[] = new int[20];
    static int cnt = 0;
    public static void inkq(){
        for(int i = 1; i <= k; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void Try(int i){
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k){
                cnt++;
                inkq();
                System.out.println("");
            }
            else Try(i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
