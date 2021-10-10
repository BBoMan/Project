package chap05;

import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDesString();
    protected double ratio;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDesString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDesString() + "입니다");
    }
}

class Km2Mile extends Converter {
    double mag;

    @Override
    protected double convert(double src) {
        return src/mag;
    }
    @Override
    protected String getSrcString() {
        return "Km";
    }
    @Override
    protected String getDesString() {
        return "Mile";
    }
    public Km2Mile() {
        System.out.println("입력오류");
    }
    public Km2Mile(double s) {
        mag = s;
    }
}

public class Prac5_04 {
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}
