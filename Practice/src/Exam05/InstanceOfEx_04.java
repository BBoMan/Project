package Exam05;

class Person_04 {}
class Student_04 extends Person_04 {}
class Researcher_04 extends Person_04 {}
class Professor_04 extends Researcher_04 {}

public class InstanceOfEx_04 {
    static void print(Person_04 p) {
        if(p instanceof Person_04)
            System.out.print("Person ");
        if(p instanceof Student_04)
            System.out.print("Student ");
        if(p instanceof Researcher_04)
            System.out.print("Researcher ");
        if(p instanceof Professor_04)
            System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() ->\t");
        print(new Student_04());
        System.out.print("new Researcher() ->\t");
        print(new Researcher_04());
        System.out.print("new Professor() ->\t");
        print(new Professor_04());
    }
}
