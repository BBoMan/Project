package chap06;

import java.util.Calendar;
import java.util.Scanner;

class Timer6_06{
    Scanner sc = new Scanner(System.in);
    private int sec;
    private int sec2;
    private int result;
    private String name;
    public Timer6_06(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void TimerStop(int sec2) {
        System.out.println("\t현재 초 시간 = "+sec2);
        if(sec2<sec) {
            result = sec2+60-sec;
        }else {
            result = sec2-sec;
        }
    }

    public void setTimer() {
        this.sec = Calendar.getInstance().get(Calendar.SECOND);
        System.out.println("\t현재 초 시간 = "+sec);
    }

    public int getResult() {
        return result;
    }

    public void run() {
        String s;    //엔터입력 받는 변수
        System.out.print(getName()+" 시작 <Enter>키>>");
        s = sc.nextLine();    //엔터 입력 포함 문자를 받는다.
        if(s.contentEquals("")) {
            setTimer();
        }

        System.out.print("10초 예상 후 <Enter>키>>");
        s = sc.nextLine();
        if(s.contentEquals("")) {
            sec2 = Calendar.getInstance().get(Calendar.SECOND);
            TimerStop(sec2);
        }
    }
}

public class Prac6_06 {
    public static void main(String[] args) {
        Timer6_06 t1 = new Timer6_06("황기태");
        Timer6_06 t2 = new Timer6_06("이재문");
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        t1.run();
        t2.run();
        if(Math.abs(10-t1.getResult()) < Math.abs(10-t2.getResult())) {    //t1 이 이겼을때
            System.out.println(t1.getName()+"의 결과 "+t1.getResult()+", "+
                    t2.getName()+"의 결과 "+t2.getResult()+", 승자는"+ t1.getName() );
        }else if(Math.abs(10-t1.getResult()) > Math.abs(10-t2.getResult())) {
            System.out.println(t1.getName()+"의 결과 "+t1.getResult()+", "+
                    t2.getName()+"의 결과 "+t2.getResult()+", 승자는"+ t2.getName() );
        }else {
            System.out.println(t1.getName()+"의 결과 "+t1.getResult()+", "+
                    t2.getName()+"의 결과 "+t2.getResult()+", 비겼습니다" );
        }
    }
}
