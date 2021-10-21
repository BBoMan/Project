package Exam06;

class Point_01 {
    int x, y;

    public Point_01(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class ObjectPropertyEx_01 {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName()); // 클래스 이름
        System.out.println(obj.hashCode()); // 해시 코드 값
        System.out.println(obj.toString());
        System.out.println(obj);
    }
    public static void main(String [] args) {
        Point_01 p = new Point_01(2,3);
        print(p);
    }
}
