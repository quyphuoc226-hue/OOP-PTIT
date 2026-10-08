package com.example.JavaPTIT;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class IntSet{
    private int[] phanTu;
    private int soLuong;

    public IntSet(int[] a){
        this.soLuong = a.length;
        this.phanTu = new int[this.soLuong];
        for(int i = 0; i < this.soLuong; i++){
            this.phanTu[i] = a[i];
        }
    }

    public IntSet union(IntSet a){
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < this.soLuong; i++){
            set.add(this.phanTu[i]);
        }
        for(int i = 0; i < a.soLuong; i++){
            set.add(a.phanTu[i]);
        }
        int[] A = new int[set.size()];
        int i = 0;
        for(int x : set){
            A[i++] = x;
        }
        IntSet temp = new IntSet(A);
        return temp;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int x : phanTu){
            sb.append(x).append(" ");
        }
        return sb.toString();
    }
}
public class J04021_LOP_INTSET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
