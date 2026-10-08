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
public class J01006_TINH_SO_FIBONACCI {

    public static void main(String[] args) {
        long[] F = new long[95];
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i < 93; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(F[n]);
        }
    }
}
