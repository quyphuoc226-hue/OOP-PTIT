package com.example.JavaPTIT;

import java.util.Scanner;
class Pair<T extends Number, U extends Number>{
    T first;
    U second;
    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
    public boolean isPrime(){
        J04020_LOP_PAIR.sang();
        if(J04020_LOP_PAIR.prime[first.intValue()] == 1 && J04020_LOP_PAIR.prime[second.intValue()] == 1) return true;
        return false;
    }

    @Override
    public String toString(){
        return String.format("%d %d\n", first.intValue(), second.intValue());
    }
}
public class J04020_LOP_PAIR {
    static boolean dasang = false;
    static int MAX = 1000005;
    static int[] prime = new int[MAX];
    public static void sang(){
        if(dasang) return;
        for(int i = 0; i < MAX; i++){
            prime[i] = 1;
        }
        prime[0] = 0;
        prime[1] = 0;
        for(int i = 2; i * i < MAX; i++){
            if(prime[i] == 1){
                for(int j = i * i; j < MAX; j+= i){
                    prime[j] = 0;
                }
            }
        }
        dasang = true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
