package chap06;

import java.util.Scanner;

public class Prac6_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        String s = sc.nextLine();

        for(int i=0;i<s.length();i++) {
            char a = s.charAt(0);
            String b = s.substring(1);
            s = b+a;
            System.out.println(s);
        }
        sc.close();
    }
}
