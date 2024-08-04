import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Stage2Main {

    public static void main(String[] args)
    {

        JFrame frame = new JFrame("title");

        JPanel mainPanel = new JPanel();
        JPanel controls = new JPanel();
        JPanel display = new JPanel();

        JButton play = new JButton("Play");
        JButton feed = new JButton("Feed");
        JButton clean = new JButton("clean");

        frame.add(mainPanel);
        frame.setSize(400, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        mainPanel.setBackground(Color.DARK_GRAY);
        mainPanel.setLayout(new BorderLayout(0,0));
        mainPanel.add(display, BorderLayout.CENTER);
        mainPanel.add(controls, BorderLayout.PAGE_END);
        


        display.setBackground(Color.MAGENTA);
        display.setPreferredSize(new Dimension(400,500));
        

        controls.setBackground(Color.CYAN);
        controls.setPreferredSize(new Dimension(400,100));
        controls.setLayout(new GridLayout(1,3));
        controls.add(play);
        controls.add(feed);
        controls.add(clean);

        




    }
}