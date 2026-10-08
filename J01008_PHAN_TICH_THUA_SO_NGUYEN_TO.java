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
public class J01008_PHAN_TICH_THUA_SO_NGUYEN_TO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 1; j <= t; j++){   
            long n = sc.nextLong();
            System.out.print("Test " + j + ": ");
            for(int i = 2; i * i <= n; i++){
                int dem = 0;
                if(n % i == 0){
                    while(n % i == 0){
                        n /= i;
                        dem++;
                    }
                    System.out.print(i + "(" + dem + ")" + " ");
                }
            }
            if(n != 1) System.out.print(n + "(1)");
            System.out.println();
        }
    }
}
