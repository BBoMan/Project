package chap04;

import java.util.Arrays;
import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;
    static Circle big = new Circle();
    static int index=0;

    public Circle(){
        x=0;y=0;radius=0;
    }
    public Circle(double x, double y, int radius) {
        this.x=x; this.y=y; this.radius=radius;
    }

    public void show() {
        System.out.println("(" + x + "," + y + ")" + radius);
    }

    public void Big(){
        if(this.radius > big.radius) {
            big = this;
        }
    }
}

public class Prac06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circle c [] = new Circle [3];
        for(int i=0; i<c.length ;i++){
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int r = scanner.nextInt();
            c[i] = new Circle(x, y, r);
        }

        for(int i=0; i<c.length; i++)
            c[i].Big();

        System.out.println("가장 면적이 큰 원은 ");
        Circle.big.show();
    }
}
