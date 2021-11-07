package chap09;

import javax.swing.*;
import java.awt.*;

public class Prac9_02 extends JFrame {
    public Prac9_02() {
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout(5,7));
        c.add(new JButton("North"),BorderLayout.NORTH);
        c.add(new JButton("West"),BorderLayout.WEST);
        c.add(new JButton("Center"),BorderLayout.CENTER);
        c.add(new JButton("East"),BorderLayout.EAST);
        c.add(new JButton("South"),BorderLayout.SOUTH);

        setSize(400,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Prac9_02();
    }
}
