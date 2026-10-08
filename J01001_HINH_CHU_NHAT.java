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
public class J01001_HINH_CHU_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cd = sc.nextInt();
        int cr = sc.nextInt();
        if(cd <= 0 || cr <= 0) System.out.print("0");
        else {
            int chuVi = (cd + cr) * 2;
            int dienTich = cd * cr;
            System.out.print(chuVi + " " + dienTich);
        }
    }
}
