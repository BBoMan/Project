package Exam06;

class Point_02 {
    int x, y;
    public Point_02(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}

public class ToStringEx_02 {
    public static void main(String [] args) {
        Point_02 p = new Point_02(2,3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p + "입니다.");
    }
}
