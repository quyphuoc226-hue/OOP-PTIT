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

public class J01020_DAY_DU_CAC_CHU_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n == 0) System.out.println("Impossible");
            else {
                boolean[] vis = new boolean[10];
                int k = n;
                boolean ok = true;
                int X = k;
                while(X > 0){
                    int D = X % 10;
                    vis[D] = true;
                    X /= 10;
                }
                while(ok){
                    ok = false;
                    k = k + n;
                    int x = k;
                    while(x > 0){
                        int d = x % 10;
                        x /= 10;
                        vis[d] = true;
                    }
                    for(int i = 0; i <= 9; i++){
                        if(vis[i] == false){
                            ok = true;
                            break;
                        }
                    }
                }
                System.out.println(k);
            }
        }
    }
}
