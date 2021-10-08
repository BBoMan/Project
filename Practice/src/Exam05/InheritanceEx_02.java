package Exam05;

class Person_02 {
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}

class Student_02 extends Person_02 {
    public void set() {
        age = 30;
        name = "홍길동";
        height = 175;
        //weight = 99; //private
        setWeight(99);  //함수 이용 간접 접근
    }
}

public class InheritanceEx_02 {
    public static void main(String[] args) {
        Student_02 s = new Student_02();
        s.set();

        System.out.println(s.getWeight());
    }
}
