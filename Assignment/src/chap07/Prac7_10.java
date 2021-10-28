package chap07;

import java.util.Scanner;
import java.util.Vector;

abstract class Shape7_10 {
    private Shape7_10 next;
    public Shape7_10() { next = null; }
    public void setNext(Shape7_10 obj) { next = obj; } //링크 연결
    public Shape7_10 getNext() {return next; }
    public abstract void draw();
}

class Rect7_10 extends Shape7_10 {
    public void draw() {
        System.out.println("Rect");
    }
}
class Line7_10 extends Shape7_10 {
    public void draw() {
        System.out.println("Line");
    }
}
class Circle7_10 extends Shape7_10 {
    public void draw() {
        System.out.println("Circle");
    }
}

public class Prac7_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Shape7_10> v = new Vector<Shape7_10>();
        Shape7_10 shape = null;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int select = sc.nextInt();
            switch(select) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    int choice = sc.nextInt();
                    switch(choice) {
                        case 1:
                            shape = new Line7_10();
                            break;
                        case 2:
                            shape = new Rect7_10();
                            break;
                        case 3:
                            shape = new Circle7_10();
                            break;
                    }
                    v.add(shape);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치 >> " );
                    int position = sc.nextInt();
                    if(v.size() == 0 || v.size() <= position)
                        System.out.println("삭제할 수 없습니다.");
                    else
                        v.remove(position);
                    break;
                case 3:
                    for(int i=0; i<v.size(); i++)
                        v.get(i).draw();
                    break;
                case 4:
                    System.out.println("beauty을 종료합니다.");
                    sc.close();
                    return;
            }
        }
    }
}
