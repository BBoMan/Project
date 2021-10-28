package Exam07;

import java.util.Vector;
class Point_02 {
    private int x, y;
    public Point_02(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class PointVectorEx_02 {
    public static void main(String[] args) {

        Vector<Point_02> v = new Vector<Point_02>();

        v.add(new Point_02(2, 3));
        v.add(new Point_02(-5, 20));
        v.add(new Point_02(30, -8));
        v.remove(1);

        for(int i=0; i<v.size(); i++) {
            Point_02 p = v.get(i);
            System.out.println(p);
        }
    }
}
