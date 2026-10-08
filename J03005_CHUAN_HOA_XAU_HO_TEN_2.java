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
public class J03005_CHUAN_HOA_XAU_HO_TEN_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String a[] = s.trim().split("\\s+");
            for(int i = 1; i < a.length; i++){
                System.out.print(Character.toUpperCase(a[i].charAt(0)));
                for(int j = 1; j < a[i].length(); j++){
                    System.out.print(Character.toLowerCase(a[i].charAt(j)));
                }
                if(i == a.length - 1) System.out.print(", ");
                else System.out.print(" ");
            }
            System.out.println(a[0].toUpperCase());
        }
    }
}
