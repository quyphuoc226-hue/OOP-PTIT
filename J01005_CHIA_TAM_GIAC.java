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
public class J01005_CHIA_TAM_GIAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double n = sc.nextDouble();
            double h = sc.nextDouble();
            for(int i = 1; i <= n - 1; i++){
                System.out.printf("%.6f ", (double)Math.sqrt(i / n) * h);
            }
            System.out.println();
        } 
    }
}
