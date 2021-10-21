package Exam06;

class Point_03 {
    int x, y;
    public Point_03(int x, int y) {
        this.x = x; this.y = y;
    }
    public boolean equals(Object obj) {
        Point_03 p = (Point_03)obj;
        if(x == p.x && y == p.y) return true;
        else return false;
    }
}

public class EqualsEx_03 {
    public static void main(String[] args) {
        Point_03 a = new Point_03(2,3);
        Point_03 b = new Point_03(2,3);
        Point_03 c = new Point_03(3,4);
        if(a == b)
            System.out.println("a==b");
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
    }
}
