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
public class J01012_UOC_SO_CHIA_HET_CHO_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long tong = 1;
            long le = 1;
            long n = sc.nextLong();
            for(int i = 2; i * i <= n; i++){
                if(n % i == 0){
                    int dem = 0;
                    while(n % i == 0){
                        dem ++;
                        n /= i;
                    }
                    tong *= (dem + 1);
                    if(i % 2 == 1){
                        le *= (dem + 1);
                    }
                }
            }
            if(n != 1) tong *= 2;
            if(n != 1 && n % 2 == 1) le *= 2;
            System.out.println(tong - le);
        }
    }
}
