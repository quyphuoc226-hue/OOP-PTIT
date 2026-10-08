package com.example.JavaPTIT;

import java.util.Scanner;

class Point2{
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

    public double khoangCach(Point2 a){
        return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
    }
}
public class J04009_DIEN_TICH_TAM_GIAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point2 a = new Point2();
            Point2 b = new Point2();
            Point2 c = new Point2();

            a.setX(sc.nextDouble());
            a.setY(sc.nextDouble());

            b.setX(sc.nextDouble());
            b.setY(sc.nextDouble());

            c.setX(sc.nextDouble());
            c.setY(sc.nextDouble());

            double ab = a.khoangCach(b);
            double ac = a.khoangCach(c);
            double bc = b.khoangCach(c);

            if(ab + ac <= bc || ab + bc <= ac || ac + bc <= ab){
                System.out.println("INVALID");
            }
            else {
                double p = (ab + ac + bc) / 2.0;
                double s = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
                System.out.printf("%.2f\n", s);
            }
        }
    }
}
