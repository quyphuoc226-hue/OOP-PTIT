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
public class J01003_GIAI_PHUONG_TRINH_BAC_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0 && b == 0) System.out.println("VSN");
        else if(a == 0 && b != 0) System.out.println("VN");
        else{
            double ans = (-1.0) * b / a;
            System.out.printf("%.2f", ans);
        }
    }
}
