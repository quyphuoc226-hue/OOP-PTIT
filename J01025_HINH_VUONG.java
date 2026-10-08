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
public class J01025_HINH_VUONG {
    public static double khoangCach(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        double x3 = sc.nextInt();
        double y3 = sc.nextInt();
        double x4 = sc.nextInt();
        double y4 = sc.nextInt();
        double MAX = Math.max(khoangCach(x1, y1, x2, y2), khoangCach(x1, y1, x3, y3));
        MAX = Math.max(MAX, khoangCach(x1, y1, x4, y4));
        MAX = Math.max(MAX, khoangCach(x2, y2, x3, y3));
        MAX = Math.max(MAX, khoangCach(x2, y2, x4, y4));
        MAX = Math.max(MAX, khoangCach(x3, y3, x4, y4));
        int ans = (int) ((int) MAX * MAX);
        System.out.println(ans);
    }
    
}
