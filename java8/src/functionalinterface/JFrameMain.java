package functionalinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class JFrameMain {

        public static void main(String[] args) {

            JFrame frame = new JFrame("My Window");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400,400);
            frame.setLayout(new FlowLayout());

            JButton button = new JButton("Click Me");
            button.addActionListener(e -> {
                System.out.println("Button Clicked!");
                JOptionPane.showMessageDialog(frame, "Hello World!", "Message", JOptionPane.INFORMATION_MESSAGE);
            });

            //here we cant use lambda
            button.addMouseMotionListener(new MouseMotionListener() {
                @Override
                public void mouseDragged(MouseEvent e) {

                }

                @Override
                public void mouseMoved(MouseEvent e) {

                }
            });

            frame.add(button);

            frame.setVisible(true);

        }
}
