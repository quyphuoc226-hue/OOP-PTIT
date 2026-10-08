package com.example.JavaPTIT;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class J03017_LOAI_BO_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String str = sc.nextLine();
            Deque<Character> stack = new ArrayDeque<>();
            int ans = 0;
            for(int i = str.length() - 1; i >= 0; i--){
                if(str.charAt(i) == '0') stack.push(str.charAt(i));
                else if(stack.size() >= 2){
                    char a = stack.pop();
                    char b = stack.pop();
                    if(a == '0' && b == '0') ans += 3;
                    else {
                        stack.push(a);
                        stack.push(b);
                    }
                }


            }
        }
    }


}
