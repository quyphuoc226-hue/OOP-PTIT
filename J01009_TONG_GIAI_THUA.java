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
public class J01009_TONG_GIAI_THUA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tich = 1;
        long ans = 0;
        for(int i = 1; i <= n; i++){
            tich *= i;
            ans += tich;
        }
        System.out.print(ans);
    }
}
