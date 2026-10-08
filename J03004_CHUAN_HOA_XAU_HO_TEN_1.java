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
public class J03004_CHUAN_HOA_XAU_HO_TEN_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String a[] = s.trim().split("\\s+");
            for(String x : a){
                System.out.print(Character.toUpperCase(x.charAt(0)));
                for(int i = 1; i < x.length(); i++){
                    System.out.print(Character.toLowerCase(x.charAt(i)));
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}