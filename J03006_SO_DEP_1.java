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
public class J03006_SO_DEP_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            boolean ok = true;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != '2' && s.charAt(i) != '4' && s.charAt(i) != '6' && s.charAt(i) != '8' && s.charAt(i) != '0'){
                    ok = false;
                }
            }
            if(!ok) System.out.println("NO");
            else {
                String rev = new StringBuilder(s).reverse().toString();
                if(s.equals(rev)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
