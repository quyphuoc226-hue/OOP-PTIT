package com.example.JavaPTIT;

import java.util.Scanner;

class Point{
    private double x;
    private double y;
    public Point(){
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc){
        Point p = new Point();
        p.x = sc.nextDouble();
        p.y = sc.nextDouble();
        return p;
    }
    public double khoangCach(Point a){
        return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
    }
}
class Triangle{
    private Point a, b, c;
    private double chuVi;
    public Triangle(){

    }
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean valid(){
        double AB = a.khoangCach(b);
        double AC = a.khoangCach(c);
        double BC = b.khoangCach(c);
        if(AB + AC <= BC || AB + BC <= AC || AC + BC <= AB) return false;
        return true;
    }
    public Triangle getPerimeter(){
        Triangle A = new Triangle();
        double AB = a.khoangCach(b);
        double AC = a.khoangCach(c);
        double BC = b.khoangCach(c);
        A.chuVi = AB + AC + BC;
        return A;
    }
    @Override
    public String toString(){
        return String.format("%.3f", chuVi);
    }
}
public class J04019_LOP_TRIANGLE_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }

}

