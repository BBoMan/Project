package chap04;

class Rectangle{
    private int x, y, width, height, count=0;

    public Rectangle(){
        x=0; y=0; width=0; height=0;
    }
    public Rectangle(int a, int b, int w, int h){
        x=a; y=b; width=w; height=h;
    }
    public int square(){
        return width*height;
    }
    public void show(){
        System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }
    public boolean contains(Rectangle r){
        if(r.x > this.x && this.x + r.y > this.y)
            count++;
        if(r.x + r.width < this.x + this.width && r.y + r.height < this.y + this.height)
            count++;

        if(count == 2)
            return true;
        else
            return false;
    }
}

public class Prac04 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
    }
}
