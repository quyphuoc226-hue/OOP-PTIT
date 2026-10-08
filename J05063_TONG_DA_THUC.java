package com.example.JavaPTIT;

import java.util.*;

class DaThuc{
    String str;
    public DaThuc(String str){
        this.str = str;
    }
    public DaThuc cong(DaThuc a){
        String[] temp1 = this.str.split(" \\+ ");
        String[] temp2 = a.str.split(" \\+ ");
        Map<Integer, Integer> map = new HashMap<>();
        for(String x : temp1){
            String[] A = x.split("\\*x\\^");
            int mu = Integer.parseInt(A[1]);
            int heso = Integer.parseInt(A[0]);
            map.put(mu, heso);
        }
        for(String x : temp2){
            String A[] = x.split("\\*x\\^");
            int mu = Integer.parseInt(A[1]);
            int heso = Integer.parseInt(A[0]);
            map.put(mu, map.getOrDefault(mu, 0) + heso);
        }
        ArrayList<Integer> dsmu = new ArrayList<>(map.keySet());
        dsmu.sort(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int x : dsmu){
            int heso = map.get(x);
            sb.append(heso).append("*x^").append(x).append(" + ");
        }
        DaThuc ans = new DaThuc("");
        ans.str = sb.toString().substring(0, sb.toString().length() - 3);
        return ans;
    }
    public String toString(){
        return this.str;
    }
}
public class J05063_TONG_DA_THUC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
