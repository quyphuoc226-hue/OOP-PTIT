package com.example.JavaPTIT;

import java.util.Scanner;

class Point{
    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double khoangCach(Point a){
        return Math.sqrt((a.x - this.x) * (a.x - this.x) + (a.y - this.y) * (a.y - this.y));
    }
}
public class J04001_KHAI_BAO_LOP_POINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point a = new Point();
            Point b = new Point();

            a.setX(sc.nextDouble());
            a.setY(sc.nextDouble());

            b.setX(sc.nextDouble());
            b.setY(sc.nextDouble());

            System.out.printf("%.4f\n", a.khoangCach(b));
        }
    }
}
