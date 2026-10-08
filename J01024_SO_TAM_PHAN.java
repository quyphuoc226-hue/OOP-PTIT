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
public class J01024_SO_TAM_PHAN {
    public static boolean check(int n){
        while(n > 0){
            int d = n % 10;
            if(d != 0 && d != 1 && d != 2) return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
