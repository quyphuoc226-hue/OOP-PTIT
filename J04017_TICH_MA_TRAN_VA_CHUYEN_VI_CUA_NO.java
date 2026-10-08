package com.example.JavaPTIT;

import java.util.Scanner;

class Matrix{
    private int n, m;
    private int[][] duLieu;
    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
        this.duLieu = new int[n][m];
    }

    public void nextMatrix(Scanner sc){
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++){
                this.duLieu[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix trans(){
        Matrix temp = new Matrix(this.m, this.n);
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++){
                temp.duLieu[j][i] = this.duLieu[i][j];
            }
        }
        return temp;
    }

    public Matrix mul(Matrix a){
        Matrix temp = new Matrix(this.n, a.m);
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < a.m; j++){
                temp.duLieu[i][j] = 0;
                for(int k = 0; k < this.m; k++){
                    temp.duLieu[i][j] += this.duLieu[i][k] * a.duLieu[k][j];
                }
            }
        }
        return temp;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++){
                sb.append(this.duLieu[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class J04017_TICH_MA_TRAN_VA_CHUYEN_VI_CUA_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n,m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }
}
