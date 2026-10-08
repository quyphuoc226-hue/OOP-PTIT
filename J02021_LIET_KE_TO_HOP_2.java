package com.example.JavaPTIT;

import java.util.Scanner;

public class J02021_LIET_KE_TO_HOP_2 {
    static int a[] = new int[20];
    static int n, k, cnt;
    public static void Try(int i){
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k){
                cnt++;
                for(int h = 1; h <= k; h++){
                    System.out.print(a[h]);
                }
                System.out.print(" ");
            }
            else Try(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        cnt = 0;
        Try(1);
        System.out.println();
        System.out.print("Tong cong co " + cnt + " to hop");
    }
}
