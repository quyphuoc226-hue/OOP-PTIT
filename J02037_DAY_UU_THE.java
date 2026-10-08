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
public class J02037_DAY_UU_THE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String a[] = s.split(" ");
            int chan = 0;
            int le = 0;
            for(String x : a){
                int X = Integer.parseInt(x);
                if(X % 2 == 0) chan++;
                else le++;
            }
            int cnt = chan + le;
            if(cnt % 2 == 0 && chan > le || cnt % 2 != 0 && le > chan) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
