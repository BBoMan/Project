package chap05;

class TV {
    private int size;
    public TV(int size) {
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}

class IPTV extends TV {

    private String adress;
    private int color;

    public IPTV(String a, int s, int c) {
        super(s);
        this.adress = a;
        this.color = c;
    }

    public void printProperty() {
        System.out.println("나의 IPTV는 " + adress + " 주소의 " +
                getSize() + "인치 " + color + "컬러");
    }
}


public class Prac5_02 {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);    //192.1.1.2 주소에 32인치 2048컬러

        iptv.printProperty();
    }
}
