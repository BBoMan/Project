package chap06;

class Circle6_02{
    private int x,y,r;

    public Circle6_02(int x,int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public String toString() {
        return "Circle(" + x + "," + y + ")반지름" + r;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public boolean equals(Object obj) {
        if(this.x == ((Circle6_02) obj).getX() && this.y == ((Circle6_02) obj).getY())    //받은 객체를 Circle6_02로
            return true;
        else
            return false;
    }
}

public class Prac6_02 {
    public static void main(String[] args) {
        Circle6_02 a = new Circle6_02(2,3,5);
        Circle6_02 b = new Circle6_02(2,3,30);
        System.out.println("원 a : "+ a);
        System.out.println("원 b : "+ b);
        if(a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("다른 원");
    }
}
