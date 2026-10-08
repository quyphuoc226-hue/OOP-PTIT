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
public class J01018_SO_KHONG_LIEN_KE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            boolean ok = true;
            int dem = 0;
            String str = sc.next();
            for(int i = 0; i < str.length() - 1; i++){
                dem += str.charAt(i) - '0';
                if(Math.abs(str.charAt(i) - str.charAt(i + 1)) != 2){
                    ok = false;
                    break;
                }
            }
            dem += str.charAt(str.length() - 1) - '0';
            if(dem % 10 != 0) ok = false;
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
