package chap08;

import java.io.*;
import java.util.Scanner;

public class Prac8_04 {
    public static void main(String[] args){
        System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
        try {
            Scanner fScanner = new Scanner(new FileReader("c:\\windows\\system.ini"));
            int lineNumber = 1;
            while(fScanner.hasNext()) {
                String line = fScanner.nextLine();
                System.out.printf("%4d", lineNumber++); // 행번호
                System.out.println(": "+line); // 소스 한행
            }
            fScanner.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류가 발생했습니다.");
        }
    }
}
