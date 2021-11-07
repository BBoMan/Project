package Exam09;

import javax.swing.*;

public class MyFrame_01 extends JFrame {
    public MyFrame_01() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300); // 프레임 크기 300x300
        setVisible(true); // 프레임 출력
    }
    public static void main(String[] args) {
        MyFrame_01 frame = new MyFrame_01();
    }
}
