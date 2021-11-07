package chap09;

import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel {
    public NorthPanel() {
        setBackground(Color.LIGHT_GRAY);
        setLayout(new FlowLayout());
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}

class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(null);
        for (int i = 0; i < 10; i++) {
            JLabel jl = new JLabel("*");
            int x = (int) (Math.random() * 250);
            int y = (int) (Math.random() * 150);
            jl.setLocation(x, y);
            jl.setSize(20, 20);
            jl.setForeground(Color.red);
            add(jl);
        }
    }
}
class SouthPanel extends JPanel {
    public SouthPanel() {
        setBackground(Color.YELLOW);
        setLayout(new FlowLayout());
        add(new JButton("Word Input"));
        add(new JTextField(15));
    }
}

public class Prac9_08 extends JFrame {
    public Prac9_08() {
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(),BorderLayout.CENTER);
        c.add(new SouthPanel(), BorderLayout.SOUTH);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Prac9_08();
    }
}
