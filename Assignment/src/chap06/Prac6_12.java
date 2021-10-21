package chap06;

import java.util.Scanner;

class Person6_12{
    Scanner sc = new Scanner(System.in);
    private String name;
    private int num1,num2,num3;

    public Person6_12(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public boolean run() {
        System.out.print("["+name+"]"+":<Enter>");
        String s = sc.nextLine();
        boolean flag=true;
        if(s.contentEquals("")) {
            num1 = (int)(Math.random()*3+1);
            num2 = (int)(Math.random()*3+1);
            num3 = (int)(Math.random()*3+1);

            if(num1 ==num2&&num2==num3) {
                System.out.println("\t"+ num1+ "  "+num2+"  "+num3+"   "+name+"님이 이겼습니다.");
                flag = false;
            }
            else {
                System.out.println("\t"+ num1+ "  "+num2+"  "+num3+"   "+"아쉽군요!");
            }
        }
        return flag;
    }
}

public class Prac6_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int num = sc.nextInt();
        Person6_12[] player = new Person6_12[num];

        for(int i=0; i<num;i++) {
            System.out.print((i+1)+"번째 선수 이름>>");
            String name = sc.next();
            player[i] = new Person6_12(name);
        }
        boolean flag = true;
        while(flag) {
            for(int i=0;i<num;i++) {
                flag = player[i].run();
                if(flag == false) {
                    break;
                }
            }
        }
    }
}
