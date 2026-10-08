package com.example.JavaPTIT;

import java.util.Scanner;
class Matrix{
    private int hang, cot;
    private int[][] duLieu;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < this.hang; i++){
            for(int j = 0; j < this.cot; j++){
                sb.append(this.duLieu[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public Matrix(int n, int m){
        this.hang = n;
        this.cot = m;
        this.duLieu = new int[n][m];
    }
    public void nextMatrix(Scanner sc){
        for(int i = 0; i < this.hang; i++){
            for(int j = 0; j < this.cot; j++){
                duLieu[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix mul(Matrix a){
        Matrix temp = new Matrix(this.hang, a.cot);
        for(int i = 0; i < this.hang; i++){
            for(int j = 0; j < a.cot; j++){
                temp.duLieu[i][j] = 0;
                for(int k = 0; k < this.cot; k++){
                    temp.duLieu[i][j] += this.duLieu[i][k] * a.duLieu[k][j];
                }
            }
        }
        return temp;
    }
}
public class J04016_TICH_HAI_DOI_TUONG_MA_TRAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
