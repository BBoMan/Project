package chap04;

import java.util.Scanner;

class Dictionary {
    private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String [] eng = { "love", "baby", "money", "future", "hope" };

    public static String kor2Eng(String word) {
        int count = 0;
        String answer = null;
        for(int i=0; i<kor.length; i++){
            if(kor[i].equals(word)) {
                answer = eng[i];
                break;
            }
            else
                count++;
        }
        if(count==kor.length)
            return "는 저의 사전에 없습니다.";
        else
            return "은 " + answer;
    }
}
public class Prac10 {   //Prac10 == DicApp
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true){
            System.out.print("한글 단어?");
            String kor = scanner.next();

            if(kor.equals("그만"))
                break;

            System.out.println(kor + Dictionary.kor2Eng(kor));
        }
    }
}
