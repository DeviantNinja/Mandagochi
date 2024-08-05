import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;


public class Stage2Main {

    public static void main(String[] args)
    {
        Pet pet = new Pet();

        

    

        JFrame frame = new JFrame("title");

        JPanel mainPanel = new JPanel();
        JPanel controls = new JPanel();
        JPanel display = new JPanel();
        JPanel stats = new JPanel();

        JButton play = new JButton("Play");
        JButton feed = new JButton("Feed");
        JButton clean = new JButton("clean");

        JTextField happiness = new JTextField();
        JTextField cleanness = new JTextField();
        JTextField hungriness = new JTextField();
        JTextField tiredness = new JTextField();

    

        frame.add(mainPanel);
        frame.setSize(400, 650);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        mainPanel.setBackground(Color.DARK_GRAY);
        mainPanel.setLayout(new BorderLayout(0,0));
        mainPanel.add(display, BorderLayout.CENTER);
        mainPanel.add(controls, BorderLayout.PAGE_END);
        mainPanel.add(stats, BorderLayout.NORTH);
        
        stats.setPreferredSize(new Dimension(400,50));
        stats.setLayout(new GridLayout(1,4));
        stats.add(happiness);
        stats.add(cleanness);
        stats.add(hungriness);
        stats.add(tiredness);

        display.setBackground(Color.MAGENTA);
        display.setPreferredSize(new Dimension(400,450));
        

        controls.setBackground(Color.CYAN);
        controls.setPreferredSize(new Dimension(400,100));
        controls.setLayout(new GridLayout(1,3));
        controls.add(play);
        controls.add(feed);
        controls.add(clean);

        happiness.setText("Happiness: " + pet.getHappiness());
        hungriness.setText("Hungriness: " + pet.getHungriness());
        tiredness.setText("Tiredness: " + pet.getTiredness());
        cleanness.setText("Cleanness: " + pet.getCleanness());


        play.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pet.play();
                happiness.setText("Happiness: " + pet.getHappiness());
                hungriness.setText("Hungriness: " + pet.getHungriness());
                tiredness.setText("Tiredness: " + pet.getTiredness());
                cleanness.setText("Cleanness: " + pet.getCleanness());
                
            }
            
        });

        feed.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               pet.feed();
               happiness.setText("Happiness: " + pet.getHappiness());
               hungriness.setText("Hungriness: " + pet.getHungriness());
               tiredness.setText("Tiredness: " + pet.getTiredness());
               cleanness.setText("Cleanness: " + pet.getCleanness());
               
            }

        });

        clean.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              pet.clean();
              happiness.setText("Happiness: " + pet.getHappiness());
              hungriness.setText("Hungriness: " + pet.getHungriness());
              tiredness.setText("Tiredness: " + pet.getTiredness());
              cleanness.setText("Cleanness: " + pet.getCleanness());
              
            }
            
        });

        ActionListener gameLoop = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pet.gameTick();
                happiness.setText("Happiness: " + pet.getHappiness());
                hungriness.setText("Hungriness: " + pet.getHungriness());
                tiredness.setText("Tiredness: " + pet.getTiredness());
                cleanness.setText("Cleanness: " + pet.getCleanness());
            }
            
        };

        Timer gameLoopTimer = new Timer(5000, gameLoop);
        gameLoopTimer.start();

        

    }
}