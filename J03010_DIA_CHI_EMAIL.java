package com.example.JavaPTIT;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class J03010_DIA_CHI_EMAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> ds = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            String s = sc.nextLine();
            String[] temp = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            sb.append(temp[temp.length - 1].toLowerCase());
            for(int j = 0; j < temp.length - 1; j++){
                sb.append(temp[j].toLowerCase().charAt(0));
            }
            String email = sb.toString();
            int so = map.getOrDefault(email, 0);
            if(so == 0) System.out.println(email + "@ptit.edu.vn");
            else System.out.println(email + (so + 1) + "@ptit.edu.vn");
            map.put(email, so + 1);
        }

    }
}
