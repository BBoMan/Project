package Exam06;

class Rect_04 {
    int width;
    int height;
    public Rect_04(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public boolean equals(Object obj) {
        Rect_04 p = (Rect_04)obj;
        if (width*height == p.width*p.height)
            return true;
        else
            return false;
    }
}

public class EqualsEx_04 {
    public static void main(String[] args) {
        Rect_04 a = new Rect_04(2,3);
        Rect_04 b = new Rect_04(3,2);
        Rect_04 c = new Rect_04(3,4);
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
        if(b.equals(c))
            System.out.println("b is equal to c");
    }
}
