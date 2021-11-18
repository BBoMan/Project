package Exam10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx_07 extends JFrame {
    private JLabel la = new JLabel();
    public KeyCodeEx_07() {
        setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addKeyListener(new MyKeyListener());
        c.add(la);
        setSize(300,150);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            la.setText(e.getKeyText(e.getKeyCode()));
            Container contentPane = getContentPane();
            if(e.getKeyChar() == '%') {
                la.setText(e.getKeyText(e.getKeyCode()) + "키가 입력되었음");
                contentPane.setBackground(Color.YELLOW);
                contentPane.add(la);
            }
            else if(e.getKeyCode() == KeyEvent.VK_F1) {
                la.setText(e.getKeyText(e.getKeyCode()) + "키가 입력되었음");
                contentPane.setBackground(Color.GREEN);
                contentPane.add(la);
            }
        }
    }
    public static void main(String [] args) {
        new KeyCodeEx_07();
    }
}
