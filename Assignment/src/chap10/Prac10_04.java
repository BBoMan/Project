package chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Prac10_04 extends JFrame {
    JLabel label;
    String text = "Love Java";
    Prac10_04(){
        setTitle("Left 키로 문자열 바꾸기 예제"); // 제목 지정
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label= new JLabel("Love Java");

        label.addKeyListener(new MyKeyAdapter());

        label.setSize(200,50);
        add(label);
        setSize(400,200);
        setVisible(true);
        label.requestFocus();
        // 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
    }

    class MyKeyAdapter extends KeyAdapter{
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT: //<Left> 키 일때
                    label.setText(text); // text 한칸씩 앞으로 당김
                    text = text.substring(1)+text.substring(0, 1);
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Prac10_04();
    }
}
