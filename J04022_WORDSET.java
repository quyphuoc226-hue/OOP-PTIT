package com.example.JavaPTIT;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet{
    private String noiDung;

    public WordSet(String noiDung){
        this.noiDung = noiDung;
    }

    public String union(WordSet a){
        Set<String> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        sb.append(this.noiDung).append(" ").append(a.noiDung);
        String[] temp = sb.toString().split(" ");
        for(String x : temp){
            set.add(x.toLowerCase());
        }
        StringBuilder sb1 = new StringBuilder();
        for(String x : set){
            sb1.append(x).append(" ");
        }
        return sb1.toString();
    }

    public String intersection(WordSet a){
        StringBuilder sb = new StringBuilder();
        String[] temp1 = this.noiDung.split(" ");
        Set<String> set1 = new TreeSet<>();
        for(String x : temp1) set1.add(x.toLowerCase());
        String[] temp2 = a.noiDung.split(" ");
        Set<String> set2 = new TreeSet<>();
        for(String x : temp2) set2.add(x.toLowerCase());
        for(String x : set1){
            if(set2.contains(x)) sb.append(x).append(" ");
        }
        return sb.toString();
    }
}
public class J04022_WORDSET {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
