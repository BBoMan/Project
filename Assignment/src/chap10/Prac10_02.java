package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prac10_02 extends JFrame {
    JPanel contentPane = new JPanel();
    public Prac10_02(){
        setTitle("드래깅동안 YELLO");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(contentPane);
        contentPane.setBackground(Color.GREEN);
        // JPanel에 MouseMotionListener 추가
        contentPane.addMouseMotionListener(new MyMouseMotionAdapter());
        // JPanel에 MouseListener 추가
        contentPane.addMouseListener(new MyMouseAdapter2());
        setSize(400,200);
        setVisible(true);
    }

    class MyMouseMotionAdapter extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e) {
            // 마우스가 드래그되는 동안
            contentPane.setBackground(Color.YELLOW);
        }
    }
    class MyMouseAdapter2 extends MouseAdapter{
        public void mouseReleased(MouseEvent e) {
            // 눌러진 마우스 버튼이 떼어질 때
            contentPane.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Prac10_02();
    }
}
