package chap07;

import java.util.*;

class Word7_12 {
    private String english;
    private String korean;
    public Word7_12(String english, String korean) {
        this.english = english;
        this.korean = korean;
    }
    public String getEnglish() { return english; }
    public String getKorean() { return korean; }
}

public class Prac7_12 {
    public static void main(String[] args) {
        String name = "명품영어";
        Scanner sc = new Scanner(System.in);
        Vector<Word7_12> v;

        v = new Vector<Word7_12>();
        v.add(new Word7_12("love", "사랑"));
        v.add(new Word7_12("animal", "동물"));
        v.add(new Word7_12("emotion", "감정"));
        v.add(new Word7_12("human", "인간"));
        v.add(new Word7_12("stock", "주식"));
        v.add(new Word7_12("trade", "거래"));
        v.add(new Word7_12("society", "사회"));
        v.add(new Word7_12("baby", "아기"));
        v.add(new Word7_12("honey", "애인"));
        v.add(new Word7_12("dall", "인형"));
        v.add(new Word7_12("bear", "곰"));
        v.add(new Word7_12("picture", "사진"));
        v.add(new Word7_12("painting", "그림"));
        v.add(new Word7_12("fault", "오류"));
        v.add(new Word7_12("example", "보기"));
        v.add(new Word7_12("eye", "눈"));
        v.add(new Word7_12("statue", "조각상"));

        System.out.println("**** 영어 단어 테스트 프로그램 \"" + name + "\" 입니다. ****");
        while(true) {
            System.out.print("단어 테스트:1, 단어 삽입:2. 종료:3>> ");
            try {
                int menu = sc.nextInt();
                if(menu == 1) {
                    System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
                    while(true) {
                        int answerIndex = (int)(Math.random()*v.size());
                        String eng = v.get(answerIndex).getEnglish();

                        int example[] = new int [4];
                        int index;
                        boolean exists;

                        for(int i=0; i<example.length; i++) {
                            do {
                                index = (int)(Math.random()*v.size());
                                for(int j=0; j<example.length; j++) {
                                    if(example[j] == index)
                                        exists = true;
                                }
                                exists = false;
                            }
                            while(index == answerIndex || exists); // 다시 시도
                            example[i] = index;
                        }
                        int answerLoc = (int)(Math.random()*example.length);
                        example[answerLoc] = answerIndex;

                        System.out.println(eng + "?");

                        // 보기 모두 출력
                        for(int i=0; i<example.length; i++)
                            System.out.print("(" + (i+1) + ")" + v.get(example[i]).getKorean() + " ");


                        // 정답을 입력받을 프롬프트 출력
                        System.out.print(":>");
                        try {
                            int in = sc.nextInt(); //정답 입력
                            if(in == -1)
                                break; //단어 테스트 끝

                            in--;
                            if(in == answerLoc)
                                System.out.println("Excellent !!");
                            else
                                System.out.println("No. !!");
                        }
                        catch(InputMismatchException e) {
                            sc.next();
                            System.out.println("숫자를 입력하세요 !!");
                        }
                    }
                }

                else if(menu == 2) {
                    System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
                    while(true) {
                        System.out.print("영어 한글 입력 >> ");
                        String engWord = sc.next(); // 영어 단어 읽기
                        if(engWord.equals("그만"))
                            break;

                        String korWord = sc.next(); // 한글 단어 읽기
                        v.add(new Word7_12(engWord, korWord));
                    }
                }
                else if(menu == 3) {
                    System.out.println("\"" + name + "\"를 종료합니다.");
                    break;
                }
                else{
                    System.out.println("잘못 입력하였습니다.");
                }
            }
            catch(InputMismatchException e) {
                sc.next();
                System.out.println("숫자를 입력하세요 !!");
            }
            System.out.println();
        }
        sc.close();
    }
}
