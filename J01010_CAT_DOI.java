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
public class J01010_CAT_DOI {
    public static boolean check(char c[], int n){
        for(int i = 0; i < n; i++){
            if(c[i] != '0' && c[i] != '1' && c[i] != '8' && c[i] != '9') return false;
            else {
                if(c[i] == '0') c[i] = '0';
                else if(c[i] == '1') c[i] = '1';
                else if(c[i] == '8') c[i] = '0';
                else if(c[i] == '9') c[i] = '0';
            }
        }
        boolean ok = false;
        for(int i = 0; i < n; i++){
            if(c[i] != '0'){
                ok = true;
                break;
            }
        }
        if(!ok) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            char[] c = new char[s.length()];
            for(int i = 0; i < s.length(); i++){
                c[i] = s.charAt(i);
            }
            if(check(c, s.length())){
                boolean ok = false;
                for(int i = 0; i < s.length(); i++){
                    if(c[i] != '0'){
                        ok = true;
                    }
                    if(ok) System.out.print(c[i]);
                }
                System.out.println();
            }
            else System.out.println("INVALID");
        }
    }
}
