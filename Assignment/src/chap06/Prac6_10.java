package chap06;

import java.util.Scanner;

class Person6_10{
    Scanner sc = new Scanner(System.in);
    private String name;
    private int num1,num2,num3;

    public Person6_10(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean run() {
        System.out.print("[" + name + "]" + ":<Enter>");
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

public class Prac6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 선수 이름>>");
        String player1 = sc.next();
        System.out.print("2번째 선수 이름>>");
        String player2 = sc.next();

        Person6_10[] player = new Person6_10[2];
        player[0] = new Person6_10(player1);
        player[1] = new Person6_10(player2);

        boolean flag=true;
        while(flag) {
            for(int i=0; i<2;i++) {
                flag = player[i].run();
                if(flag == false) {
                    break;
                }
            }
        }
    }
}
