package chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Prac10_06 extends JFrame {
    JLabel label;
    Prac10_06(){
        setTitle("클릭 연습용 응용프로그램");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label= new JLabel("C");
        label.setSize(100,50);
        label.setLocation(100,100);
        label.addMouseListener(new MyMouseAdapter());

        add(label);
        setSize(500,500);
        setVisible(true);
        label.requestFocus();
        // 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정

    }

    class MyMouseAdapter extends MouseAdapter{
        int x,y;
        public void mousePressed(MouseEvent e) {
            x = (int)(Math.random()*400);   //완전 끝은 안감
            y = (int)(Math.random()*400);
            label.setLocation(x,y);
        }
    }

    public static void main(String[] args) {
        new Prac10_06();
    }
}
