package Exam05;

class Point_01 {
    private int x, y;   //점 구성 x, y 좌표
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint() {   //점 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint_01 extends Point_01 {
    private String color;   //점 색
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {  // 컬러 점 좌표 출력
        System.out.print(color);
        showPoint();    //Point 클래스의 함수 호출
    }
}
public class ColorPointEx_01 {
    public static void main(String[] args) {
        Point_01 p = new Point_01(); //Point 객체
        p.set(1,2); //Point 클래스의 set()
        p.showPoint();

        ColorPoint_01 cp = new ColorPoint_01();
        cp.set(3,4); //Point_01의 set()
        cp.setColor("red"); //ColorPoint_01의 setColor()
        cp.showColorPoint();
    }
}