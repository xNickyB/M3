package com.codebind;

import sun.jvm.hotspot.memory.Space;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;







public class SpaceTrade {

    public JPanel Panel;
    private JPanel WelcomePanel;
    private JButton WelcomeButton;
    private JLabel WelcomeSign;
    public static JFrame frame;
    public static JFrame display;
    public static JFrame config;


    private JLabel nameLabel;
    private JTextField nameField;
    private JButton hardButton;
    private JButton mediumButton;
    private JButton easyButton;
    private JLabel difficultyLabel;
    private JTextField pilotAlc;
    private JTextField fighterAlc;
    private JTextField merchantAlc;
    private JTextField engineerAlc;
    private JButton submitPointsButton;

    //protected String name;
    protected int skill;
    protected int pilotPoints;
    protected int fighterPoints;
    protected int merchantPoints;
    protected int engineerPoints;
    protected String merchanttext;
    protected String pilottext;
    protected String engineertext;
    protected String fightertext;
    public String name;


    public SpaceTrade() {
        WelcomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                config = new JFrame();
                config.setContentPane(new ConfigurationScreen1().Panel);
                frame.setVisible(false);
                config.pack();
                config.setVisible(true);
                config.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });


    }




        public static void main(String[] args) {
            frame = new JFrame("SpaceTrade");
            frame.setContentPane(new SpaceTrade().WelcomePanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }
