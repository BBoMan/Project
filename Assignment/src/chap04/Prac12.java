package chap04;

import java.util.Scanner;

class Seat {
    String DefaultSeat[] = {"--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- "};
    private static String [][] SeatClass = new String[3][10]; //0=s, 1=a, 2=b

    public Seat(){
        for(int i=0; i<SeatClass.length; i++)
            SeatClass[i] = DefaultSeat.clone();
    }
    public void ShowSeat(int n) {
        if(n == 1){
            System.out.print("S>> ");
            for(int i=0;i<SeatClass[0].length;i++)
                System.out.print(SeatClass[0][i]);
            System.out.println();
        }
        else if(n == 2){
            System.out.print("A>> ");
            for(int i=0;i<SeatClass[1].length;i++)
                System.out.print(SeatClass[1][i]);
            System.out.println();
        }
        else if(n == 3){
            System.out.print("B>> ");
            for(int i=0;i<SeatClass[2].length;i++)
                System.out.print(SeatClass[2][i]);
            System.out.println();
        }
        else{
            System.out.println("없는 좌석타입입니다.");
        }
    }

    public void Book(int type, String name ,int num) {
        if(SeatClass[type-1][num-1].equals("--- "))
            SeatClass[type-1][num-1] = name + " ";
    }

    public void Cancel(int type, String name) {
        int count = 0;
        for(int i=0; i<SeatClass[type-1].length; i++){
            if(name.equals(SeatClass[type-1][i])){
                SeatClass[type-1][i] = "--- ";
                //System.out.println("삭제완료");
            }

        }
    }
}
public class Prac12 {   //콘서트홀 예약
    public static void main(String[] args) {

        Seat s = new Seat();

        int select;

        Scanner scanner = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");

        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            select = scanner.nextInt();

            if(select == 1){
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                int TypeSeat = scanner.nextInt();
                s.ShowSeat(TypeSeat);
                System.out.print("이름>>");
                String name = scanner.next();
                System.out.print("번호>>");
                int SeatNum = scanner.nextInt();

                s.Book(TypeSeat, name, SeatNum);
            }
            else if(select == 2){
                for(int i=0; i<3;i++)
                    s.ShowSeat(i+1);
                System.out.println("<<<조회를 완료하였습니다.>>>");
            }
            else if(select == 3){
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                int TypeSeat = scanner.nextInt();
                s.ShowSeat(TypeSeat);
                System.out.print("이름>>");
                String name = scanner.next();

                s.Cancel(TypeSeat, name + " ");
            }
            else if(select == 4)
                break;
            else
                System.out.println("없는 메뉴입니다.");
        }

    }
}
