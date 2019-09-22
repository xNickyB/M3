package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigurationScreen1 {
    private JLabel nameLabel;
    private JTextField nameField;
    private JPanel Panel;
    private JButton hardButton;
    private JButton mediumButton;
    private JButton easyButton;
    private JLabel difficultyLabel;
    private JTextField pilotAlc;
    private JTextField fighterAlc;
    private JTextField merchantAlc;
    private JTextField engineerAlc;

    public String name;
    public int skill;

    public ConfigurationScreen1() {
        easyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (easyButton.isSelected()) {
                    skill = 100;
                    String skillPoints = "You have 100 points to allocate; Changing difficulty changes point numbers.";
                }
            }
        });
        mediumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mediumButton.isSelected()) {
                    skill = 50;
                    String skillPoints = "You have 50 points to allocate";
                }
            }
        });
        hardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hardButton.isSelected()) {
                    skill = 15;
                    String skillPoints = "You have 15 points to allocate";
                }
            }
        });
        pilotAlc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = pilotAlc.getText();
                int pilotPoints = Integer.parseInt(text);
            }
        });
        fighterAlc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = fighterAlc.getText();
                int fighterPoints = Integer.parseInt(text);
            }
        });
        merchantAlc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = merchantAlc.getText();
                int merchantPoints = Integer.parseInt(text);
            }
        });
        engineerAlc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = engineerAlc.getText();
                int engineerPoints = Integer.parseInt(text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ConfigurationScreen");
        frame.setContentPane(new ConfigurationScreen1().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

