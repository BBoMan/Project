package Exam05;

class Shape_05 {
    public Shape_05 next;
    public Shape_05() {
        next = null;
    }
    public void draw() {
        System.out.println("Shape");
    }
}

class Line_05 extends Shape_05 {
    public void draw() {
        System.out.println("Line");
    }
}

class Rect_05 extends Shape_05 {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle_05 extends Shape_05 {
    public void draw() {
        System.out.println("Circle");
    }
}

public class MethodOverridingEx_05 {
    static void paint(Shape_05 p) {
        p.draw();
    }

    public static void main(String[] args) {
        Line_05 line = new Line_05();
        paint(line);
        paint(new Shape_05());
        paint(new Line_05());
        paint(new Rect_05());
        paint(new Circle_05());
    }
}
