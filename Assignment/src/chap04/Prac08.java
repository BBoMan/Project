package chap04;

import java.util.Scanner;

class Phone{
    String name;
    String tel;

    public Phone(){
        name=null; tel=null;
    }
    public Phone(String n, String t){
        name = n; tel = t;
    }
    public void show(){
        System.out.println(this.name + "의 번호는 " + this.tel + " 입니다.");
    }

}

public class Prac08 {   //PhoneBook 클래스 == Prac08 클래스
    public static void main(String[] args) {
        System.out.print("인원수>>");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Phone p [] = new Phone [num];
        int count=0;

        for(int i=0; i<p.length; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            p[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while(true){
            count = 0;
            System.out.print("검색할 이름>>");
            String answer = scanner.next();
            if(answer.equals("그만"))
                break;

            for(int i=0; i<p.length; i++){
                if(answer.equals(p[i].name)) {
                    p[i].show();
                    break;
                }
                else
                    count++;
            }
            if(count == 3)
            System.out.println(answer + " 이 없습니다.");
        }
    }


}
