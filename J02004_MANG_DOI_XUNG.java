package com.example.JavaPTIT;
import java.util.Scanner;
public class J02004_MANG_DOI_XUNG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            boolean ok = true;
            int i = 0, j = n - 1;
            while(i < j){
                if(a[i] != a[j]) ok = false;
                i++;
                j--;
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
