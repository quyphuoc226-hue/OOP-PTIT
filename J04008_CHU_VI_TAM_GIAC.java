package com.example.JavaPTIT;

import java.util.Scanner;

class Point1{
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

    public double khoangCach(Point1 a){
        return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
    }

}
public class J04008_CHU_VI_TAM_GIAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point1 a = new Point1();
            Point1 b = new Point1();
            Point1 c = new Point1();

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
                System.out.printf("%.3f\n", ab + ac + bc);
            }
        }
    }
}
