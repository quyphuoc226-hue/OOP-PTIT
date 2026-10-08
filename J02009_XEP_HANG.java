/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JavaPTIT;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hoang Quy Phuoc
 */
public class J02009_XEP_HANG {

    static class Pair {

        int t;
        int d;

        Pair(int t, int d) {
            this.t = t;
            this.d = d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] a = new Pair[n];
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int d = sc.nextInt();
            a[i] = new Pair(t, d);
        }
        Arrays.sort(a, (x, y) -> x.t - y.t);
        int ans = a[0].t + a[0].d;
        for (int i = 1; i < n; i++) {
            if (ans < a[i].t) {
                ans = a[i].t;
            }
            ans += a[i].d;
        }
        System.out.println(ans);
    }
}
