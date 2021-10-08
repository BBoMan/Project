package Exam05;

class Point_03 {
    private int x, y;
    public Point_03() {
        this.x = this.y = 0;
    }
    public Point_03(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint() {   //점 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint_03 extends Point_03 {
    private String color;
    public ColorPoint_03(int x, int y, String color) {
        super(x, y);    //Point_03(x, y) 호출
        this.color = color;
    }
    public void showColorPoint() {  //컬러 점 좌표 출력
        System.out.print(color);
        showPoint();
    }
}

public class SuperEx_03 {
    public static void main(String[] args) {
        ColorPoint_03 cp = new ColorPoint_03(5, 6, "blue");
        cp.showColorPoint();
    }
}
