package chap05;

interface Shape_5_14 {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다.");
        draw();
    }
}

class Circle_5_14 implements Shape_5_14 {
    private int radius;
    public Circle_5_14(int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("반지름이 "+radius+"인 원입니다.");
    }
    public double getArea() {
        return PI*radius*radius;
    }
}

class Oval_5_14 implements Shape_5_14 {
    private int a, b;
    public Oval_5_14(int a, int b) {
        this.a  = a;
        this.b = b;
    }
    public void draw() {
        System.out.println(a+"x"+b+"에 내접하는 타원입니다.");
    }
    public double getArea() {
        return PI*a*b;
    }
}

class Rect_5_14 implements Shape_5_14 {
    private int a, b;
    public Rect_5_14(int a, int b) {
        this.a  = a;
        this.b = b;
    }
    public void draw() {
        System.out.println(a + "x" + b + "크기의 사각형 입니다.");
    }
    public double getArea() {
        return a*b;
    }
}
public class Prac5_14 {
    public static void main(String[] args) {
        Shape_5_14[] list = new Shape_5_14[3];
        list[0] = new Circle_5_14(10);
        list[1] = new Oval_5_14(20, 30);
        list[2] = new Rect_5_14(10, 40);
        for(int i=0; i<list.length; i++) list[i].redraw();
        for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
    }
}
